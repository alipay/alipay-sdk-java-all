package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.repaybill.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-30 16:28:43
 */
public class AlipayTradeRepaybillModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2288139998186757712L;

	/** 
	 * 当前账单的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/** 
	 * 支付宝还款账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 账单逾期罚息金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_overdue_amount")
	private String billOverdueAmount;

	/** 
	 * 账单支付部分撤销金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_paid_revoked_amount")
	private String billPaidRevokedAmount;

	/** 
	 * 账单未支付部分已撤销金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_revoked_amount")
	private String billRevokedAmount;

	/** 
	 * 账单状态
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

	public void setBillOverdueAmount(String billOverdueAmount) {
		this.billOverdueAmount = billOverdueAmount;
	}
	public String getBillOverdueAmount( ) {
		return this.billOverdueAmount;
	}

	public void setBillPaidRevokedAmount(String billPaidRevokedAmount) {
		this.billPaidRevokedAmount = billPaidRevokedAmount;
	}
	public String getBillPaidRevokedAmount( ) {
		return this.billPaidRevokedAmount;
	}

	public void setBillRevokedAmount(String billRevokedAmount) {
		this.billRevokedAmount = billRevokedAmount;
	}
	public String getBillRevokedAmount( ) {
		return this.billRevokedAmount;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	public String getBillStatus( ) {
		return this.billStatus;
	}

}
