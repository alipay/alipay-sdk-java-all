package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 10:29:55
 */
public class AlipayMerchantGroupGroupinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2872139734124755667L;

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
