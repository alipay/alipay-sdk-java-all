package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cms.cdata.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:17:41
 */
public class AlipayEcoCmsCdataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1864865462252582526L;

	/** 
	 * 投放消息ID
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
