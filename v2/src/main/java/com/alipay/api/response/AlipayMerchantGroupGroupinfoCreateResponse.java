package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:29
 */
public class AlipayMerchantGroupGroupinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6349297473171687691L;

	/** 
	 * 群组id
	 */
	@ApiField("group_id")
	private String groupId;

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId( ) {
		return this.groupId;
	}

}
