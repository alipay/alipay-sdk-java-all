package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组合菜详情的复杂类型
 *
 * @author auto create
 * @since 1.0, 2018-12-20 11:37:52
 */
public class PosDishGroupDetailModel extends AlipayObject {

	private static final long serialVersionUID = 5499629573168566397L;

	/**
	 * 详情菜的加价
	 */
	@ApiField("add_price")
	private String addPrice;

	/**
	 * 详情菜可以点的份数
	 */
	@ApiField("detail_count")
	private Long detailCount;

	/**
	 * 详情菜的菜品id
	 */
	@ApiField("detail_dish_id")
	private String detailDishId;

	/**
	 * 组合菜的名字，查询的返回值
	 */
	@ApiField("detail_dish_name")
	private String detailDishName;

	/**
	 * 是否是默认的项目组详情
	 */
	@ApiField("detail_is_default")
	private String detailIsDefault;

	/**
	 * 详情菜sku的id
	 */
	@ApiField("detail_sku_id")
	private String detailSkuId;

	/**
	 * 选中的菜品的规格中文名
	 */
	@ApiField("detail_sku_spec_name")
	private String detailSkuSpecName;

	/**
	 * 菜品的单位
	 */
	@ApiField("detail_sku_unit_name")
	private String detailSkuUnitName;

	/**
	 * 详情菜的排序
	 */
	@ApiField("detail_sort")
	private Long detailSort;

	/**
	 * 组合菜的ID，这个只是查询的返回值，一般不用传
	 */
	@ApiField("group_id")
	private String groupId;

	public String getAddPrice() {
		return this.addPrice;
	}
	public void setAddPrice(String addPrice) {
		this.addPrice = addPrice;
	}

	public Long getDetailCount() {
		return this.detailCount;
	}
	public void setDetailCount(Long detailCount) {
		this.detailCount = detailCount;
	}

	public String getDetailDishId() {
		return this.detailDishId;
	}
	public void setDetailDishId(String detailDishId) {
		this.detailDishId = detailDishId;
	}

	public String getDetailDishName() {
		return this.detailDishName;
	}
	public void setDetailDishName(String detailDishName) {
		this.detailDishName = detailDishName;
	}

	public String getDetailIsDefault() {
		return this.detailIsDefault;
	}
	public void setDetailIsDefault(String detailIsDefault) {
		this.detailIsDefault = detailIsDefault;
	}

	public String getDetailSkuId() {
		return this.detailSkuId;
	}
	public void setDetailSkuId(String detailSkuId) {
		this.detailSkuId = detailSkuId;
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

	public Long getDetailSort() {
		return this.detailSort;
	}
	public void setDetailSort(Long detailSort) {
		this.detailSort = detailSort;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
