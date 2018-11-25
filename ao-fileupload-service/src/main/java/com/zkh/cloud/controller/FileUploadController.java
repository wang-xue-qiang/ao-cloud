package com.zkh.cloud.controller;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.zkh.cloud.bean.RespondResult;
import com.zkh.cloud.service.UploadFileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value = "FileUploadController", description = "上传文件Api")
@CrossOrigin
@RestController
public class FileUploadController {
	@Autowired
	private UploadFileService uploadFileService;
	
  /**
   * 上传文件
   * 测试方法：
   * 有界面的测试：http://39.105.200.153:8050/index.html
   * 使用命令：curl -F "file=@文件全名" 39.105.200.153:8050/upload
   * ps.该示例比较简单，没有做IO异常、文件大小、文件非空等处理
   * @param file 待上传的文件
   * @return 文件在服务器上的绝对路径
   * @throws IOException IO异常
   */
/*  @RequestMapping(value = "/upload", method = RequestMethod.POST)
  public @ResponseBody String handleFileUpload(@RequestParam(value = "file", required = true) MultipartFile file) throws IOException {
    byte[] bytes = file.getBytes();
    File fileToSave = new File(file.getOriginalFilename());
    FileCopyUtils.copy(bytes, fileToSave);
    return fileToSave.getAbsolutePath();
  }*/
  
	@ApiOperation(value = "上传图片", notes = "上传图片")
	@RequestMapping(value = "/upload", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String uploadImage(@RequestParam(value = "file", required = true) MultipartFile file,
			 						 @RequestParam(value = "uid",defaultValue="1") String uid) {		
		RespondResult result = uploadFileService.uploadImage(uid, file);
		return result.getMsg();
	}

  
}