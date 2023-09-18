package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜谱菜品明细简化模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:13:33
 */
public class KbdishCookDetailSimplifyInfo extends AlipayObject {

	private static final long serialVersionUID = 6166493584639946554L;

	/**
	 * 外部菜品id
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * 外部skuid
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 售卖价格
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * 排序值
	 */
	@ApiField("sort")
	private String sort;

	/**
	 * 菜品在菜谱中的售卖时间，同一个out_dish_id都指定的情况下 以第一个为准
	 */
	@ApiListField("time_ranges")
	@ApiField("string")
	private List<String> timeRanges;

	public String getOutDishId() {
		return this.outDishId;
	}
	public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

	public List<String> getTimeRanges() {
		return this.timeRanges;
	}
	public void setTimeRanges(List<String> timeRanges) {
		this.timeRanges = timeRanges;
	}

}
