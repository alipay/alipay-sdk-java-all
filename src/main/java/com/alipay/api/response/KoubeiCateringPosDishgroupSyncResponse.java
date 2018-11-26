package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.dishgroup.sync response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-16 17:21:32
 */
public class KoubeiCateringPosDishgroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3432643754751723498L;

	/** 
	 * 返回对应的组合菜ID
	 */
	@ApiField("dish_group_id")
	private String dishGroupId;

	public void setDishGroupId(String dishGroupId) {
		this.dishGroupId = dishGroupId;
	}
	public String getDishGroupId( ) {
		return this.dishGroupId;
	}

}
