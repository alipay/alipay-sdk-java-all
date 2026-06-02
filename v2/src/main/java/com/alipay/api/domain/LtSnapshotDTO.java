package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-08 17:52:44
 */
public class LtSnapshotDTO extends AlipayObject {

	private static final long serialVersionUID = 8116299269274985838L;

	/**
	 * 盘后竞价成交额
	 */
	@ApiField("after_market_amount")
	private String afterMarketAmount;

	/**
	 * null
	 */
	@ApiListField("after_market_buy_orders")
	@ApiField("lt_order_d_t_o")
	private List<LtOrderDTO> afterMarketBuyOrders;

	/**
	 * 盘后竞价买入申报数量,当前未成交的买入申报总股数
	 */
	@ApiField("after_market_buy_volume")
	private String afterMarketBuyVolume;

	/**
	 * 盘后竞价价格
	 */
	@ApiField("after_market_price")
	private String afterMarketPrice;

	/**
	 * null
	 */
	@ApiListField("after_market_sell_orders")
	@ApiField("lt_order_d_t_o")
	private List<LtOrderDTO> afterMarketSellOrders;

	/**
	 * 盘后竞价卖出申报数量
	 */
	@ApiField("after_market_sell_volume")
	private String afterMarketSellVolume;

	/**
	 * 盘后竞价最后交易时间
	 */
	@ApiField("after_market_trade_time")
	private String afterMarketTradeTime;

	/**
	 * 盘后竞价交易状态说明, 参考枚举 AfterMarketTradingPhase
	 */
	@ApiField("after_market_trading_phase")
	private String afterMarketTradingPhase;

	/**
	 * 盘后固定价格交易成交笔数
	 */
	@ApiField("after_market_transactions")
	private String afterMarketTransactions;

	/**
	 * 盘后竞价成交量
	 */
	@ApiField("after_market_volume")
	private String afterMarketVolume;

	/**
	 * 成交额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * null
	 */
	@ApiListField("asks")
	@ApiField("lt_bid_ask_level_d_t_o")
	private List<LtBidAskLevelDTO> asks;

	/**
	 * 市场状态归属日期
	 */
	@ApiField("belong_day")
	private String belongDay;

	/**
	 * null
	 */
	@ApiListField("bids")
	@ApiField("lt_bid_ask_level_d_t_o")
	private List<LtBidAskLevelDTO> bids;

	/**
	 * 大单参数,超过多少单算作大单
	 */
	@ApiField("big_order_volume")
	private String bigOrderVolume;

	/**
	 * 涨跌幅
	 */
	@ApiField("change_percent")
	private String changePercent;

	/**
	 * 涨跌额
	 */
	@ApiField("change_price")
	private String changePrice;

	/**
	 * 价格涨跌状态
	 */
	@ApiField("change_price_status")
	private String changePriceStatus;

	/**
	 * 渠道来源交易所 eg. SH
	 */
	@ApiField("channel_exchange")
	private String channelExchange;

	/**
	 * 渠道来源数据质量 eg. L1
	 */
	@ApiField("channel_level")
	private String channelLevel;

	/**
	 * 收盘价
	 */
	@ApiField("close_price")
	private String closePrice;

	/**
	 * 时间, 最后交易的时间
	 */
	@ApiField("date")
	private String date;

	/**
	 * 跌停价
	 */
	@ApiField("down_price")
	private String downPrice;

	/**
	 * 最高价
	 */
	@ApiField("high_price")
	private String highPrice;

	/**
	 * 基金IOPV
	 */
	@ApiField("iopv")
	private String iopv;

	/**
	 * 基金IOPV iopvTm1
	 */
	@ApiField("iopv_tm_1")
	private String iopvTm1;

	/**
	 * 涨/跌停状态
	 */
	@ApiField("limit_state")
	private String limitState;

	/**
	 * 最低价
	 */
	@ApiField("low_price")
	private String lowPrice;

