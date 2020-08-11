package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.createdish.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-23 16:10:01
 */
public class KoubeiCateringDishCreatedishSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2176691476749243891L;

	/** 
	 * 口碑菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/** 
	 * 是否需要重试
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setDishId(String dishId) {
		this.dishId = dishId;
	}
	public String getDishId( ) {
		return this.dishId;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
