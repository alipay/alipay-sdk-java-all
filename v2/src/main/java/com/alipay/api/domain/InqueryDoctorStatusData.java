package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 专家问诊医生在线状态和问诊方式、价格等数据
 *
 * @author auto create
 * @since 1.0, 2022-12-27 11:50:49
 */
public class InqueryDoctorStatusData extends AlipayObject {

	private static final long serialVersionUID = 8632479929445937524L;

	/**
	 * 平均接诊时长（单位：分钟）
	 */
	@ApiField("average_time")
	private String averageTime;

	/**
	 * 医生平台状态
	 */
	@ApiField("doctor_platform_status")
	private String doctorPlatformStatus;

	/**
	 * 医生评价分数
	 */
	@ApiField("evaluation_score")
	private String evaluationScore;

	/**
	 * 医生身份证号（医生执医许可证编号和医生身份证号至少传一项）
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 问诊方式列表
	 */
	@ApiListField("inquiry_channel_list")
	@ApiField("inquiry_channel")
	private List<InquiryChannel> inquiryChannelList;

	/**
	 * 外部平台医生id
	 */
	@ApiField("merchant_doctor_id")
	private String merchantDoctorId;

	/**
	 * 累计咨询人次
	 */
	@ApiField("num_of_people_served")
	private String numOfPeopleServed;

	/**
	 * 医生执医许可证编号（医生执医许可证编号和医生身份证号至少传一项）
	 */
	@ApiField("practicing_doctor_certificate_no")
	private String practicingDoctorCertificateNo;

	public String getAverageTime() {
		return this.averageTime;
	}
	public void setAverageTime(String averageTime) {
		this.averageTime = averageTime;
	}

	public String getDoctorPlatformStatus() {
		return this.doctorPlatformStatus;
	}
	public void setDoctorPlatformStatus(String doctorPlatformStatus) {
		this.doctorPlatformStatus = doctorPlatformStatus;
	}

	public String getEvaluationScore() {
		return this.evaluationScore;
	}
	public void setEvaluationScore(String evaluationScore) {
		this.evaluationScore = evaluationScore;
	}

	public String getIdNo() {
		return this.idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public List<InquiryChannel> getInquiryChannelList() {
		return this.inquiryChannelList;
	}
	public void setInquiryChannelList(List<InquiryChannel> inquiryChannelList) {
		this.inquiryChannelList = inquiryChannelList;
	}

	public String getMerchantDoctorId() {
		return this.merchantDoctorId;
	}
	public void setMerchantDoctorId(String merchantDoctorId) {
		this.merchantDoctorId = merchantDoctorId;
	}

	public String getNumOfPeopleServed() {
		return this.numOfPeopleServed;
	}
	public void setNumOfPeopleServed(String numOfPeopleServed) {
		this.numOfPeopleServed = numOfPeopleServed;
	}

	public String getPracticingDoctorCertificateNo() {
		return this.practicingDoctorCertificateNo;
	}
	public void setPracticingDoctorCertificateNo(String practicingDoctorCertificateNo) {
		this.practicingDoctorCertificateNo = practicingDoctorCertificateNo;
	}

}
