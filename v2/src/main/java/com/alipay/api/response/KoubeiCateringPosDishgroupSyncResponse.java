package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.dishgroup.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:52:19
 */
public class KoubeiCateringPosDishgroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2711381281719578611L;

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
