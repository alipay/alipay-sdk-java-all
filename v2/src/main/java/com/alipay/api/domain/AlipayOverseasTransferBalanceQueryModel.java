package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询NRA账户余额
 *
 * @author auto create
 * @since 1.0, 2021-06-02 19:36:52
 */
public class AlipayOverseasTransferBalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8263971844568442849L;

	/**
	 * 账户别名
	 */
	@ApiField("account_alias")
	private String accountAlias;

	/**
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	public String getAccountAlias() {
		return this.accountAlias;
	}
	public void setAccountAlias(String accountAlias) {
		this.accountAlias = accountAlias;
	}

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

}
