package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 17:47:01
 */
public class AlipayMerchantGroupGroupinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3377923245557963896L;

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
