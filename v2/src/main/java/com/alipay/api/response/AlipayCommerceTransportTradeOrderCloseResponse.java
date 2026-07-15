package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.trade.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-29 15:52:57
 */
public class AlipayCommerceTransportTradeOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6243953132751696436L;

	/** 
	 * 恒星平台订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 商户侧业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 商户侧业务子流水号
	 */
	@ApiField("out_sub_biz_no")
	private String outSubBizNo;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setOutSubBizNo(String outSubBizNo) {
		this.outSubBizNo = outSubBizNo;
	}
	public String getOutSubBizNo( ) {
		return this.outSubBizNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
