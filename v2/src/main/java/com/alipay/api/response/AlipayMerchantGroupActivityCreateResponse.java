package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.activity.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 10:30:50
 */
public class AlipayMerchantGroupActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6368975351636839153L;

	/** 
	 * 商家群活动id
	 */
	@ApiField("group_activity_id")
	private String groupActivityId;

	public void setGroupActivityId(String groupActivityId) {
		this.groupActivityId = groupActivityId;
	}
	public String getGroupActivityId( ) {
		return this.groupActivityId;
	}

}
