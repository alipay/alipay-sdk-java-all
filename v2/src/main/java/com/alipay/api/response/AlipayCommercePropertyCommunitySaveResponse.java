package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.community.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-19 20:02:23
 */
public class AlipayCommercePropertyCommunitySaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8659395753189269419L;

	/** 
	 * 项目ID
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
