package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ashield.hardeningresult.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-10 14:01:38
 */
public class AlipaySecurityProdAshieldHardeningresultGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1365696979938198945L;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 加固产物的下载链接
	 */
	@ApiField("res_data")
	private String resData;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setResData(String resData) {
		this.resData = resData;
	}
	public String getResData( ) {
		return this.resData;
	}

}
