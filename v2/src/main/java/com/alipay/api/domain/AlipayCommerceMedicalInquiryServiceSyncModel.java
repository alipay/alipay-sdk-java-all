package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 互联网医院医生服务数据同步
 *
 * @author auto create
 * @since 1.0, 2026-08-24 20:57:47
 */
public class AlipayCommerceMedicalInquiryServiceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7146443193812578873L;

	/**
	 * 平均接诊时间，单位：分钟
	 */
	@ApiField("average_time")
	private String averageTime;

	/**
	 * 数据版本号（更新时+1）
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 三方医生编码
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生评价分数
	 */
	@ApiField("evaluation_score")
	private String evaluationScore;

	/**
	 * 问诊方式
	 */
	@ApiField("inquiry_mode")
	private String inquiryMode;

	/**
	 * 问诊价格，单位：元
	 */
	@ApiField("inquiry_price")
	private String inquiryPrice;

	/**
	 * 问诊类型
	 */
	@ApiField("inquiry_type")
	private String inquiryType;

	/**
	 * 问诊服务链接
	 */
	@ApiField("inquiry_url")
	private String inquiryUrl;

	/**
	 * 服务商编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 累计咨询人次
	 */
	@ApiField("num_of_people_served")
	private String numOfPeopleServed;

	/**
	 * 来源平台 code
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 服务时长，单位：分钟
	 */
	@ApiField("service_duration")
	private String serviceDuration;

	/**
	 * 三方服务编码
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 问诊服务状态(ONLINE/OFFLINE)
	 */
	@ApiField("status")
	private String status;

	public String getAverageTime() {
		return this.averageTime;
	}
	public void setAverageTime(String averageTime) {
		this.averageTime = averageTime;
	}

	public String getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getEvaluationScore() {
		return this.evaluationScore;
	}
	public void setEvaluationScore(String evaluationScore) {
		this.evaluationScore = evaluationScore;
	}

	public String getInquiryMode() {
		return this.inquiryMode;
	}
	public void setInquiryMode(String inquiryMode) {
		this.inquiryMode = inquiryMode;
	}

	public String getInquiryPrice() {
		return this.inquiryPrice;
	}
	public void setInquiryPrice(String inquiryPrice) {
		this.inquiryPrice = inquiryPrice;
	}

	public String getInquiryType() {
		return this.inquiryType;
	}
	public void setInquiryType(String inquiryType) {
		this.inquiryType = inquiryType;
	}

	public String getInquiryUrl() {
		return this.inquiryUrl;
	}
	public void setInquiryUrl(String inquiryUrl) {
		this.inquiryUrl = inquiryUrl;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getNumOfPeopleServed() {
		return this.numOfPeopleServed;
	}
	public void setNumOfPeopleServed(String numOfPeopleServed) {
		this.numOfPeopleServed = numOfPeopleServed;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getServiceDuration() {
		return this.serviceDuration;
	}
	public void setServiceDuration(String serviceDuration) {
		this.serviceDuration = serviceDuration;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
