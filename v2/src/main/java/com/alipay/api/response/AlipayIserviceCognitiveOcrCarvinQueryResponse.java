package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.carvin.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:42:42
 */
public class AlipayIserviceCognitiveOcrCarvinQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5141479432668467756L;

	/** 
	 * 服务id，唯一标示服务请求
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 开放平台trace_id，用于定位问题
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 车辆vin码
	 */
	@ApiField("vin")
	private String vin;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getVin( ) {
		return this.vin;
	}

}
