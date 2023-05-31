package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ashield.hardeninglog.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:26:56
 */
public class AlipaySecurityProdAshieldHardeninglogGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5336657648524983291L;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 加固日志的下载链接
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
