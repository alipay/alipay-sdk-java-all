package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余额账户明细查询
 *
 * @author auto create
 * @since 1.0, 2024-06-13 20:09:52
 */
public class BalanceAccountDetail extends AlipayObject {

	private static final long serialVersionUID = 6126115627367755625L;

	/**
	 * acs余额，单位：元
	 */
	@ApiField("acs")
	private String acs;

	/**
	 * bank余额，单位：元
	 */
	@ApiField("bank")
	private String bank;

	public String getAcs() {
		return this.acs;
	}
	public void setAcs(String acs) {
		this.acs = acs;
	}

	public String getBank() {
		return this.bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}

}
