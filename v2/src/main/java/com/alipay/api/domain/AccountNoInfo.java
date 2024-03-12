package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户账号简单信息
 *
 * @author auto create
 * @since 1.0, 2023-09-19 13:44:33
 */
public class AccountNoInfo extends AlipayObject {

	private static final long serialVersionUID = 3391274769551398519L;

	/**
	 * ● 若传入logon_id，则查询用户名下所有已实名的、作为登录账号的支付宝账号
● 若传入phone_id，则查询用户名下所有已实名的，以手机号作为登录账号以及以绑定了该手机号的支付宝账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 用户支付宝账号userId对应的openid
	 */
	@ApiField("open_id")
	private String openId;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
