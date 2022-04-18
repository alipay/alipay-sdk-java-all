package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自建盒子套餐内固定菜的模型
 *
 * @author auto create
 * @since 1.0, 2018-12-20 11:37:52
 */
public class PosFixedDishGroupModel extends AlipayObject {

	private static final long serialVersionUID = 4627752348862379468L;

	/**
	 * 固定菜的数量，有固定菜时必传
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 选中的sku的规格中文名
	 */
	@ApiField("detail_sku_spec_name")
	private String detailSkuSpecName;

	/**
	 * 菜品的单位中文名
	 */
	@ApiField("detail_sku_unit_name")
	private String detailSkuUnitName;

	/**
	 * 固定菜的菜品ID，有固定菜时必传
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 固定菜名字，仅在查询返回时返回
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 固定菜的组ID，更新的时候需要传
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 固定菜的售价,有固定菜时必传
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * 固定菜的SKU的id，有固定菜时必传
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 固定菜的排序字段，有固定菜时必传
	 */
	@ApiField("sort")
	private Long sort;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getDetailSkuSpecName() {
		return this.detailSkuSpecName;
	}
	public void setDetailSkuSpecName(String detailSkuSpecName) {
		this.detailSkuSpecName = detailSkuSpecName;
	}

	public String getDetailSkuUnitName() {
		return this.detailSkuUnitName;
	}
	public void setDetailSkuUnitName(String detailSkuUnitName) {
		this.detailSkuUnitName = detailSkuUnitName;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return this.dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

}
