package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算信息模型
 *
 * @author auto create
 * @since 1.0, 2025-10-27 17:10:15
 */
public class SettleInfoModel extends AlipayObject {

	private static final long serialVersionUID = 3374481178473284566L;

	/**
	 * 结算账号,一般是手机号或者邮箱
	 */
	@ApiField("account")
	private String account;

	/**
	 * 结算类型设置,0默认是结算到户,目前只支持结算到户
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
