package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.menu.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 19:19:26
 */
public class KoubeiCateringDishMenuSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6615636743921856151L;

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
