package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一码通订单查询
 *
 * @author auto create
 * @since 1.0, 2024-01-26 16:13:17
 */
public class AlipayEbppIndustryOnecodepassOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4341885271358359287L;

	/**
	 * 机构编码
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 商户订单号。
和支付宝交易号不能同时为空
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 卖家支付宝用户ID。商户订单号不为空时，卖家支付宝用户ID必选
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 支付宝交易号。和商户订单号不能同时为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
