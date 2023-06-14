package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.practice.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:09:58
 */
public class KoubeiCateringPosPracticeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2877646392275415742L;

	/** 
	 * 做法id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
