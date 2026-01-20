package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.card.depositback response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-19 21:10:29
 */
public class AlipayAssetCardDepositbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 7583948587815528859L;

	/** 
	 * 退款金额
	 */
	@ApiField("depositback_amount")
	private String depositbackAmount;

	/** 
	 * 退款交易号
	 */
	@ApiField("depositback_bill_no")
	private String depositbackBillNo;

	public void setDepositbackAmount(String depositbackAmount) {
		this.depositbackAmount = depositbackAmount;
	}
	public String getDepositbackAmount( ) {
		return this.depositbackAmount;
	}

	public void setDepositbackBillNo(String depositbackBillNo) {
		this.depositbackBillNo = depositbackBillNo;
	}
	public String getDepositbackBillNo( ) {
		return this.depositbackBillNo;
	}

}
