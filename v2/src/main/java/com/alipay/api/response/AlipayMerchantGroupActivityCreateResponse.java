package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.activity.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-11 14:17:24
 */
public class AlipayMerchantGroupActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8556513663647162579L;

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
