package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业关系经营数据
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:29:11
 */
public class BusinessRelationTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 4726334457896714876L;

	/**
	 * 每笔交易金额范围
	 */
	@ApiField("avg_trade_amount")
	private String avgTradeAmount;

	/**
	 * 总交易额范围
	 */
	@ApiField("total_trade_amount")
	private String totalTradeAmount;

	/**
	 * 交易笔数范围
	 */
	@ApiField("trade_count")
	private String tradeCount;

	/**
	 * 客户交易人数范围
	 */
	@ApiField("user_count")
	private String userCount;

	/**
	 * 客单价范围
	 */
	@ApiField("user_trade_amount")
	private String userTradeAmount;

	public String getAvgTradeAmount() {
		return this.avgTradeAmount;
	}
	public void setAvgTradeAmount(String avgTradeAmount) {
		this.avgTradeAmount = avgTradeAmount;
	}

	public String getTotalTradeAmount() {
		return this.totalTradeAmount;
	}
	public void setTotalTradeAmount(String totalTradeAmount) {
		this.totalTradeAmount = totalTradeAmount;
	}

	public String getTradeCount() {
		return this.tradeCount;
	}
	public void setTradeCount(String tradeCount) {
		this.tradeCount = tradeCount;
	}

	public String getUserCount() {
		return this.userCount;
	}
	public void setUserCount(String userCount) {
		this.userCount = userCount;
	}

	public String getUserTradeAmount() {
		return this.userTradeAmount;
	}
	public void setUserTradeAmount(String userTradeAmount) {
		this.userTradeAmount = userTradeAmount;
	}

}
