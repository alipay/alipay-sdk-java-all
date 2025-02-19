package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-05 18:09:35
 */
public class AlipayMerchantGroupGroupinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4415633397891265144L;

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
