package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据信息
 *
 * @author auto create
 * @since 1.0, 2025-11-20 14:32:42
 */
public class SignUserInfo extends AlipayObject {

	private static final long serialVersionUID = 2712938596764938942L;

	/**
	 * 数据的创建时间
	 */
	@ApiField("agreement_gmt_create")
	private Date agreementGmtCreate;

	/**
	 * 协议id
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 协议链接
	 */
	@ApiField("agreement_url")
	private String agreementUrl;

	/**
	 * 协议版本
	 */
	@ApiField("agreement_version")
	private String agreementVersion;

	/**
	 * 人脸核验ID
	 */
	@ApiField("face_verification_id")
	private String faceVerificationId;

	/**
	 * 人脸核验平台
	 */
	@ApiField("face_verification_platform")
	private String faceVerificationPlatform;

	/**
	 * 人脸核验时间
	 */
	@ApiField("face_verification_time")
	private Date faceVerificationTime;

	/**
	 * 身份证号
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 签约时间
	 */
	@ApiField("sign_datetime")
	private Date signDatetime;

	public Date getAgreementGmtCreate() {
		return this.agreementGmtCreate;
	}
	public void setAgreementGmtCreate(Date agreementGmtCreate) {
		this.agreementGmtCreate = agreementGmtCreate;
	}

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getAgreementUrl() {
		return this.agreementUrl;
	}
	public void setAgreementUrl(String agreementUrl) {
		this.agreementUrl = agreementUrl;
	}

	public String getAgreementVersion() {
		return this.agreementVersion;
	}
	public void setAgreementVersion(String agreementVersion) {
		this.agreementVersion = agreementVersion;
	}

	public String getFaceVerificationId() {
		return this.faceVerificationId;
	}
	public void setFaceVerificationId(String faceVerificationId) {
		this.faceVerificationId = faceVerificationId;
	}

	public String getFaceVerificationPlatform() {
		return this.faceVerificationPlatform;
	}
	public void setFaceVerificationPlatform(String faceVerificationPlatform) {
		this.faceVerificationPlatform = faceVerificationPlatform;
	}

	public Date getFaceVerificationTime() {
		return this.faceVerificationTime;
	}
	public void setFaceVerificationTime(Date faceVerificationTime) {
		this.faceVerificationTime = faceVerificationTime;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Date getSignDatetime() {
		return this.signDatetime;
	}
	public void setSignDatetime(Date signDatetime) {
		this.signDatetime = signDatetime;
	}

}
