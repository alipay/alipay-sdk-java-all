package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保存本地商品日历库存
 *
 * @author auto create
 * @since 1.0, 2024-12-26 13:34:54
 */
public class AlipayOpenAppLocalitemCalendarstockSaveModel extends AlipayObject {

	private static final long serialVersionUID = 3171515252113148371L;

	/**
	 * 日历库存列表（商品维度），库存设置的总天数不得大于60天
	 */
	@ApiListField("calendar_stocks")
	@ApiField("item_calendar_stock_v_o")
	private List<ItemCalendarStockVO> calendarStocks;

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
	 * 日历库存列表（sku维度），库存设置的总天数不得大于60天。
	 */
	@ApiListField("sku_calendar_stocks")
	@ApiField("sku_calendar_stock_list_v_o")
	private List<SkuCalendarStockListVO> skuCalendarStocks;

	public List<ItemCalendarStockVO> getCalendarStocks() {
		return this.calendarStocks;
	}
	public void setCalendarStocks(List<ItemCalendarStockVO> calendarStocks) {
		this.calendarStocks = calendarStocks;
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

	public List<SkuCalendarStockListVO> getSkuCalendarStocks() {
		return this.skuCalendarStocks;
	}
	public void setSkuCalendarStocks(List<SkuCalendarStockListVO> skuCalendarStocks) {
		this.skuCalendarStocks = skuCalendarStocks;
	}

}
