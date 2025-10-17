package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.maptorchroute.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 11:02:36
 */
public class AlipayDataMdaMaptorchrouteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7755219896281766973L;

	/** 
	 * 火炬传递路线
	 */
	@ApiField("torch_path")
	private String torchPath;

	public void setTorchPath(String torchPath) {
		this.torchPath = torchPath;
	}
	public String getTorchPath( ) {
		return this.torchPath;
	}

}
