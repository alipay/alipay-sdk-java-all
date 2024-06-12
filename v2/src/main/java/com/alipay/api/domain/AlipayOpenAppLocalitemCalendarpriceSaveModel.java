package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保存本地商品日历价格
 *
 * @author auto create
 * @since 1.0, 2024-04-19 11:34:39
 */
public class AlipayOpenAppLocalitemCalendarpriceSaveModel extends AlipayObject {

	private static final long serialVersionUID = 3644512273213558156L;

	/**
	 * 日历价格列表（商品维度），价格设置的总天数不得大于60天
	 */
	@ApiListField("calendar_prices")
	@ApiField("item_calendar_price_v_o")
	private List<ItemCalendarPriceVO> calendarPrices;

	/**
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。该字段特殊可选，与out_item_id不能同时为空，优先使用item_id。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商家侧商品ID，要求 APPID 下全局唯一。该字段特殊可选，与item_id不能同时为空，优先使用item_id。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 日历价格列表（sku维度），价格设置的总天数不得大于60天。
	 */
	@ApiListField("sku_calendar_prices")
	@ApiField("sku_calendar_price_list_v_o")
	private List<SkuCalendarPriceListVO> skuCalendarPrices;

	public List<ItemCalendarPriceVO> getCalendarPrices() {
		return this.calendarPrices;
	}
	public void setCalendarPrices(List<ItemCalendarPriceVO> calendarPrices) {
		this.calendarPrices = calendarPrices;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public List<SkuCalendarPriceListVO> getSkuCalendarPrices() {
		return this.skuCalendarPrices;
	}
	public void setSkuCalendarPrices(List<SkuCalendarPriceListVO> skuCalendarPrices) {
		this.skuCalendarPrices = skuCalendarPrices;
	}

}
