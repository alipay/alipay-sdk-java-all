package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 买家用户信息
 *
 * @author auto create
 * @since 1.0, 2025-04-10 15:12:29
 */
public class BuyerInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8772994412891579775L;

	/**
	 * 买家的用户身份证信息
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 买家的手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 买家的用户名字
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
