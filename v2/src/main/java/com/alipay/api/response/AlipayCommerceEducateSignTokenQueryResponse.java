package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sign.token.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 21:21:03
 */
public class AlipayCommerceEducateSignTokenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1235672119539311468L;

	/** 
	 * 业务场景类型标识
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型。{1:居民身份证；A:护照；X:学工号}
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 刷脸用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 家长支付宝账户的脱敏信息（特例：特殊标识"ALREADY_RELEASED"，须通过技术支持反馈来关闭开通记录）
	 */
	@ApiField("parent_logon_id")
	private String parentLogonId;

	/** 
	 * 用于开通一脸通行的支付宝账户 openId。如果是父母为孩子开通，则为父母支付宝 openId；如果是用户为本人开通，则为本人支付宝 openId。
	 */
	@ApiField("parent_open_id")
	private String parentOpenId;

	/** 
	 * 用于开通一脸通行的支付宝账户 uid。如果是父母为孩子开通，则为父母支付宝 uid；如果是用户为本人开通，则为本人支付宝 uid。
	 */
	@ApiField("parent_user_id")
	private String parentUserId;

	/** 
	 * 学校内标
	 */
	@ApiField("school_code")
	private String schoolCode;

	/** 
	 * 校园一脸通行开通状态。OPEN：开通，CLOSE：关闭
	 */
	@ApiField("school_face_pass_status")
	private String schoolFacePassStatus;

	/** 
	 * 校园一脸通行刷脸支付开通状态。OPEN：开通，CLOSE：关闭
	 */
	@ApiField("school_face_payment_status")
	private String schoolFacePaymentStatus;

	/** 
	 * 学校外标
	 */
	@ApiField("school_stdcode")
	private String schoolStdcode;

	/** 
	 * 刷脸用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setParentLogonId(String parentLogonId) {
		this.parentLogonId = parentLogonId;
	}
	public String getParentLogonId( ) {
		return this.parentLogonId;
	}

	public void setParentOpenId(String parentOpenId) {
		this.parentOpenId = parentOpenId;
	}
	public String getParentOpenId( ) {
		return this.parentOpenId;
	}

	public void setParentUserId(String parentUserId) {
		this.parentUserId = parentUserId;
	}
	public String getParentUserId( ) {
		return this.parentUserId;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getSchoolCode( ) {
		return this.schoolCode;
	}

	public void setSchoolFacePassStatus(String schoolFacePassStatus) {
		this.schoolFacePassStatus = schoolFacePassStatus;
	}
	public String getSchoolFacePassStatus( ) {
		return this.schoolFacePassStatus;
	}

	public void setSchoolFacePaymentStatus(String schoolFacePaymentStatus) {
		this.schoolFacePaymentStatus = schoolFacePaymentStatus;
	}
	public String getSchoolFacePaymentStatus( ) {
		return this.schoolFacePaymentStatus;
	}

	public void setSchoolStdcode(String schoolStdcode) {
		this.schoolStdcode = schoolStdcode;
	}
	public String getSchoolStdcode( ) {
		return this.schoolStdcode;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
