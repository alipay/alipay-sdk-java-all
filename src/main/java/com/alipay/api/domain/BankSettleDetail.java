package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算明细
 *
 * @author auto create
 * @since 1.0, 2022-02-09 11:03:56
 */
public class BankSettleDetail extends AlipayObject {

	private static final long serialVersionUID = 7259471542163215286L;

	/**
	 * 分账方
	 */
	@ApiField("royalty_type")
	private String royaltyType;

	/**
	 * 分账金额，单位元
	 */
	@ApiField("settle_amt")
	private String settleAmt;

	public String getRoyaltyType() {
		return this.royaltyType;
	}
	public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}

	public String getSettleAmt() {
		return this.settleAmt;
	}
	public void setSettleAmt(String settleAmt) {
		this.settleAmt = settleAmt;
	}

}
