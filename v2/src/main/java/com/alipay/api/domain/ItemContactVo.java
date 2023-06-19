package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 事项联络
 *
 * @author auto create
 * @since 1.0, 2023-06-08 21:33:01
 */
public class ItemContactVo extends AlipayObject {

	private static final long serialVersionUID = 1515555228339452596L;

	/**
	 * 事项咨询方式，自定义内容：电话、邮箱、手机等
	 */
	@ApiField("consultation_mode")
	private String consultationMode;

	/**
	 * 事项办事地点
	 */
	@ApiField("location")
	private String location;

	/**
	 * 事项办理时间
	 */
	@ApiField("processing_time")
	private String processingTime;

	public String getConsultationMode() {
		return this.consultationMode;
	}
	public void setConsultationMode(String consultationMode) {
		this.consultationMode = consultationMode;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getProcessingTime() {
		return this.processingTime;
	}
	public void setProcessingTime(String processingTime) {
		this.processingTime = processingTime;
	}

}
