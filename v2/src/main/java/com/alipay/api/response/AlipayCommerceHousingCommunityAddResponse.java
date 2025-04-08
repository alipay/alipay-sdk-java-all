package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.community.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-08 17:13:30
 */
public class AlipayCommerceHousingCommunityAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5283747214867951854L;

	/** 
	 * 小区id
	 */
	@ApiField("community_id")
	private String communityId;

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}
	public String getCommunityId( ) {
		return this.communityId;
	}

}
