package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.menu.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:27
 */
public class KoubeiCateringDishMenuSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8792292978158172979L;

	/** 
	 * 口碑菜谱id
	 */
	@ApiField("cook_id")
	private String cookId;

	public void setCookId(String cookId) {
		this.cookId = cookId;
	}
	public String getCookId( ) {
		return this.cookId;
	}

}
