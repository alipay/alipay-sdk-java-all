package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:24
 */
public class KoubeiCateringDishSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3263151845465389126L;

	/** 
	 * 返回的菜品模型
	 */
	@ApiField("kb_dish_info")
	private KbdishInfo kbDishInfo;

	public void setKbDishInfo(KbdishInfo kbDishInfo) {
		this.kbDishInfo = kbDishInfo;
	}
	public KbdishInfo getKbDishInfo( ) {
		return this.kbDishInfo;
	}

}
