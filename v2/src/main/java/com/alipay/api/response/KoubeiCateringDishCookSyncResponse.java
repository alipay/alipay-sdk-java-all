package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishCookInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.cook.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:45:53
 */
public class KoubeiCateringDishCookSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5164796414472148249L;

	/** 
	 * 操作后返回整个模型
	 */
	@ApiField("kb_dish_cook")
	private KbdishCookInfo kbDishCook;

	public void setKbDishCook(KbdishCookInfo kbDishCook) {
		this.kbDishCook = kbDishCook;
	}
	public KbdishCookInfo getKbDishCook( ) {
		return this.kbDishCook;
	}

}
