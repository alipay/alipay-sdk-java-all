package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.HardeningTaskResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ashield.hardeningtaskprocess.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-25 16:41:56
 */
public class AlipaySecurityProdAshieldHardeningtaskprocessGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2765468263352615657L;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 返回的具体对象
	 */
	@ApiField("res_data")
	private HardeningTaskResponse resData;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setResData(HardeningTaskResponse resData) {
		this.resData = resData;
	}
	public HardeningTaskResponse getResData( ) {
		return this.resData;
	}

}
