package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒旅项目-每日价
 *
 * @author auto create
 * @since 1.0, 2025-03-26 10:34:17
 */
public class EtravelHotelSupplyDayPrice extends AlipayObject {

	private static final long serialVersionUID = 8898762547299692756L;

	/**
	 * 日期，格式：yyyy-MM-DD 如：2024-01-01
	 */
	@ApiField("date")
	private String date;

	/**
	 * 最终价格
	 */
	@ApiField("price")
	private EtravelHotelSupplyPriceDTO price;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public EtravelHotelSupplyPriceDTO getPrice() {
		return this.price;
	}
	public void setPrice(EtravelHotelSupplyPriceDTO price) {
		this.price = price;
	}

}
