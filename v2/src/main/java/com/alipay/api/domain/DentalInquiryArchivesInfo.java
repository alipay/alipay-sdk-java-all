package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口腔诊后档案信息，用于同步用户诊后档案
 *
 * @author auto create
 * @since 1.0, 2025-05-27 17:09:03
 */
public class DentalInquiryArchivesInfo extends AlipayObject {

	private static final long serialVersionUID = 6615453517847544997L;

	/**
	 * 记录医生提供的病症信息
	 */
	@ApiListField("diseases")
	@ApiField("dental_inquiry_archives_disease_info")
	private List<DentalInquiryArchivesDiseaseInfo> diseases;

	/**
	 * 医生头像图片链接
	 */
	@ApiField("doctor_avatar")
	private String doctorAvatar;

	/**
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 记录医生医嘱
	 */
	@ApiField("doctor_suggestion")
	private String doctorSuggestion;

	/**
	 * 医生职称
	 */
	@ApiField("doctor_title")
	private String doctorTitle;

	/**
	 * 用于描述用户健康等级
	 */
	@ApiField("health_level")
	private String healthLevel;

	/**
	 * 描述用户健康分数
	 */
	@ApiField("health_score")
	private String healthScore;

	/**
	 * 用于记录医生的就诊时间
	 */
	@ApiField("inquiry_time")
	private Date inquiryTime;

	/**
	 * 商家侧医生编号
	 */
	@ApiField("out_doctor_id")
	private String outDoctorId;

	/**
	 * 记录商家的门店ID号
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	public List<DentalInquiryArchivesDiseaseInfo> getDiseases() {
		return this.diseases;
	}
	public void setDiseases(List<DentalInquiryArchivesDiseaseInfo> diseases) {
		this.diseases = diseases;
	}

	public String getDoctorAvatar() {
		return this.doctorAvatar;
	}
	public void setDoctorAvatar(String doctorAvatar) {
		this.doctorAvatar = doctorAvatar;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSuggestion() {
		return this.doctorSuggestion;
	}
	public void setDoctorSuggestion(String doctorSuggestion) {
		this.doctorSuggestion = doctorSuggestion;
	}

	public String getDoctorTitle() {
		return this.doctorTitle;
	}
	public void setDoctorTitle(String doctorTitle) {
		this.doctorTitle = doctorTitle;
	}

	public String getHealthLevel() {
		return this.healthLevel;
	}
	public void setHealthLevel(String healthLevel) {
		this.healthLevel = healthLevel;
	}

	public String getHealthScore() {
		return this.healthScore;
	}
	public void setHealthScore(String healthScore) {
		this.healthScore = healthScore;
	}

	public Date getInquiryTime() {
		return this.inquiryTime;
	}
	public void setInquiryTime(Date inquiryTime) {
		this.inquiryTime = inquiryTime;
	}

	public String getOutDoctorId() {
		return this.outDoctorId;
	}
	public void setOutDoctorId(String outDoctorId) {
		this.outDoctorId = outDoctorId;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

}
