package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.group.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-30 10:37:05
 */
public class AlipaySocialBaseGroupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3277136939983155422L;

	/** 
	 * 群id
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
