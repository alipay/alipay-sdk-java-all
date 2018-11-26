package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.stall.modify response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-16 17:27:24
 */
public class KoubeiCateringPosStallModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5697613144817931352L;

	/** 
	 * 档口id
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
