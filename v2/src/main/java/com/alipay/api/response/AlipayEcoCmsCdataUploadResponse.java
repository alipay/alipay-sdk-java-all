package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cms.cdata.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:30:39
 */
public class AlipayEcoCmsCdataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4446162215452427698L;

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
