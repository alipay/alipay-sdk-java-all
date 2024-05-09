package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.repaybill.billin.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:28:12
 */
public class AlipayTradeRepaybillBillinConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 1212486199187554834L;

	/** 
	 * 账单累计已入账金额,精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/** 
	 * 2019091810299100060000003480
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 账单的状态，INIT：入账；VALID：出账；OVERDUE：逾期；CLEAR：账单结清
	 */
	@ApiField("bill_status")
	private String billStatus;

	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}
	public String getBillAmount( ) {
		return this.billAmount;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	public String getBillStatus( ) {
		return this.billStatus;
	}

}
