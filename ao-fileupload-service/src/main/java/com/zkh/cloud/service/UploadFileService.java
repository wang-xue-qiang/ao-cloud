package com.zkh.cloud.service;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.bean.UploadFile;
import com.zkh.cloud.constant.Constants;
import com.zkh.cloud.dao.UploadFileMapper;
import com.zkh.cloud.exeception.ExceptionUtil;
import com.zkh.cloud.oos.OssUtils;
import com.zkh.cloud.utils.string.IdGen;
/**
 * 
 * @Description:文件上传接口
 * @author wangxueqiang
 * @date 2018年11月24日 下午11:25:39
 *
 */
@Service
@Transactional(readOnly = true)
public class UploadFileService {
	@Autowired
	private UploadFileMapper uploadFileMapper;
	/**
	 * 
	 * @Description: 上传图片或excel
	 * @param params
	 * @return
	 * @author wangxueqiang
	 * @date 2018年11月24日 下午11:27:41
	 *
	 */
	@Transactional(readOnly = false)
	public RespondResult uploadImage(String uid, MultipartFile file){
		try{
			String fileName = file.getOriginalFilename();
			boolean success = OssUtils.update(fileName, file.getInputStream());
			if (success) {
				String url = Constants.ALIWEBSIT +"/"+ fileName;
				uploadFileMapper.insert(new UploadFile(IdGen.uuid() ,url,uid,Constants.UPLOAD_IMAGES,new Date()));
				return RespondResult.ok(url);
			}else{
				return RespondResult.build(500, "上传图片失败");
			}
		}catch (Exception e) {
			e.printStackTrace();
			return RespondResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
