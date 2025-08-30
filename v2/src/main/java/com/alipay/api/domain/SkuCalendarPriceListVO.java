package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * sku维度日历价格VO
 *
 * @author auto create
 * @since 1.0, 2024-04-19 11:34:39
 */
public class SkuCalendarPriceListVO extends AlipayObject {

	private static final long serialVersionUID = 2542697974668347495L;

	/**
	 * 日历价格对象列表，用于描述一段时间的价格
	 */
	@ApiListField("calendar_prices")
	@ApiField("item_calendar_price_v_o")
	private List<ItemCalendarPriceVO> calendarPrices;

	/**
	 * 商家侧skuId,必须是商家提报商品时所填的商家侧skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	public List<ItemCalendarPriceVO> getCalendarPrices() {
		return this.calendarPrices;
	}
	public void setCalendarPrices(List<ItemCalendarPriceVO> calendarPrices) {
		this.calendarPrices = calendarPrices;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

}