	/**
	 * 市场状态
	 */
	@ApiField("market_state")
	private String marketState;

	/**
	 * 市场状态描述
	 */
	@ApiField("market_state_desc")
	private String marketStateDesc;

	/**
	 * 买盘限价上限(港股通)
	 */
	@ApiField("max_buy_limit_price")
	private String maxBuyLimitPrice;

	/**
	 * 卖盘限价上限(港股通)
	 */
	@ApiField("max_sell_limit_price")
	private String maxSellLimitPrice;

	/**
	 * 买盘限价下限(港股通)
	 */
	@ApiField("min_buy_limit_price")
	private String minBuyLimitPrice;

	/**
	 * 卖盘限价下限(港股通)
	 */
	@ApiField("min_sell_limit_price")
	private String minSellLimitPrice;

	/**
	 * 中文名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 开盘价
	 */
	@ApiField("open_price")
	private String openPrice;

	/**
	 * 溢价率（基金）
	 */
	@ApiField("premium_rate")
	private String premiumRate;

	/**
	 * 昨收价
	 */
	@ApiField("previous_close")
	private String previousClose;

	/**
	 * 当前价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 振幅
	 */
	@ApiField("range_percent")
	private String rangePercent;

	/**
	 * 数据状况 1,NORMAL 正常，2,ABNORMAL 不正常  参考枚举 level2.proto SituationType,沪深 L2 专用
	 */
	@ApiField("situation")
	private String situation;

	/**
	 * 快照生成时间(前置机), 递增时间戳
	 */
	@ApiField("snapshot_date")
	private String snapshotDate;

	/**
	 * 停牌, 长期停牌, 临时停牌等
	 */
	@ApiField("suspension_state")
	private String suspensionState;

	/**
	 * 代码
	 */
	@ApiField("symbol")
	private String symbol;

	/**
	 * 最小价差(港股通)
	 */
	@ApiField("tick_size")
	private String tickSize;

	/**
	 * 市场所属时区
	 */
	@ApiField("time_zone")
	private String timeZone;

	/**
	 * 委卖总量 对应L1 totalSellVolume
	 */
	@ApiField("total_ask_volume")
	private String totalAskVolume;

	/**
	 * 委买总量 对应L1 totalBuyVolume
	 */
	@ApiField("total_bid_volume")
	private String totalBidVolume;

	/**
	 * 集合竞价, 交易中, 休市, 收盘集合竞价, 熔断等
	 */
	@ApiField("trade_state")
	private String tradeState;

	/**
	 * 涨停价
	 */
	@ApiField("up_price")
	private String upPrice;

	/**
	 * 成交量
	 */
	@ApiField("volume")
	private String volume;

	/**
	 * 加权委托卖出均价 对应L1 averageSellPrice
	 */
	@ApiField("weighted_ask_price")
	private String weightedAskPrice;

	/**
	 * // 加权委托买入价 对应L1 averageBuyPrice
	 */
	@ApiField("weighted_bid_price")
	private String weightedBidPrice;

	public String getAfterMarketAmount() {
		return this.afterMarketAmount;
	}
	public void setAfterMarketAmount(String afterMarketAmount) {
		this.afterMarketAmount = afterMarketAmount;
	}

	public List<LtOrderDTO> getAfterMarketBuyOrders() {
		return this.afterMarketBuyOrders;
	}
	public void setAfterMarketBuyOrders(List<LtOrderDTO> afterMarketBuyOrders) {
		this.afterMarketBuyOrders = afterMarketBuyOrders;
	}

	public String getAfterMarketBuyVolume() {
		return this.afterMarketBuyVolume;
	}
	public void setAfterMarketBuyVolume(String afterMarketBuyVolume) {
		this.afterMarketBuyVolume = afterMarketBuyVolume;
	}

