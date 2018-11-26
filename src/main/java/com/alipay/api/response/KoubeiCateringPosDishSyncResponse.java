package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.dish.sync response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-21 10:38:55
 */
public class KoubeiCateringPosDishSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1736361266443691273L;

	/** 
	 * 菜品的ID
	 */
	@ApiField("dish_id")
	private String dishId;

	public void setDishId(String dishId) {
		this.dishId = dishId;
	}
	public String getDishId( ) {
		return this.dishId;
	}

}
