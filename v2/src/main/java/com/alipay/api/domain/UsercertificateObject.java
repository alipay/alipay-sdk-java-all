package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据列表
 *
 * @author auto create
 * @since 1.0, 2025-08-18 14:27:37
 */
public class UsercertificateObject extends AlipayObject {

	private static final long serialVersionUID = 8874397255774649113L;

	/**
	 * 编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 证书MDM的证书ID
	 */
	@ApiField("certificate_code")
	private String certificateCode;

	/**
	 * 证书MDM的证书名称
	 */
	@ApiField("certificate_name")
	private String certificateName;

	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("certification_time")
	private String certificationTime;

	/**
	 * 用户Id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 评价机构
	 */
	@ApiField("rating_org")
	private String ratingOrg;

	/**
	 * 用户证书编码
	 */
	@ApiField("user_certificate_code")
	private String userCertificateCode;

	/**
	 * 用户证书级别
	 */
	@ApiField("user_certificate_level")
	private String userCertificateLevel;

	/**
	 * 用户Id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getCertificateCode() {
		return this.certificateCode;
	}
	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}

	public String getCertificateName() {
		return this.certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertificationTime() {
		return this.certificationTime;
	}
	public void setCertificationTime(String certificationTime) {
		this.certificationTime = certificationTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRatingOrg() {
		return this.ratingOrg;
	}
	public void setRatingOrg(String ratingOrg) {
		this.ratingOrg = ratingOrg;
	}

	public String getUserCertificateCode() {
		return this.userCertificateCode;
	}
	public void setUserCertificateCode(String userCertificateCode) {
		this.userCertificateCode = userCertificateCode;
	}

	public String getUserCertificateLevel() {
		return this.userCertificateLevel;
	}
	public void setUserCertificateLevel(String userCertificateLevel) {
		this.userCertificateLevel = userCertificateLevel;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
