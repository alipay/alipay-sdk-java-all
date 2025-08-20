package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * trusple外贸贷外部机构信登
 *
 * @author auto create
 * @since 1.0, 2025-04-21 11:01:33
 */
public class AnttechBlockchainFinanceTruspleAuthloginSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5784359357893918994L;

	/**
	 * 法人身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("company_cert_no")
	private String companyCertNo;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * Trusple侧定义的外部机构代号
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 外部机构的会员Id，用于在Trusple侧进行登录
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 法人手机号码，经过验短等初步验证
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 随机值，用来防止防CSRF攻击，建议使用系统毫秒时间
	 */
	@ApiField("state")
	private String state;

	/**
	 * 法人姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCompanyCertNo() {
		return this.companyCertNo;
	}
	public void setCompanyCertNo(String companyCertNo) {
		this.companyCertNo = companyCertNo;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
