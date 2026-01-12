package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金信息列表
 *
 * @author auto create
 * @since 1.0, 2025-09-22 10:42:23
 */
public class VcpFundInfo extends AlipayObject {

	private static final long serialVersionUID = 3854177863322444579L;

	/**
	 * 出资账号
	 */
	@ApiField("display_account")
	private String displayAccount;

	/**
	 * 资金账号
	 */
	@ApiField("fund_account")
	private String fundAccount;

	/**
	 * 出资类型，如资金池（FUND_SCHEME）、余额（BALANCE）
	 */
	@ApiField("fund_type")
	private String fundType;

	public String getDisplayAccount() {
		return this.displayAccount;
	}
	public void setDisplayAccount(String displayAccount) {
		this.displayAccount = displayAccount;
	}

	public String getFundAccount() {
		return this.fundAccount;
	}
	public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

}
