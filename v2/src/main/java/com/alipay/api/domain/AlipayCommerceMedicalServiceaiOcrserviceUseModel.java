package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OCR识别
 *
 * @author auto create
 * @since 1.0, 2026-09-28 13:42:52
 */
public class AlipayCommerceMedicalServiceaiOcrserviceUseModel extends AlipayObject {

	private static final long serialVersionUID = 3263457271727574385L;

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
	 * 好大夫id
	 */
	@ApiField("owner_id")
	private String ownerId;

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
	 * 资源
	 */
	@ApiField("source_system")
	private String sourceSystem;

	/**
	 * 用户l
	 */
	@ApiField("user_identity")
	private String userIdentity;

	public String getAftsId() {
		return this.aftsId;
	}
	public void setAftsId(String aftsId) {
		this.aftsId = aftsId;
	}

	public String getFileExt() {
		return this.fileExt;
	}
	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
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

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
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

	public String getSourceSystem() {
		return this.sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getUserIdentity() {
		return this.userIdentity;
	}
	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}

}
