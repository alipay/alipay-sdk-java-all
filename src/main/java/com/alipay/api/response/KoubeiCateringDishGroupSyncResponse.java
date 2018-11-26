package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishGroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.group.sync response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-31 14:18:42
 */
public class KoubeiCateringDishGroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5884577341262563349L;

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
