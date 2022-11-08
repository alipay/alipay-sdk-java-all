package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主体证件信息
 *
 * @author auto create
 * @since 1.0, 2022-09-01 19:25:30
 */
public class IndirectCertificateInfo extends AlipayObject {

	private static final long serialVersionUID = 6734258257444826939L;

	/**
	 * 证照图片（使用图片上传接口）
	 */
	@ApiField("cert_image")
	private String certImage;

	/**
	 * 证件编号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 登记证书类型时必填，枚举：统一社会信用代码证书（UNIT_SOCIAL_CREDIT）、慈善组织公开募捐资格证书（CHARITY_ORG_SOLICIT），社会团体法人登记证书（SOCIAL_ORG_LEGAL），民办非企业单位登记证书（CIVIL_UN_ENT），基金会法人登记证书（FOUNDATION_LEGAL_PERSON），农民专业合作社法人营业执照（FARMERS_COOPERATE），宗教活动场所登记证（RELIGION_PLACES），其他证书/批文/证明（OTHER_REG_CERT）
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 证照生效时间
	 */
	@ApiField("effect_time")
	private String effectTime;

	/**
	 * 证照过期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 证照法人姓名
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 证照商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 证照注册地址
	 */
	@ApiField("register_address")
	private String registerAddress;

	public String getCertImage() {
		return this.certImage;
	}
	public void setCertImage(String certImage) {
		this.certImage = certImage;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(String effectTime) {
		this.effectTime = effectTime;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getRegisterAddress() {
		return this.registerAddress;
	}
	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}

}
