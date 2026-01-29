package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 间联商户报名
 *
 * @author auto create
 * @since 1.0, 2025-08-22 11:06:39
 */
public class AlipayCommerceEducateSchooldeviceSmSignupModel extends AlipayObject {

	private static final long serialVersionUID = 5213931543896598618L;

	/**
	 * 活动码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 业务码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 经营内景照片
	 */
	@ApiListField("business_inner_image")
	@ApiField("string")
	private List<String> businessInnerImage;

	/**
	 * 营业执照
	 */
	@ApiListField("business_license_image")
	@ApiField("string")
	private List<String> businessLicenseImage;

	/**
	 * 经营外景照片
	 */
	@ApiListField("business_outer_image")
	@ApiField("string")
	private List<String> businessOuterImage;

	/**
	 * 合作协议扫描件
	 */
	@ApiListField("cooperation_agreement_image")
	@ApiField("string")
	private List<String> cooperationAgreementImage;

	/**
	 * 法人证件照
	 */
	@ApiListField("legal_person_certification_image")
	@ApiField("string")
	private List<String> legalPersonCertificationImage;

	/**
	 * 间联商户ID
	 */
	@ApiField("sm_id")
	private String smId;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<String> getBusinessInnerImage() {
		return this.businessInnerImage;
	}
	public void setBusinessInnerImage(List<String> businessInnerImage) {
		this.businessInnerImage = businessInnerImage;
	}

	public List<String> getBusinessLicenseImage() {
		return this.businessLicenseImage;
	}
	public void setBusinessLicenseImage(List<String> businessLicenseImage) {
		this.businessLicenseImage = businessLicenseImage;
	}

	public List<String> getBusinessOuterImage() {
		return this.businessOuterImage;
	}
	public void setBusinessOuterImage(List<String> businessOuterImage) {
		this.businessOuterImage = businessOuterImage;
	}

	public List<String> getCooperationAgreementImage() {
		return this.cooperationAgreementImage;
	}
	public void setCooperationAgreementImage(List<String> cooperationAgreementImage) {
		this.cooperationAgreementImage = cooperationAgreementImage;
	}

	public List<String> getLegalPersonCertificationImage() {
		return this.legalPersonCertificationImage;
	}
	public void setLegalPersonCertificationImage(List<String> legalPersonCertificationImage) {
		this.legalPersonCertificationImage = legalPersonCertificationImage;
	}

	public String getSmId() {
		return this.smId;
	}
	public void setSmId(String smId) {
		this.smId = smId;
	}

}
