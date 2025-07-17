package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.onecodepass.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:29
 */
public class AlipayEbppIndustryOnecodepassOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5789197632836333154L;

	/** 
	 * 买家实付金额，单位为元，两位小数。该金额代表该笔交易买家实际支付的金额，不包含商户折扣等金额
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("org_buyer_openid")
	private String orgBuyerOpenid;

	/** 
	 * 买家在支付宝的unionid
	 */
	@ApiField("org_buyer_unionid")
	private String orgBuyerUnionid;

	/** 
	 * 商家订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * I("I", "等待付款"),
    N("N","付款失败"),
    C("C", "单据关闭"),
    F("F", "失败"),
    S("S", "成功"),
    H("H", "部分退款");
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}
	public String getBuyerPayAmount( ) {
		return this.buyerPayAmount;
	}

	public void setOrgBuyerOpenid(String orgBuyerOpenid) {
		this.orgBuyerOpenid = orgBuyerOpenid;
	}
	public String getOrgBuyerOpenid( ) {
		return this.orgBuyerOpenid;
	}

	public void setOrgBuyerUnionid(String orgBuyerUnionid) {
		this.orgBuyerUnionid = orgBuyerUnionid;
	}
	public String getOrgBuyerUnionid( ) {
		return this.orgBuyerUnionid;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
