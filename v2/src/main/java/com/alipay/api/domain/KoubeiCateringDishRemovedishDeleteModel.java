package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品库菜品删除接口
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:40:28
 */
public class KoubeiCateringDishRemovedishDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2555639468948664239L;

	/**
	 * 外部菜品id
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * 外部门店id，口碑门店id和外部门店id二选一必填
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 菜品skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOutDishId() {
		return this.outDishId;
	}
	public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
