package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.biz.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:17:39
 */
public class AlipayOpenOperationOpenbizmockBizQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2676993272816574586L;

	/** 
	 * 处理结果
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
