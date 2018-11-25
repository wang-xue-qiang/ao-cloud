package com.zkh.cloud.service;
import java.util.Date;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

import com.zkh.cloud.bean.MessageCode;
import com.zkh.cloud.dao.MessageCodeMapper;
import com.zkh.cloud.utils.Constants;
import com.zkh.cloud.utils.StringUtils;
/**
 * 
 * @Description:监听注册消息发送邮件或短信
 * @author wangxueqiang
 * @date 2018年11月23日 上午10:12:01
 *
 */
@Component
public class MessageCodeService {
	
	@Autowired
	private MessageCodeMapper messageCodeMapper;
	
	@Autowired
	private JavaMailSenderImpl mailSender;

	@RabbitListener(queues=Constants.REGISTERUSER_QUEUE)  //监听器监听指定的Queue 
	public void processC(String  sendTo){
		try {
			if(StringUtils.isNotEmpty(sendTo)){
				//调用接口发送邮件
				if(StringUtils.checkEmail(sendTo)){
					String code = StringUtils.randomCode();
					SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
					//设置收件人，发送人，标题，文字
					simpleMailMessage.setFrom(Constants.EMAIL_FROM);
					simpleMailMessage.setTo(sendTo);
					simpleMailMessage.setSubject(Constants.EMAIL_SUBJECT);
					simpleMailMessage.setText(Constants.EMAIL_TEXT+code);
					mailSender.send(simpleMailMessage);
					//记录日志
					MessageCode vo = new MessageCode(sendTo,null,code,new Date());
					messageCodeMapper.insert(vo);
				}
			}else{
				System.err.println("==============>"+sendTo);
			}	
		} catch (Exception e) {
			System.err.println("==============>异常处理写库");
		}
	}

}
