package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行充值授权信息
 *
 * @author auto create
 * @since 1.0, 2026-04-28 14:02:23
 */
public class BankAuthUserInfo extends AlipayObject {

	private static final long serialVersionUID = 5325657734526449646L;

	/**
	 * 授权用户的支付宝账号
	 */
	@ApiField("alipay_account_no")
	private String alipayAccountNo;

	/**
	 * 授权用户的支付宝昵称
	 */
	@ApiField("alipay_nick_name")
	private String alipayNickName;

	/**
	 * 授权用户的支付宝外标卡号
	 */
	@ApiField("alipay_out_card_no")
	private String alipayOutCardNo;

	/**
	 * 授权用户身份证号
	 */
	@ApiField("user_cert_no")
	private String userCertNo;

	/**
	 * 授权用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAlipayAccountNo() {
		return this.alipayAccountNo;
	}
	public void setAlipayAccountNo(String alipayAccountNo) {
		this.alipayAccountNo = alipayAccountNo;
	}

	public String getAlipayNickName() {
		return this.alipayNickName;
	}
	public void setAlipayNickName(String alipayNickName) {
		this.alipayNickName = alipayNickName;
	}

	public String getAlipayOutCardNo() {
		return this.alipayOutCardNo;
	}
	public void setAlipayOutCardNo(String alipayOutCardNo) {
		this.alipayOutCardNo = alipayOutCardNo;
	}

	public String getUserCertNo() {
		return this.userCertNo;
	}
	public void setUserCertNo(String userCertNo) {
		this.userCertNo = userCertNo;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
