package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ConnectServerAdaptResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.clive.connect.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-27 15:17:47
 */
public class AlipayIserviceCliveConnectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6138842714522354135L;

	/** 
	 * 响应
	 */
	@ApiField("value")
	private ConnectServerAdaptResult value;

	public void setValue(ConnectServerAdaptResult value) {
		this.value = value;
	}
	public ConnectServerAdaptResult getValue( ) {
		return this.value;
	}

}
