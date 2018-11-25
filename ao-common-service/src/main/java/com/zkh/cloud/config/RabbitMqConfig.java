package com.zkh.cloud.config;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zkh.cloud.constant.Constants;

/**
 * 
 * @Description: 配置消息對列，采用的是Direct交换机模式需要在配置Queue的时候，指定一个键，使其和交换机绑定
 * @author wangxueqiang
 * @date 2018年11月23日 上午9:28:45
 *
 */
@Configuration
public class RabbitMqConfig {

	@Bean
	public Queue queue() {
		return new Queue(Constants.REGISTERUSER_QUEUE);
	}

}
