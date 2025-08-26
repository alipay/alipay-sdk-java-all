package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日历库存列表
 *
 * @author auto create
 * @since 1.0, 2025-07-11 16:28:03
 */
public class AppItemCalendarStock extends AlipayObject {

	private static final long serialVersionUID = 1521461799956873364L;

	/**
	 * 库存的有效开始日期。 等于或晚于当前日期且在120天内(即不接收120天后的数据) 。格式：yyyy-MM-dd 如2023-09-26
	 */
	@ApiField("date")
	private String date;

	/**
	 * 目前支持库存区间0~99999
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
