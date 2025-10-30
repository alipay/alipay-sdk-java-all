package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组明细
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:14:55
 */
public class KbdishGroupDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 8751593463643626578L;

	/**
	 * 组下明细的加价单价 例如加2元 加3元
	 */
	@ApiField("add_price")
	private String addPrice;

	/**
	 * 明细菜品在套餐里的个数,
	 */
	@ApiField("detail_count")
	private String detailCount;

	/**
	 * 菜品id
	 */
	@ApiField("detail_dish_id")
	private String detailDishId;

	/**
	 * 组下面的菜品是否默认 Y/N，该字段目前废弃
	 */
	@ApiField("detail_is_default")
	private String detailIsDefault;

	/**
	 * 分组下包含的明细菜品的sku_id
	 */
	@ApiField("detail_sku_id")
	private String detailSkuId;

	/**
	 * 排序字典
	 */
	@ApiField("detail_sort")
	private String detailSort;

	/**
	 * 组id
	 */
	@ApiField("group_id")
	private String groupId;

	public String getAddPrice() {
		return this.addPrice;
	}
	public void setAddPrice(String addPrice) {
		this.addPrice = addPrice;
	}

	public String getDetailCount() {
		return this.detailCount;
	}
	public void setDetailCount(String detailCount) {
		this.detailCount = detailCount;
	}

	public String getDetailDishId() {
		return this.detailDishId;
	}
	public void setDetailDishId(String detailDishId) {
		this.detailDishId = detailDishId;
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

	public String getDetailSort() {
		return this.detailSort;
	}
	public void setDetailSort(String detailSort) {
		this.detailSort = detailSort;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
