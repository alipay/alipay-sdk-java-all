package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 股票快照(报价)对象
 *
 * @author auto create
 * @since 1.0, 2020-10-26 14:22:33
 */
public class SnapshotDTO extends AlipayObject {

	private static final long serialVersionUID = 8289216722573282865L;

	/**
	 * 盘后竞价成交量
	 */
	@ApiField("after_market_amount")
	private String afterMarketAmount;

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
	 * 盘后竞价卖出申报数量,当前未成交的卖出申报总股数
	 */
	@ApiField("after_market_sell_volume")
	private String afterMarketSellVolume;

	/**
	 * 盘后竞价最后交易时间
	 */
	@ApiField("after_market_trade_time")
	private String afterMarketTradeTime;

	/**
	 * 盘后竞价交易状态,参考枚举 AfterMarketTradingPhase
	 */
	@ApiField("after_market_trading_phase")
	private String afterMarketTradingPhase;

	/**
	 * 盘后竞价成交额
	 */
	@ApiField("after_market_volume")
	private String afterMarketVolume;

	/**
	 * 成交额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 卖出1价
	 */
	@ApiField("ask_price_1")
	private String askPrice1;

	/**
	 * 卖出10价
	 */
	@ApiField("ask_price_10")
	private String askPrice10;

	/**
	 * 卖出2价
	 */
	@ApiField("ask_price_2")
	private String askPrice2;

	/**
	 * 卖出3价
	 */
	@ApiField("ask_price_3")
	private String askPrice3;

	/**
	 * 卖出4价
	 */
	@ApiField("ask_price_4")
	private String askPrice4;

	/**
	 * 卖出5价
	 */
	@ApiField("ask_price_5")
	private String askPrice5;

	/**
	 * 卖出6价
	 */
	@ApiField("ask_price_6")
	private String askPrice6;

	/**
	 * 卖出7价
	 */
	@ApiField("ask_price_7")
	private String askPrice7;

	/**
	 * 卖出8价
	 */
	@ApiField("ask_price_8")
	private String askPrice8;

	/**
	 * 卖出9价
	 */
	@ApiField("ask_price_9")
	private String askPrice9;

	/**
	 * 卖出1量
	 */
	@ApiField("ask_volume_1")
	private String askVolume1;

	/**
	 * 卖出10量
	 */
	@ApiField("ask_volume_10")
	private String askVolume10;

	/**
	 * 卖出2量
	 */
	@ApiField("ask_volume_2")
	private String askVolume2;

	/**
	 * 卖出3量
	 */
	@ApiField("ask_volume_3")
	private String askVolume3;

	/**
	 * 卖出4量
	 */
	@ApiField("ask_volume_4")
	private String askVolume4;

	/**
	 * 卖出5量
	 */
	@ApiField("ask_volume_5")
	private String askVolume5;

	/**
	 * 卖出6量
	 */
	@ApiField("ask_volume_6")
	private String askVolume6;

	/**
	 * 卖出7量
	 */
	@ApiField("ask_volume_7")
	private String askVolume7;

	/**
	 * 卖出8量
	 */
	@ApiField("ask_volume_8")
	private String askVolume8;

	/**
	 * 卖出9量
	 */
	@ApiField("ask_volume_9")
	private String askVolume9;

	/**
	 * 买入1价
	 */
	@ApiField("bid_price_1")
	private String bidPrice1;

	/**
	 * 买入10价
	 */
	@ApiField("bid_price_10")
	private String bidPrice10;

	/**
	 * 卖入2价
	 */
	@ApiField("bid_price_2")
	private String bidPrice2;

	/**
	 * 卖入3价
	 */
	@ApiField("bid_price_3")
	private String bidPrice3;

	/**
	 * 买入4价
	 */
	@ApiField("bid_price_4")
	private String bidPrice4;

	/**
	 * 买入5价
	 */
	@ApiField("bid_price_5")
	private String bidPrice5;

	/**
	 * 买入6价
	 */
	@ApiField("bid_price_6")
	private String bidPrice6;

	/**
	 * 买入7价
	 */
	@ApiField("bid_price_7")
	private String bidPrice7;

	/**
	 * 买入8价
	 */
	@ApiField("bid_price_8")
	private String bidPrice8;

	/**
	 * 买入9价
	 */
	@ApiField("bid_price_9")
	private String bidPrice9;

	/**
	 * 买入1量
	 */
	@ApiField("bid_volume_1")
	private String bidVolume1;

