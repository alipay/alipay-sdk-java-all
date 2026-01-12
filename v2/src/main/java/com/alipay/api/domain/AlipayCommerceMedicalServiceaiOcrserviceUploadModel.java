package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗服务OCR服务处理
 *
 * @author auto create
 * @since 1.0, 2026-01-06 17:17:42
 */
public class AlipayCommerceMedicalServiceaiOcrserviceUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7852498925634163186L;

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
	 * 域外系统图像id，如果是域外场景，必填
	 */
	@ApiField("out_pic_id")
	private String outPicId;

	/**
	 * 域外系统图像地址，如果是域外场景，必填
	 */
	@ApiField("out_pic_url")
	private String outPicUrl;

	/**
	 * 域内系统图像url
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 是否重试解析任务
	 */
	@ApiField("retry_parsing_task")
	private Boolean retryParsingTask;

	/**
	 * 系统类型，域内、好大夫
	 */
	@ApiField("system_type")
	private String systemType;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户类型，支付宝uid、其他uid
	 */
	@ApiField("user_type")
	private String userType;

	public String getAftsId() {
		return this.aftsId;
	}
	public void setAftsId(String aftsId) {
		this.aftsId = aftsId;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getOutPicId() {
		return this.outPicId;
	}
	public void setOutPicId(String outPicId) {
		this.outPicId = outPicId;
	}

	public String getOutPicUrl() {
		return this.outPicUrl;
	}
	public void setOutPicUrl(String outPicUrl) {
		this.outPicUrl = outPicUrl;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Boolean getRetryParsingTask() {
		return this.retryParsingTask;
	}
	public void setRetryParsingTask(Boolean retryParsingTask) {
		this.retryParsingTask = retryParsingTask;
	}

	public String getSystemType() {
		return this.systemType;
	}
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
