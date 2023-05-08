package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishAreaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.area.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:17:39
 */
public class KoubeiCateringDishAreaSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5393919471336482214L;

	/** 
	 * 餐区餐台模型
	 */
	@ApiField("kb_dish_area")
	private KbdishAreaInfo kbDishArea;

	public void setKbDishArea(KbdishAreaInfo kbDishArea) {
		this.kbDishArea = kbDishArea;
	}
	public KbdishAreaInfo getKbDishArea( ) {
		return this.kbDishArea;
	}

}
