package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.principal.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:25:20
 */
public class KoubeiCateringDishPrincipalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1325199469675322767L;

	/** 
	 * 菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/** 
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商品sku id
	 */
	@ApiField("item_sku_id")
	private String itemSkuId;

	/** 
	 * sku id
	 */
	@ApiField("sku_id")
	private String skuId;

	public void setDishId(String dishId) {
		this.dishId = dishId;
	}
	public String getDishId( ) {
		return this.dishId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setItemSkuId(String itemSkuId) {
		this.itemSkuId = itemSkuId;
	}
	public String getItemSkuId( ) {
		return this.itemSkuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getSkuId( ) {
		return this.skuId;
	}

}
