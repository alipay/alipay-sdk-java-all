package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品菜类
 *
 * @author auto create
 * @since 1.0, 2018-11-16 16:49:43
 */
public class DishCategoryEntity extends AlipayObject {

	private static final long serialVersionUID = 8587958275397589665L;

	/**
	 * 分类ID
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 分类名称
	 */
	@ApiField("cate_name")
	private String cateName;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 排序号
	 */
	@ApiField("sort")
	private Long sort;

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public String getCateName() {
		return this.cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

}