	public String getAfterMarketPrice() {
		return this.afterMarketPrice;
	}
	public void setAfterMarketPrice(String afterMarketPrice) {
		this.afterMarketPrice = afterMarketPrice;
	}

	public List<LtOrderDTO> getAfterMarketSellOrders() {
		return this.afterMarketSellOrders;
	}
	public void setAfterMarketSellOrders(List<LtOrderDTO> afterMarketSellOrders) {
		this.afterMarketSellOrders = afterMarketSellOrders;
	}

	public String getAfterMarketSellVolume() {
		return this.afterMarketSellVolume;
	}
	public void setAfterMarketSellVolume(String afterMarketSellVolume) {
		this.afterMarketSellVolume = afterMarketSellVolume;
	}

	public String getAfterMarketTradeTime() {
		return this.afterMarketTradeTime;
	}
	public void setAfterMarketTradeTime(String afterMarketTradeTime) {
		this.afterMarketTradeTime = afterMarketTradeTime;
	}

	public String getAfterMarketTradingPhase() {
		return this.afterMarketTradingPhase;
	}
	public void setAfterMarketTradingPhase(String afterMarketTradingPhase) {
		this.afterMarketTradingPhase = afterMarketTradingPhase;
	}

	public String getAfterMarketTransactions() {
		return this.afterMarketTransactions;
	}
	public void setAfterMarketTransactions(String afterMarketTransactions) {
		this.afterMarketTransactions = afterMarketTransactions;
	}

