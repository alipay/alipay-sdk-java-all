package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.customs.declare response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-08 00:48:24
 */
public class AlipayTradeCustomsDeclareResponse extends AlipayResponse {

	private static final long serialVersionUID = 5463898171678833383L;

	/** 
	 * 支付宝报关流水号。
	 */
	@ApiField("alipay_declare_no")
	private String alipayDeclareNo;

	/** 
	 * 订购人身份信息和支付人的身份信息验证结果。T表示商户传入的订购人姓名和身份证号和支付人的姓名和身份证号一致。F代表商户传入的订购人姓名和身份证号和支付人的姓名和身份证号不一致。对于同一笔报关单支付宝只会校验一次，如果多次重推不会返回此参数。
	 */
	@ApiField("identity_check")
	private String identityCheck;

	/** 
	 * 支付宝推送到海关的支付单据号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAlipayDeclareNo(String alipayDeclareNo) {
		this.alipayDeclareNo = alipayDeclareNo;
	}
	public String getAlipayDeclareNo( ) {
		return this.alipayDeclareNo;
	}

	public void setIdentityCheck(String identityCheck) {
		this.identityCheck = identityCheck;
	}
	public String getIdentityCheck( ) {
		return this.identityCheck;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
