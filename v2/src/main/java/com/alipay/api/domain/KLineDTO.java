package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据项，类型为KLineDTO
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:27:46
 */
public class KLineDTO extends AlipayObject {

	private static final long serialVersionUID = 4244848157936379527L;

	/**
	 * 成交额，单元为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 收盘价，单元为元
	 */
	@ApiField("close_price")
	private String closePrice;

	/**
	 * 时间
	 */
	@ApiField("date")
	private String date;

	/**
	 * 最高价，单元为元
	 */
	@ApiField("high_price")
	private String highPrice;

	/**
	 * 最低价，单元为元
	 */
	@ApiField("low_price")
	private String lowPrice;

	/**
	 * 开盘价，单元为元
	 */
	@ApiField("open_price")
	private String openPrice;

	/**
	 * 前收价，单元为元
	 */
	@ApiField("previous_price")
	private String previousPrice;

	/**
	 * 成交量，单元为股数
	 */
	@ApiField("volume")
	private String volume;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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

	public String getOpenPrice() {
		return this.openPrice;
	}
	public void setOpenPrice(String openPrice) {
		this.openPrice = openPrice;
	}

	public String getPreviousPrice() {
		return this.previousPrice;
	}
	public void setPreviousPrice(String previousPrice) {
		this.previousPrice = previousPrice;
	}

	public String getVolume() {
		return this.volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}

}
