package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.boxactivity.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 10:11:45
 */
public class AlipayOpenSearchBoxactivityApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4297827711641138736L;

	/** 
	 * 搜索直达活动ID
	 */
	@ApiField("box_activity_id")
	private String boxActivityId;

	public void setBoxActivityId(String boxActivityId) {
		this.boxActivityId = boxActivityId;
	}
	public String getBoxActivityId( ) {
		return this.boxActivityId;
	}

}
