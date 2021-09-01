package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.sgx.gateway.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 16:25:01
 */
public class AlipayDataAiserviceSgxGatewayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1531994485421748766L;

	/** 
	 * request_uuid ：对应用户请求的唯一id，用于定位请求具体对应到哪一次调用。所有调用场景都会返回改值 。该值由用户请求中传入
	 */
	@ApiField("request_uuid")
	private String requestUuid;

	/** 
	 * result : 业务处理结果json字符串，所有场景都会返回该值。该值由具体调用接口的返回值决定。
	 */
	@ApiField("result")
	private String result;

	public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
	}
	public String getRequestUuid( ) {
		return this.requestUuid;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
