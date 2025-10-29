package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testcertificate.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:20
 */
public class AlipayOpenOperationOpenbizmockTestcertificateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2465279863788946442L;

	/** 
	 * 测试
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 测试
	 */
	@ApiField("result_openid")
	private String resultOpenid;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setResultOpenid(String resultOpenid) {
		this.resultOpenid = resultOpenid;
	}
	public String getResultOpenid( ) {
		return this.resultOpenid;
	}

}
