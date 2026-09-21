package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.trade.direct.close response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-15 16:38:10
 */
public class AlipayCommerceMedicalTradeDirectCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1128279744247124986L;

	/** 
	 * 支付宝交易单号
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/** 
	 * 外部交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 自费撤销描述
	 */
	@ApiField("own_pay_cancel_msg")
	private String ownPayCancelMsg;

	/** 
	 * 自费撤销状态
	 */
	@ApiField("own_pay_cancel_result")
	private String ownPayCancelResult;

	/** 
	 * 逸康交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo( ) {
		return this.alipayTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setOwnPayCancelMsg(String ownPayCancelMsg) {
		this.ownPayCancelMsg = ownPayCancelMsg;
	}
	public String getOwnPayCancelMsg( ) {
		return this.ownPayCancelMsg;
	}

	public void setOwnPayCancelResult(String ownPayCancelResult) {
		this.ownPayCancelResult = ownPayCancelResult;
	}
	public String getOwnPayCancelResult( ) {
		return this.ownPayCancelResult;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
