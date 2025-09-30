package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cstraining.orgstructure.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-06 13:42:35
 */
public class AlipayIserviceCstrainingOrgstructureCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1852555336223662745L;

	/** 
	 * 返回结果
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
