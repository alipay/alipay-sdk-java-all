package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.boxactivity.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-23 14:57:08
 */
public class AlipayOpenSearchBoxactivityApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2381456248378921891L;

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
