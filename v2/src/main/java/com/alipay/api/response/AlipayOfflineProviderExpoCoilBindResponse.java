package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.expo.coil.bind response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-12 15:37:41
 */
public class AlipayOfflineProviderExpoCoilBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 3377865718359353879L;

	/** 
	 * 线圈id
	 */
	@ApiField("tag_id")
	private String tagId;

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}
	public String getTagId( ) {
		return this.tagId;
	}

}
