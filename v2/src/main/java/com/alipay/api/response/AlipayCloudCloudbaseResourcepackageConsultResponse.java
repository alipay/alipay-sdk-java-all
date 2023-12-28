package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-17 12:59:45
 */
public class AlipayCloudCloudbaseResourcepackageConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7775364542215458668L;

	/** 
	 * 币种
 - CNY
 - USD
 - EUR
	 */
	@ApiField("concurrency")
	private String concurrency;

	/** 
	 * 原价（分）
	 */
	@ApiField("original_price")
	private String originalPrice;

	/** 
	 * 成交价格（分）
	 */
	@ApiField("trade_price")
	private String tradePrice;

	public void setConcurrency(String concurrency) {
		this.concurrency = concurrency;
	}
	public String getConcurrency( ) {
		return this.concurrency;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getOriginalPrice( ) {
		return this.originalPrice;
	}

	public void setTradePrice(String tradePrice) {
		this.tradePrice = tradePrice;
	}
	public String getTradePrice( ) {
		return this.tradePrice;
	}

}
