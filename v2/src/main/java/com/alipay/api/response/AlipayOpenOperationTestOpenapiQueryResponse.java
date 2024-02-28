package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.test.openapi.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-22 17:41:45
 */
public class AlipayOpenOperationTestOpenapiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1641141544528752376L;

	/** 
	 * test
	 */
	@ApiField("out_open_id")
	private String outOpenId;

	/** 
	 * test
	 */
	@ApiField("out_type")
	private String outType;

	/** 
	 * test
	 */
	@ApiField("out_uid")
	private String outUid;

	public void setOutOpenId(String outOpenId) {
		this.outOpenId = outOpenId;
	}
	public String getOutOpenId( ) {
		return this.outOpenId;
	}

	public void setOutType(String outType) {
		this.outType = outType;
	}
	public String getOutType( ) {
		return this.outType;
	}

	public void setOutUid(String outUid) {
		this.outUid = outUid;
	}
	public String getOutUid( ) {
		return this.outUid;
	}

}
