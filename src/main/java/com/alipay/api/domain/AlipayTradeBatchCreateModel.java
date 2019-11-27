package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合并下单接口
 *
 * @author auto create
 * @since 1.0, 2019-04-24 17:16:03
 */
public class AlipayTradeBatchCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6336323658592894452L;

	/**
	 * 买家id，统一请求下的多笔交易买家必须是相同的
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/**
	 * 交易信息列表，大的json数组格式[]。有多少笔交易，json数组大小就是多少。json数组中不带入买家信息。
	 */
	@ApiField("trade_info_list")
	private String tradeInfoList;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getTradeInfoList() {
		return this.tradeInfoList;
	}
	public void setTradeInfoList(String tradeInfoList) {
		this.tradeInfoList = tradeInfoList;
	}

}
