package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店结算信息
 *
 * @author auto create
 * @since 1.0, 2025-10-23 10:08:56
 */
public class ShopSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 3234451876358738141L;

	/**
	 * 结算到户的账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 结算类型
	 */
	@ApiField("type")
	private String type;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
