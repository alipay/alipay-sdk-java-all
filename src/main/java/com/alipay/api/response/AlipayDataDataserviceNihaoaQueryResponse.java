package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.nihaoa.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceNihaoaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6142784594915164319L;

	/** 
	 * 1
	 */
	@ApiField("bbbbbbb")
	private String bbbbbbb;

	public void setBbbbbbb(String bbbbbbb) {
		this.bbbbbbb = bbbbbbb;
	}
	public String getBbbbbbb( ) {
		return this.bbbbbbb;
	}

}
