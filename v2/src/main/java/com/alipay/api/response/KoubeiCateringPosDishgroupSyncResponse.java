package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.dishgroup.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:50:57
 */
public class KoubeiCateringPosDishgroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8521673645395261296L;

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
