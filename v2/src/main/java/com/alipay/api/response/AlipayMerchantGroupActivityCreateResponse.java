package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.activity.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-10 19:47:09
 */
public class AlipayMerchantGroupActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3538632383151239573L;

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
