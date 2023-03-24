package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.deskarea.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 07:19:22
 */
public class KoubeiCateringPosDeskareaSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4698938287863677397L;

	/** 
	 * 返回主键
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
