package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子合同用户信息
 *
 * @author auto create
 * @since 1.0, 2022-11-16 14:53:29
 */
public class ContractUserInfo extends AlipayObject {

	private static final long serialVersionUID = 5234126578736363391L;

	/**
	 * 用户身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户签署区配置，userType=USER
	 */
	@ApiField("sign_area")
	private ContractSignArea signArea;

	/**
	 * 用户uid
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public ContractSignArea getSignArea() {
		return this.signArea;
	}
	public void setSignArea(ContractSignArea signArea) {
		this.signArea = signArea;
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
