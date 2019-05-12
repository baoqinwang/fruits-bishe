package com.zzti.fruits.controller;


import com.alibaba.fastjson.JSONObject;
import com.zzti.fruits.entity.Result;
import com.zzti.fruits.util.FastDFSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;


@RestController
public class UploadController {
	
	@Value("${FILE_SERVER_URL}")
	private String file_server_url;

	@RequestMapping("/upload")
	public Result upload(MultipartFile file){
		
		String originalFilename = file.getOriginalFilename();//获取文件名
		String extName=originalFilename.substring( originalFilename.lastIndexOf(".")+1);//得到扩展名
		
		try {
			FastDFSClient client=new FastDFSClient("classpath:config/fdfs_client.conf");
			String fileId = client.uploadFile(file.getBytes(), extName);
			String url=file_server_url+fileId;//图片完整地址
			return new Result(true, url);
			
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "上传失败");
		}
		
	}
	@RequestMapping("/uploadOk")
	public  Map<String, Object> uploadOk(MultipartFile imgFile){
		Map<String, Object> result = new HashMap<String, Object>();
		String originalFilename = imgFile.getOriginalFilename();//获取文件名
		String extName=originalFilename.substring( originalFilename.lastIndexOf(".")+1);//得到扩展名

		try {
			FastDFSClient client=new FastDFSClient("classpath:config/fdfs_client.conf");
			String fileId = client.uploadFile(imgFile.getBytes(), extName);
			String url=file_server_url+fileId;//图片完整地址
//			return new Result(true, "http://47.101.63.178/group1/M00/00/00/rBEvL1zXyQ-AX5KmAABJG3H96j4266.jpg");
			result.put("error", 0);
			result.put("url", url);

			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("error", 1);
			result.put("message", "文件没接到");
//			return new Result(false, "上传失败");
			return result;
		}
	}
	
}
