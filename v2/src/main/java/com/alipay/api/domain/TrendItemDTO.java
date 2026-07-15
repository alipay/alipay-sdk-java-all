package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:25:33
 */
public class TrendItemDTO extends AlipayObject {

	private static final long serialVersionUID = 1437868462328726387L;

	/**
	 * 当前周期成交额, 单位为元
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 均价，可能为空, 单位为元
	 */
	@ApiField("averagePrice")
	private Long averagePrice;

	/**
	 * 时间
	 */
	@ApiField("date")
	private Long date;

	/**
	 * 分时点所对应的价格, 单位为元
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 当前周期成交量, 单位为股
	 */
	@ApiField("volume")
	private Long volume;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getAveragePrice() {
		return this.averagePrice;
	}
	public void setAveragePrice(Long averagePrice) {
		this.averagePrice = averagePrice;
	}

	public Long getDate() {
		return this.date;
	}
	public void setDate(Long date) {
		this.date = date;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

}
