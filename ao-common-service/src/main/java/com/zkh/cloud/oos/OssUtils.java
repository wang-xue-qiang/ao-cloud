package com.zkh.cloud.oos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.DeleteObjectsRequest;
import com.aliyun.oss.model.DeleteObjectsResult;
import com.aliyun.oss.model.OSSObject;
import com.zkh.cloud.constant.Constants;

/**
 * 
 * @Description:阿里云一期接口迁过来
 * @author wangxueqiang
 * @date 2018年8月24日 下午2:48:51
 *
 */
public class OssUtils {
	public static boolean update(String name, InputStream inputStream) {
		OSS oss = new OSSClientBuilder().build(Constants.ALENDPOINT, Constants.ALIYID, Constants.ALIYKEY);
		try {
			// 先删除
			 boolean found = oss.doesObjectExist(Constants.ALIBULK, name);
			 if(found){ oss.deleteObject(Constants.ALIBULK, name); }
		
			oss.putObject(Constants.ALIBULK, name, inputStream);
			// 关闭client
			oss.shutdown();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static OSSObject get(String name) {

		OSS oss = new OSSClientBuilder().build(Constants.ALENDPOINT, Constants.ALIYID, Constants.ALIYKEY);
		try {
			// 先删除
			/*
			 * boolean found = oss.doesObjectExist(Constants.ALIBULK, name);
			 * if(found){ oss.deleteObject(Constants.ALIBULK, name); }
			 */
			OSSObject ossObject = oss.getObject(Constants.ALIBULK, name);
			// 关闭client
			oss.shutdown();
			return ossObject;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean delete(String name) {
		OSS oss = new OSSClientBuilder().build(Constants.ALENDPOINT, Constants.ALIYID, Constants.ALIYKEY);
		try {
			oss.deleteObject(Constants.ALIBULK, name);
			// 关闭client
			oss.shutdown();
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	public static DeleteObjectsResult deleteObjectsRequest(List<String> keys) {
		OSS oss = new OSSClientBuilder().build(Constants.ALENDPOINT, Constants.ALIYID, Constants.ALIYKEY);
		DeleteObjectsRequest dreq = new DeleteObjectsRequest(Constants.ALIBULK);
		dreq.setKeys(keys);
		dreq.setQuiet(true);
		DeleteObjectsResult deleteObjectsResult = oss.deleteObjects(dreq);
		return deleteObjectsResult;
	}

	
	public static void main(String[] args) throws FileNotFoundException{
		InputStream inputStream = new FileInputStream("D:/1.jpg");
		OssUtils.update("测试", inputStream);
	}
	
}
