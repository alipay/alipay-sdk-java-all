package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * sku维度日历库存VO
 *
 * @author auto create
 * @since 1.0, 2024-04-19 11:35:15
 */
public class SkuCalendarStockListVO extends AlipayObject {

	private static final long serialVersionUID = 4648952544698892149L;

	/**
	 * 日历价格对象列表，记录一段时间的价格信息
	 */
	@ApiListField("calendar_stocks")
	@ApiField("item_calendar_stock_v_o")
	private List<ItemCalendarStockVO> calendarStocks;

	/**
	 * 外部skuId，必须为商家提报商品时自定义填写的商家侧skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	public List<ItemCalendarStockVO> getCalendarStocks() {
		return this.calendarStocks;
	}
	public void setCalendarStocks(List<ItemCalendarStockVO> calendarStocks) {
		this.calendarStocks = calendarStocks;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

}
