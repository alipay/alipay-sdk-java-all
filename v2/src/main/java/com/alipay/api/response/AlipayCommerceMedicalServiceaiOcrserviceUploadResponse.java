package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.serviceai.ocrservice.upload response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-06 17:17:42
 */
public class AlipayCommerceMedicalServiceaiOcrserviceUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6751778986748913872L;

	/** 
	 * 域内系统图像afts id
	 */
	@ApiField("afts_id")
	private String aftsId;

	/** 
	 * 文件类型，图像、语音、视频、其他
	 */
	@ApiField("file_type")
	private String fileType;

	/** 
	 * kv抽取结果，map<String, String> 结构
	 */
	@ApiField("kv_result")
	private String kvResult;

	/** 
	 * ocr 处理结果
	 */
	@ApiField("ocr_result")
	private String ocrResult;

	/** 
	 * 地址，如果是域外场景，必填
	 */
	@ApiField("out_pic_url")
	private String outPicUrl;

	/** 
	 * 域内系统图像url
	 */
	@ApiField("pic_url")
	private String picUrl;

	/** 
	 * 任务类型，病历、处方、检查、检验、体检、其他
	 */
	@ApiField("task_type")
	private String taskType;

	public void setAftsId(String aftsId) {
		this.aftsId = aftsId;
	}
	public String getAftsId( ) {
		return this.aftsId;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileType( ) {
		return this.fileType;
	}

	public void setKvResult(String kvResult) {
		this.kvResult = kvResult;
	}
	public String getKvResult( ) {
		return this.kvResult;
	}

	public void setOcrResult(String ocrResult) {
		this.ocrResult = ocrResult;
	}
	public String getOcrResult( ) {
		return this.ocrResult;
	}

	public void setOutPicUrl(String outPicUrl) {
		this.outPicUrl = outPicUrl;
	}
	public String getOutPicUrl( ) {
		return this.outPicUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getPicUrl( ) {
		return this.picUrl;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskType( ) {
		return this.taskType;
	}

}