	public String getAfterMarketVolume() {
		return this.afterMarketVolume;
	}
	public void setAfterMarketVolume(String afterMarketVolume) {
		this.afterMarketVolume = afterMarketVolume;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<LtBidAskLevelDTO> getAsks() {
		return this.asks;
	}
	public void setAsks(List<LtBidAskLevelDTO> asks) {
		this.asks = asks;
	}

	public String getBelongDay() {
		return this.belongDay;
	}
	public void setBelongDay(String belongDay) {
		this.belongDay = belongDay;
	}

	public List<LtBidAskLevelDTO> getBids() {
		return this.bids;
	}
	public void setBids(List<LtBidAskLevelDTO> bids) {
		this.bids = bids;
	}

	public String getBigOrderVolume() {
		return this.bigOrderVolume;
	}
	public void setBigOrderVolume(String bigOrderVolume) {
		this.bigOrderVolume = bigOrderVolume;
	}

	public String getChangePercent() {
		return this.changePercent;
	}
	public void setChangePercent(String changePercent) {
		this.changePercent = changePercent;
	}

	public String getChangePrice() {
		return this.changePrice;
	}
	public void setChangePrice(String changePrice) {
		this.changePrice = changePrice;
	}

	public String getChangePriceStatus() {
		return this.changePriceStatus;
	}
	public void setChangePriceStatus(String changePriceStatus) {
		this.changePriceStatus = changePriceStatus;
	}

	public String getChannelExchange() {
		return this.channelExchange;
	}
	public void setChannelExchange(String channelExchange) {
		this.channelExchange = channelExchange;
	}

	public String getChannelLevel() {
		return this.channelLevel;
	}
	public void setChannelLevel(String channelLevel) {
		this.channelLevel = channelLevel;
	}

	public String getClosePrice() {
		return this.closePrice;
	}
	public void setClosePrice(String closePrice) {
		this.closePrice = closePrice;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getDownPrice() {
		return this.downPrice;
	}
	public void setDownPrice(String downPrice) {
		this.downPrice = downPrice;
	}

	public String getHighPrice() {
		return this.highPrice;
	}
	public void setHighPrice(String highPrice) {
		this.highPrice = highPrice;
	}

	public String getIopv() {
		return this.iopv;
	}
	public void setIopv(String iopv) {
		this.iopv = iopv;
	}

	public String getIopvTm1() {
		return this.iopvTm1;
	}
	public void setIopvTm1(String iopvTm1) {
		this.iopvTm1 = iopvTm1;
	}

	public String getLimitState() {
		return this.limitState;
	}
	public void setLimitState(String limitState) {
		this.limitState = limitState;
	}

	public String getLowPrice() {
		return this.lowPrice;
	}
	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
	}

	public String getMarketState() {
		return this.marketState;
	}
	public void setMarketState(String marketState) {
		this.marketState = marketState;
	}

	public String getMarketStateDesc() {
		return this.marketStateDesc;
	}
	public void setMarketStateDesc(String marketStateDesc) {
		this.marketStateDesc = marketStateDesc;
	}

	public String getMaxBuyLimitPrice() {
		return this.maxBuyLimitPrice;
	}
	public void setMaxBuyLimitPrice(String maxBuyLimitPrice) {
		this.maxBuyLimitPrice = maxBuyLimitPrice;
	}

	public String getMaxSellLimitPrice() {
		return this.maxSellLimitPrice;
	}
	public void setMaxSellLimitPrice(String maxSellLimitPrice) {
		this.maxSellLimitPrice = maxSellLimitPrice;
	}

	public String getMinBuyLimitPrice() {
		return this.minBuyLimitPrice;
	}
	public void setMinBuyLimitPrice(String minBuyLimitPrice) {
		this.minBuyLimitPrice = minBuyLimitPrice;
	}

	public String getMinSellLimitPrice() {
		return this.minSellLimitPrice;
	}
	public void setMinSellLimitPrice(String minSellLimitPrice) {
		this.minSellLimitPrice = minSellLimitPrice;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenPrice() {
		return this.openPrice;
	}
	public void setOpenPrice(String openPrice) {
		this.openPrice = openPrice;
	}

	public String getPremiumRate() {
		return this.premiumRate;
	}
	public void setPremiumRate(String premiumRate) {
		this.premiumRate = premiumRate;
	}

	public String getPreviousClose() {
		return this.previousClose;
	}
	public void setPreviousClose(String previousClose) {
		this.previousClose = previousClose;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getRangePercent() {
		return this.rangePercent;
	}
	public void setRangePercent(String rangePercent) {
		this.rangePercent = rangePercent;
	}

	public String getSituation() {
		return this.situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}

	public String getSnapshotDate() {
		return this.snapshotDate;
	}
	public void setSnapshotDate(String snapshotDate) {
		this.snapshotDate = snapshotDate;
	}

	public String getSuspensionState() {
		return this.suspensionState;
	}
	public void setSuspensionState(String suspensionState) {
		this.suspensionState = suspensionState;
	}

	public String getSymbol() {
		return this.symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getTickSize() {
		return this.tickSize;
	}
	public void setTickSize(String tickSize) {
		this.tickSize = tickSize;
	}

	public String getTimeZone() {
		return this.timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getTotalAskVolume() {
		return this.totalAskVolume;
	}
	public void setTotalAskVolume(String totalAskVolume) {
		this.totalAskVolume = totalAskVolume;
	}

	public String getTotalBidVolume() {
		return this.totalBidVolume;
	}
	public void setTotalBidVolume(String totalBidVolume) {
		this.totalBidVolume = totalBidVolume;
	}

	public String getTradeState() {
		return this.tradeState;
	}
	public void setTradeState(String tradeState) {
		this.tradeState = tradeState;
	}

	public String getUpPrice() {
		return this.upPrice;
	}
	public void setUpPrice(String upPrice) {
		this.upPrice = upPrice;
	}

	public String getVolume() {
		return this.volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getWeightedAskPrice() {
		return this.weightedAskPrice;
	}
	public void setWeightedAskPrice(String weightedAskPrice) {
		this.weightedAskPrice = weightedAskPrice;
	}

	public String getWeightedBidPrice() {
		return this.weightedBidPrice;
	}
	public void setWeightedBidPrice(String weightedBidPrice) {
		this.weightedBidPrice = weightedBidPrice;
	}

}