	/**
	 * 买入10量
	 */
	@ApiField("bid_volume_10")
	private String bidVolume10;

	/**
	 * 买入2量
	 */
	@ApiField("bid_volume_2")
	private String bidVolume2;

	/**
	 * 买入3量
	 */
	@ApiField("bid_volume_3")
	private String bidVolume3;

	/**
	 * 买入4量
	 */
	@ApiField("bid_volume_4")
	private String bidVolume4;

	/**
	 * 买入5量
	 */
	@ApiField("bid_volume_5")
	private String bidVolume5;

	/**
	 * 买入6量
	 */
	@ApiField("bid_volume_6")
	private String bidVolume6;

	/**
	 * 买入7量
	 */
	@ApiField("bid_volume_7")
	private String bidVolume7;

	/**
	 * 买入8量
	 */
	@ApiField("bid_volume_8")
	private String bidVolume8;

	/**
	 * 买入9量
	 */
	@ApiField("bid_volume_9")
	private String bidVolume9;

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
	 * 收盘价
	 */
	@ApiField("close_price")
	private String closePrice;

	/**
	 * 最后交易的时间戳
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
	 * 最低价
	 */
	@ApiField("low_price")
	private String lowPrice;

	/**
	 * 股票名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 开盘价
	 */
	@ApiField("open_price")
	private String openPrice;

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
	 * 停牌状态，未停牌(SP_NO)
	 */
	@ApiField("suspension_state")
	private String suspensionState;

	/**
	 * 股票唯一代码，symbol=code.market
	 */
	@ApiField("symbol")
	private String symbol;

