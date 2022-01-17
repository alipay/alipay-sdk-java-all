package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请求身份安全业务的用户主体信息
 *
 * @author auto create
 * @since 1.0, 2017-11-28 15:46:58
 */
public class PrincipalInfo extends AlipayObject {

	private static final long serialVersionUID = 6262989524925512297L;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 证件号
	 */
	@ApiField("operator_cert_no")
	private String operatorCertNo;

	/**
	 * 证件类型，例如身份证，护照等
	 */
	@ApiField("operator_cert_type")
	private String operatorCertType;

	/**
	 * 用户主体信息的扩展参数
	 */
	@ApiField("params")
	private String params;

	/**
	 * 租户信息
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 业务方传入的用户标识
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOperatorCertNo() {
		return this.operatorCertNo;
	}
	public void setOperatorCertNo(String operatorCertNo) {
		this.operatorCertNo = operatorCertNo;
	}

	public String getOperatorCertType() {
		return this.operatorCertType;
	}
	public void setOperatorCertType(String operatorCertType) {
		this.operatorCertType = operatorCertType;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
