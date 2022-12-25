package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishGroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.group.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 11:26:34
 */
public class KoubeiCateringDishGroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2165268362926429996L;

	/** 
	 * 组模型
	 */
	@ApiField("kb_dish_group")
	private KbdishGroupInfo kbDishGroup;

	public void setKbDishGroup(KbdishGroupInfo kbDishGroup) {
		this.kbDishGroup = kbDishGroup;
	}
	public KbdishGroupInfo getKbDishGroup( ) {
		return this.kbDishGroup;
	}

}
