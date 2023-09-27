package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.certification.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-15 14:26:43
 */
public class ZhimaCreditEpCertificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2655425267835582329L;

	/** 
	 * 代理人提交认证时的扫脸时间
	 */
	@ApiField("attorney_face_time")
	private String attorneyFaceTime;

	/** 
	 * 代理函有效访问地址，有效时间1小时，接口返回后开始计时，auth_status为SUCCESS时返回，特定场景下返回
	 */
	@ApiField("attorney_letter")
	private String attorneyLetter;

	/** 
	 * 授权状态，从用户授权开始计时，时间窗口3天
取值如下：
SUCCESS，代表用户已授权
FAIL，代表用户未授权或授权失效
	 */
	@ApiField("auth_status")
	private String authStatus;

	/** 
	 * 营业执照有效访问地址，有效时间1小时，接口返回后开始计时，字段auth_status为SUCCESS时返回，特定场景下返回
	 */
	@ApiField("business_license")
	private String businessLicense;

	/** 
	 * 代理人认证渠道，取值如下：LPIDCARD代表法人身份证认证渠道；EMAIL代表企业邮箱认证渠道
	 */
	@ApiField("certify_channel")
	private String certifyChannel;

	/** 
	 * 认证完成时间
	 */
	@ApiField("certify_end_date")
	private String certifyEndDate;

	/** 
	 * 认证失败原因列表，当certify_status=FAIL时返回
	 */
	@ApiListField("certify_fail_reasons")
	@ApiField("string")
	private List<String> certifyFailReasons;

	/** 
	 * 认证模式，取值如下：ATTORNEY代表代理人；LEGAL_PERSON代表法定代表人
	 */
	@ApiField("certify_mode")
	private String certifyMode;

	/** 
	 * 认证人有效证件号码
	 */
	@ApiField("certify_person_card_no_postfix")
	private String certifyPersonCardNoPostfix;

	/** 
	 * 认证状态，取值如下：
SUCCESS，代表成功
INIT，代表初始化
CERTIFYING，代表认证中
FAIL，代表失败
	 */
	@ApiField("certify_status")
	private String certifyStatus;

	/** 
	 * 企业邮箱地址
	 */
	@ApiField("email_address")
	private String emailAddress;

	/** 
	 * 统一社会信用代码或营业执照注册号，字段auth_status为SUCCESS时返回
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/** 
	 * 企业全称，字段auth_status为SUCCESS时返回
	 */
	@ApiField("ep_name")
	private String epName;

	/** 
	 * 该企业是否有立信企业芝麻证 true:有;false:无
	 */
	@ApiField("has_li_xin_certificate")
	private Boolean hasLiXinCertificate;

	/** 
	 * 法代有效证件号码
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/** 
	 * 法代提交认证时的扫脸时间
	 */
	@ApiField("legal_person_face_time")
	private String legalPersonFaceTime;

	/** 
	 * 法人身份证反面有效访问定制，有效时间1小时，接口返回后开始计时，auth_status为SUCCESS时返回，特定场景下返回
	 */
	@ApiField("legal_person_id_card_back")
	private String legalPersonIdCardBack;

	/** 
	 * 法人身份证正面有效访问地址，有效时间1小时，接口返回后开始计时，auth_status为SUCCESS时返回，特定场景下返回
	 */
	@ApiField("legal_person_id_card_front")
	private String legalPersonIdCardFront;

	/** 
	 * 法代姓名,代理人模式时返回
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/** 
	 * 是否是立信企业 true:是;false:否
	 */
	@ApiField("li_xin_ep")
	private Boolean liXinEp;

	/** 
	 * 个人用户姓名，字段auth_status为SUCCESS时返回
	 */
	@ApiField("user_name")
	private String userName;

	public void setAttorneyFaceTime(String attorneyFaceTime) {
		this.attorneyFaceTime = attorneyFaceTime;
	}
	public String getAttorneyFaceTime( ) {
		return this.attorneyFaceTime;
	}

	public void setAttorneyLetter(String attorneyLetter) {
		this.attorneyLetter = attorneyLetter;
	}
	public String getAttorneyLetter( ) {
		return this.attorneyLetter;
	}

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}
	public String getAuthStatus( ) {
		return this.authStatus;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}
	public String getBusinessLicense( ) {
		return this.businessLicense;
	}

	public void setCertifyChannel(String certifyChannel) {
		this.certifyChannel = certifyChannel;
	}
	public String getCertifyChannel( ) {
		return this.certifyChannel;
	}

	public void setCertifyEndDate(String certifyEndDate) {
		this.certifyEndDate = certifyEndDate;
	}
	public String getCertifyEndDate( ) {
		return this.certifyEndDate;
	}

	public void setCertifyFailReasons(List<String> certifyFailReasons) {
		this.certifyFailReasons = certifyFailReasons;
	}
	public List<String> getCertifyFailReasons( ) {
		return this.certifyFailReasons;
	}

	public void setCertifyMode(String certifyMode) {
		this.certifyMode = certifyMode;
	}
	public String getCertifyMode( ) {
		return this.certifyMode;
	}

	public void setCertifyPersonCardNoPostfix(String certifyPersonCardNoPostfix) {
		this.certifyPersonCardNoPostfix = certifyPersonCardNoPostfix;
	}
	public String getCertifyPersonCardNoPostfix( ) {
		return this.certifyPersonCardNoPostfix;
	}

	public void setCertifyStatus(String certifyStatus) {
		this.certifyStatus = certifyStatus;
	}
	public String getCertifyStatus( ) {
		return this.certifyStatus;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress( ) {
		return this.emailAddress;
	}

	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}
	public String getEpCertNo( ) {
		return this.epCertNo;
	}

	public void setEpName(String epName) {
		this.epName = epName;
	}
	public String getEpName( ) {
		return this.epName;
	}

	public void setHasLiXinCertificate(Boolean hasLiXinCertificate) {
		this.hasLiXinCertificate = hasLiXinCertificate;
	}
	public Boolean getHasLiXinCertificate( ) {
		return this.hasLiXinCertificate;
	}

	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}
	public String getLegalPersonCertNo( ) {
		return this.legalPersonCertNo;
	}

	public void setLegalPersonFaceTime(String legalPersonFaceTime) {
		this.legalPersonFaceTime = legalPersonFaceTime;
	}
	public String getLegalPersonFaceTime( ) {
		return this.legalPersonFaceTime;
	}

	public void setLegalPersonIdCardBack(String legalPersonIdCardBack) {
		this.legalPersonIdCardBack = legalPersonIdCardBack;
	}
	public String getLegalPersonIdCardBack( ) {
		return this.legalPersonIdCardBack;
	}

	public void setLegalPersonIdCardFront(String legalPersonIdCardFront) {
		this.legalPersonIdCardFront = legalPersonIdCardFront;
	}
	public String getLegalPersonIdCardFront( ) {
		return this.legalPersonIdCardFront;
	}

	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}
	public String getLegalPersonName( ) {
		return this.legalPersonName;
	}

	public void setLiXinEp(Boolean liXinEp) {
		this.liXinEp = liXinEp;
	}
	public Boolean getLiXinEp( ) {
		return this.liXinEp;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
