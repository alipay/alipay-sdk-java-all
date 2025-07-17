package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:48
 */
public class AlipayDataBillBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4584773942887647316L;

	/** 
	 * 账户可用余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 冻结金额。单位（元）
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/** 
	 * 待结算金额，单位（元）
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/** 
	 * 支付宝账户余额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}
	public String getSettleAmount( ) {
		return this.settleAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
