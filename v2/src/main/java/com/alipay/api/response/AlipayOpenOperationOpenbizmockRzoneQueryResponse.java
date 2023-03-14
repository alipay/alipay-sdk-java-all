package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.rzone.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 21:48:44
 */
public class AlipayOpenOperationOpenbizmockRzoneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5874563487583473229L;

	/** 
	 * 测试
	 */
	@ApiField("result")
	private String result;

	/** 
	 * RZ00B
	 */
	@ApiField("zone_name")
	private String zoneName;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	public String getZoneName( ) {
		return this.zoneName;
	}

}
