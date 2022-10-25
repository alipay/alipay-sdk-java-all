package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询菜品详情
 *
 * @author auto create
 * @since 1.0, 2018-11-21 10:39:36
 */
public class KoubeiCateringPosDishQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2664516399565714829L;

	/**
	 * 菜品的ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 门店的ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
