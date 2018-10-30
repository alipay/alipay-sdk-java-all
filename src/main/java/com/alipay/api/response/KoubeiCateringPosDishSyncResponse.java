package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.dish.sync response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-26 01:25:01
 */
public class KoubeiCateringPosDishSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4251531229735599823L;

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
