package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.collectright.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:13:53
 */
public class AlipayOpenMiniAmpeCollectrightQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2137644465666218375L;

	/** 
	 * true为有上报权限
	 */
	@ApiField("can_collect")
	private Boolean canCollect;

	public void setCanCollect(Boolean canCollect) {
		this.canCollect = canCollect;
	}
	public Boolean getCanCollect( ) {
		return this.canCollect;
	}

}
