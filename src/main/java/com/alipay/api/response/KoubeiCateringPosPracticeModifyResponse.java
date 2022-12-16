package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.practice.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 08:57:05
 */
public class KoubeiCateringPosPracticeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2128478843354936187L;

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
