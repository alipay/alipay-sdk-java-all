package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.deskarea.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class KoubeiCateringPosDeskareaSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5617154729974914835L;

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
