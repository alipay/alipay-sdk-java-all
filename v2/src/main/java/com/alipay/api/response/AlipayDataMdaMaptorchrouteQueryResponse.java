package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.maptorchroute.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:16:45
 */
public class AlipayDataMdaMaptorchrouteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5249513551344859535L;

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