	/**
	 * 交易状态
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

	public String getAfterMarketAmount() {
		return this.afterMarketAmount;
	}
	public void setAfterMarketAmount(String afterMarketAmount) {
		this.afterMarketAmount = afterMarketAmount;
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

	public String getAskPrice1() {
		return this.askPrice1;
	}
	public void setAskPrice1(String askPrice1) {
		this.askPrice1 = askPrice1;
	}

	public String getAskPrice10() {
		return this.askPrice10;
	}
	public void setAskPrice10(String askPrice10) {
		this.askPrice10 = askPrice10;
	}

	public String getAskPrice2() {
		return this.askPrice2;
	}
	public void setAskPrice2(String askPrice2) {
		this.askPrice2 = askPrice2;
	}

	public String getAskPrice3() {
		return this.askPrice3;
	}
	public void setAskPrice3(String askPrice3) {
		this.askPrice3 = askPrice3;
	}

	public String getAskPrice4() {
		return this.askPrice4;
	}
	public void setAskPrice4(String askPrice4) {
		this.askPrice4 = askPrice4;
	}

	public String getAskPrice5() {
		return this.askPrice5;
	}
	public void setAskPrice5(String askPrice5) {
		this.askPrice5 = askPrice5;
	}

	public String getAskPrice6() {
		return this.askPrice6;
	}
	public void setAskPrice6(String askPrice6) {
		this.askPrice6 = askPrice6;
	}

	public String getAskPrice7() {
		return this.askPrice7;
	}
	public void setAskPrice7(String askPrice7) {
		this.askPrice7 = askPrice7;
	}

	public String getAskPrice8() {
		return this.askPrice8;
	}
	public void setAskPrice8(String askPrice8) {
		this.askPrice8 = askPrice8;
	}

	public String getAskPrice9() {
		return this.askPrice9;
	}
	public void setAskPrice9(String askPrice9) {
		this.askPrice9 = askPrice9;
	}

	public String getAskVolume1() {
		return this.askVolume1;
	}
	public void setAskVolume1(String askVolume1) {
		this.askVolume1 = askVolume1;
	}

	public String getAskVolume10() {
		return this.askVolume10;
	}
	public void setAskVolume10(String askVolume10) {
		this.askVolume10 = askVolume10;
	}

	public String getAskVolume2() {
		return this.askVolume2;
	}
	public void setAskVolume2(String askVolume2) {
		this.askVolume2 = askVolume2;
	}

	public String getAskVolume3() {
		return this.askVolume3;
	}
	public void setAskVolume3(String askVolume3) {
		this.askVolume3 = askVolume3;
	}

	public String getAskVolume4() {
		return this.askVolume4;
	}
	public void setAskVolume4(String askVolume4) {
		this.askVolume4 = askVolume4;
	}

	public String getAskVolume5() {
		return this.askVolume5;
	}
	public void setAskVolume5(String askVolume5) {
		this.askVolume5 = askVolume5;
	}

	public String getAskVolume6() {
		return this.askVolume6;
	}
	public void setAskVolume6(String askVolume6) {
		this.askVolume6 = askVolume6;
	}

	public String getAskVolume7() {
		return this.askVolume7;
	}
	public void setAskVolume7(String askVolume7) {
		this.askVolume7 = askVolume7;
	}

	public String getAskVolume8() {
		return this.askVolume8;
	}
	public void setAskVolume8(String askVolume8) {
		this.askVolume8 = askVolume8;
	}

	public String getAskVolume9() {
		return this.askVolume9;
	}
	public void setAskVolume9(String askVolume9) {
		this.askVolume9 = askVolume9;
	}

	public String getBidPrice1() {
		return this.bidPrice1;
	}
	public void setBidPrice1(String bidPrice1) {
		this.bidPrice1 = bidPrice1;
	}

	public String getBidPrice10() {
		return this.bidPrice10;
	}
	public void setBidPrice10(String bidPrice10) {
		this.bidPrice10 = bidPrice10;
	}

	public String getBidPrice2() {
		return this.bidPrice2;
	}
	public void setBidPrice2(String bidPrice2) {
		this.bidPrice2 = bidPrice2;
	}

	public String getBidPrice3() {
		return this.bidPrice3;
	}
	public void setBidPrice3(String bidPrice3) {
		this.bidPrice3 = bidPrice3;
	}

	public String getBidPrice4() {
		return this.bidPrice4;
	}
	public void setBidPrice4(String bidPrice4) {
		this.bidPrice4 = bidPrice4;
	}

	public String getBidPrice5() {
		return this.bidPrice5;
	}
	public void setBidPrice5(String bidPrice5) {
		this.bidPrice5 = bidPrice5;
	}

	public String getBidPrice6() {
		return this.bidPrice6;
	}
	public void setBidPrice6(String bidPrice6) {
		this.bidPrice6 = bidPrice6;
	}

	public String getBidPrice7() {
		return this.bidPrice7;
	}
	public void setBidPrice7(String bidPrice7) {
		this.bidPrice7 = bidPrice7;
	}

	public String getBidPrice8() {
		return this.bidPrice8;
	}
	public void setBidPrice8(String bidPrice8) {
		this.bidPrice8 = bidPrice8;
	}

	public String getBidPrice9() {
		return this.bidPrice9;
	}
	public void setBidPrice9(String bidPrice9) {
		this.bidPrice9 = bidPrice9;
	}

	public String getBidVolume1() {
		return this.bidVolume1;
	}
	public void setBidVolume1(String bidVolume1) {
		this.bidVolume1 = bidVolume1;
	}

	public String getBidVolume10() {
		return this.bidVolume10;
	}
	public void setBidVolume10(String bidVolume10) {
		this.bidVolume10 = bidVolume10;
	}

	public String getBidVolume2() {
		return this.bidVolume2;
	}
	public void setBidVolume2(String bidVolume2) {
		this.bidVolume2 = bidVolume2;
	}

	public String getBidVolume3() {
		return this.bidVolume3;
	}
	public void setBidVolume3(String bidVolume3) {
		this.bidVolume3 = bidVolume3;
	}

	public String getBidVolume4() {
		return this.bidVolume4;
	}
	public void setBidVolume4(String bidVolume4) {
		this.bidVolume4 = bidVolume4;
	}

	public String getBidVolume5() {
		return this.bidVolume5;
	}
	public void setBidVolume5(String bidVolume5) {
		this.bidVolume5 = bidVolume5;
	}

	public String getBidVolume6() {
		return this.bidVolume6;
	}
	public void setBidVolume6(String bidVolume6) {
		this.bidVolume6 = bidVolume6;
	}

	public String getBidVolume7() {
		return this.bidVolume7;
	}
	public void setBidVolume7(String bidVolume7) {
		this.bidVolume7 = bidVolume7;
	}

	public String getBidVolume8() {
		return this.bidVolume8;
	}
	public void setBidVolume8(String bidVolume8) {
		this.bidVolume8 = bidVolume8;
	}

	public String getBidVolume9() {
		return this.bidVolume9;
	}
	public void setBidVolume9(String bidVolume9) {
		this.bidVolume9 = bidVolume9;
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

	public String getLowPrice() {
		return this.lowPrice;
	}
	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
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

}
