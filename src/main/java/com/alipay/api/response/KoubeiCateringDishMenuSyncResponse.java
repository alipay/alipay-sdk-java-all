package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.menu.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-31 11:12:56
 */
public class KoubeiCateringDishMenuSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6884179571858869524L;

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
