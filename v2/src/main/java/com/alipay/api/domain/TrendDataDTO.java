package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:25:33
 */
public class TrendDataDTO extends AlipayObject {

	private static final long serialVersionUID = 1258271854538175458L;

	/**
	 * 渠道来源交易所 eg. SH
	 */
	@ApiField("channel_exchange")
	private String channelExchange;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("trend_item_d_t_o")
	private List<TrendItemDTO> items;

	/**
	 * 标的代码
	 */
	@ApiField("symbol")
	private String symbol;

	public String getChannelExchange() {
		return this.channelExchange;
	}
	public void setChannelExchange(String channelExchange) {
		this.channelExchange = channelExchange;
	}

	public List<TrendItemDTO> getItems() {
		return this.items;
	}
	public void setItems(List<TrendItemDTO> items) {
		this.items = items;
	}

	public String getSymbol() {
		return this.symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
