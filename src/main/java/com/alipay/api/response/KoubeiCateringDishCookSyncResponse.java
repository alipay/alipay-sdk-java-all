package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishCookInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.cook.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-08 17:21:16
 */
public class KoubeiCateringDishCookSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8845794933149718529L;

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
