package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商向商家发起代运营操作，返回推荐的商家账号信息
 *
 * @author auto create
 * @since 1.0, 2022-01-25 19:39:28
 */
public class RecommendAccountDTO extends AlipayObject {

	private static final long serialVersionUID = 7594564226412324882L;

	/**
	 * 推荐商家支付宝登录账号，邮箱或手机号码，脱敏处理
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 推荐商家支付宝账号名称，脱敏处理
	 */
	@ApiField("user_name")
	private String userName;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
