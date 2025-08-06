package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.subaccountrefund.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-24 14:37:34
 */
public class AlipayCommerceLogisticsFreightflowSubaccountrefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4884842127926735163L;

	/** 
	 * 实际退款成功金额，单位分，仅当退款成功时消费。
	 */
	@ApiField("real_refund_amt")
	private String realRefundAmt;

	/** 
	 * 实际退款币种，人民币默认156或者CNY，仅当退款成功时消费。
	 */
	@ApiField("real_refund_amt_currency_value")
	private String realRefundAmtCurrencyValue;

	/** 
	 * 退款处理进度
  ○ 退款成功SUCCESS
  ○ 退款失败FAIL，本次应该不会出现
  ○ 退款处理中PROCESSING
  ○ 挂账CHARGE_UP，挂账代表退回到对方银行失败，网商内部挂账，请引导用户联系网商
	 */
	@ApiField("refund_status")
	private String refundStatus;

	public void setRealRefundAmt(String realRefundAmt) {
		this.realRefundAmt = realRefundAmt;
	}
	public String getRealRefundAmt( ) {
		return this.realRefundAmt;
	}

	public void setRealRefundAmtCurrencyValue(String realRefundAmtCurrencyValue) {
		this.realRefundAmtCurrencyValue = realRefundAmtCurrencyValue;
	}
	public String getRealRefundAmtCurrencyValue( ) {
		return this.realRefundAmtCurrencyValue;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

}
