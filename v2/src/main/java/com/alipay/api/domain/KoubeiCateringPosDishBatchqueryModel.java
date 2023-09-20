package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自建盒子菜谱下菜品查询
 *
 * @author auto create
 * @since 1.0, 2018-12-07 18:13:30
 */
public class KoubeiCateringPosDishBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1353775832941148648L;

	/**
	 * 菜谱的ID
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 按照菜品名字模糊查询菜谱下的菜品
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCookId() {
		return this.cookId;
	}
	public void setCookId(String cookId) {
		this.cookId = cookId;
	}

	public String getDishName() {
		return this.dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
