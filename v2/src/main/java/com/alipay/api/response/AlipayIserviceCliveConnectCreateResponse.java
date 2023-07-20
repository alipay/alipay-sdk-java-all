package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ConnectServerAdaptResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.clive.connect.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:01:17
 */
public class AlipayIserviceCliveConnectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1143927174366711964L;

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
