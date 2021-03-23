package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-11 10:58:22
 */
public class AlipayDataBillBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6688758688912972781L;

	/** 
	 * 账户可用余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 冻结金额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

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

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
