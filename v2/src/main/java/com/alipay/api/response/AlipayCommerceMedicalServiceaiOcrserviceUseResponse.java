package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.serviceai.ocrservice.use response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-28 13:42:52
 */
public class AlipayCommerceMedicalServiceaiOcrserviceUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8313799331796254116L;

	/** 
	 * 域内系统图像afts id
	 */
	@ApiField("afts_id")
	private String aftsId;

	/** 
	 * 文件格式
	 */
	@ApiField("file_ext")
	private String fileExt;

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
	 * 任务
	 */
	@ApiField("task_category")
	private String taskCategory;

	public void setAftsId(String aftsId) {
		this.aftsId = aftsId;
	}
	public String getAftsId( ) {
		return this.aftsId;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}
	public String getFileExt( ) {
		return this.fileExt;
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

	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}
	public String getTaskCategory( ) {
		return this.taskCategory;
	}

}
