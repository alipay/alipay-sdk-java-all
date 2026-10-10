package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单交易信息
 *
 * @author auto create
 * @since 1.0, 2026-09-30 13:49:39
 */
public class IndustryInvoiceTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 2194883786644643394L;

	/**
	 * 交易渠道
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_biz_no")
	private String tradeBizNo;

	/**
	 * 订单交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易产品
	 */
	@ApiField("trade_product")
	private String tradeProduct;

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getTradeBizNo() {
		return this.tradeBizNo;
	}
	public void setTradeBizNo(String tradeBizNo) {
		this.tradeBizNo = tradeBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeProduct() {
		return this.tradeProduct;
	}
	public void setTradeProduct(String tradeProduct) {
		this.tradeProduct = tradeProduct;
	}

}
