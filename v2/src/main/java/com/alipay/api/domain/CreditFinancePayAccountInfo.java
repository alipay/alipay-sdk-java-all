package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用交易金融操作类的账户信息
 *
 * @author auto create
 * @since 1.0, 2020-06-03 15:15:46
 */
public class CreditFinancePayAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 6449374856552137765L;

	/**
	 * 账号的扩展信息，String格式的json字符串
	 */
	@ApiField("account_ext")
	private String accountExt;

	/**
	 * 支付的账号标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 支付宝唯一标识的类型
ENTRUST_ACCOUNT
USER_ID
	 */
	@ApiField("identity_type")
	private String identityType;

	public String getAccountExt() {
		return this.accountExt;
	}
	public void setAccountExt(String accountExt) {
		this.accountExt = accountExt;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

}
