package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署人状态列表
 *
 * @author auto create
 * @since 1.0, 2023-05-17 14:19:31
 */
public class AntSignOperatorResult extends AlipayObject {

	private static final long serialVersionUID = 4536831336495856689L;

	/**
	 * 授权人证件名称
	 */
	@ApiField("auth_person_cert_name")
	private String authPersonCertName;

	/**
	 * 授权人证件号码
	 */
	@ApiField("auth_person_cert_no")
	private String authPersonCertNo;

	/**
	 * 授权人证件类型
	 */
	@ApiField("auth_person_cert_type")
	private String authPersonCertType;

	/**
	 * 授权时间
	 */
	@ApiField("authorize_time")
	private Date authorizeTime;

	/**
	 * 是否授权 1：是 表示授权  0：表示不授权
	 */
	@ApiField("authorized")
	private Long authorized;

	/**
	 * 邮件联系地址
	 */
	@ApiField("email_address")
	private String emailAddress;

	/**
	 * 签署失败原因
	 */
	@ApiField("fail_info")
	private String failInfo;

	/**
	 * 电话联系方式
	 */
	@ApiField("mobile_number")
	private String mobileNumber;

	/**
	 * 是否我方公司
	 */
	@ApiField("our_corp")
	private Long ourCorp;

	/**
	 * 签署方证件名称
	 */
	@ApiField("sign_cert_name")
	private String signCertName;

	/**
	 * 签署方证件号
	 */
	@ApiField("sign_cert_no")
	private String signCertNo;

	/**
	 * 签署方证件类型
	 */
	@ApiField("sign_cert_type")
	private String signCertType;

	/**
	 * 签署时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	/**
	 * 签署方UserId
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/**
	 * 签署方状态
	 */
	@ApiField("status")
	private String status;

	public String getAuthPersonCertName() {
		return this.authPersonCertName;
	}
	public void setAuthPersonCertName(String authPersonCertName) {
		this.authPersonCertName = authPersonCertName;
	}

	public String getAuthPersonCertNo() {
		return this.authPersonCertNo;
	}
	public void setAuthPersonCertNo(String authPersonCertNo) {
		this.authPersonCertNo = authPersonCertNo;
	}

	public String getAuthPersonCertType() {
		return this.authPersonCertType;
	}
	public void setAuthPersonCertType(String authPersonCertType) {
		this.authPersonCertType = authPersonCertType;
	}

	public Date getAuthorizeTime() {
		return this.authorizeTime;
	}
	public void setAuthorizeTime(Date authorizeTime) {
		this.authorizeTime = authorizeTime;
	}

	public Long getAuthorized() {
		return this.authorized;
	}
	public void setAuthorized(Long authorized) {
		this.authorized = authorized;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFailInfo() {
		return this.failInfo;
	}
	public void setFailInfo(String failInfo) {
		this.failInfo = failInfo;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Long getOurCorp() {
		return this.ourCorp;
	}
	public void setOurCorp(Long ourCorp) {
		this.ourCorp = ourCorp;
	}

	public String getSignCertName() {
		return this.signCertName;
	}
	public void setSignCertName(String signCertName) {
		this.signCertName = signCertName;
	}

	public String getSignCertNo() {
		return this.signCertNo;
	}
	public void setSignCertNo(String signCertNo) {
		this.signCertNo = signCertNo;
	}

	public String getSignCertType() {
		return this.signCertType;
	}
	public void setSignCertType(String signCertType) {
		this.signCertType = signCertType;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
