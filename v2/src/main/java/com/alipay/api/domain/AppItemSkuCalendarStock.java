package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * sku维度日历库存
 *
 * @author auto create
 * @since 1.0, 2025-07-11 16:28:03
 */
public class AppItemSkuCalendarStock extends AlipayObject {

	private static final long serialVersionUID = 2116129615961727222L;

	/**
	 * 日历库存对象列表，记录一段时间的库存信息
	 */
	@ApiListField("calendar_stocks")
	@ApiField("app_item_calendar_stock")
	private List<AppItemCalendarStock> calendarStocks;

	/**
	 * 商家侧sku ID，要求 APPID 下全局唯一。
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	public List<AppItemCalendarStock> getCalendarStocks() {
		return this.calendarStocks;
	}
	public void setCalendarStocks(List<AppItemCalendarStock> calendarStocks) {
		this.calendarStocks = calendarStocks;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

}
