package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保存普通商品日历库存
 *
 * @author auto create
 * @since 1.0, 2025-07-11 16:28:03
 */
public class AlipayOpenAppItemCalendarstockSaveModel extends AlipayObject {

	private static final long serialVersionUID = 3217392732421365256L;

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
	 * sku维度库存列表
	 */
	@ApiListField("sku_calendar_stocks")
	@ApiField("app_item_sku_calendar_stock")
	private List<AppItemSkuCalendarStock> skuCalendarStocks;

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

	public List<AppItemSkuCalendarStock> getSkuCalendarStocks() {
		return this.skuCalendarStocks;
	}
	public void setSkuCalendarStocks(List<AppItemSkuCalendarStock> skuCalendarStocks) {
		this.skuCalendarStocks = skuCalendarStocks;
	}

}
