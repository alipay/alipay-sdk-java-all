package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.vehicleplate.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayIserviceCognitiveOcrVehicleplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5884516123343816855L;

	/** 
	 * 服务识别失败后对应的详细错误原因
	 */
	@ApiField("error_content")
	private String errorContent;

	/** 
	 * 识别正确概率
	 */
	@ApiField("prob")
	private String prob;

	/** 
	 * 服务器id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * true: 识别成功
false: 识别失败
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 开放平台trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 车牌号码
	 */
	@ApiField("txt")
	private String txt;

	public void setErrorContent(String errorContent) {
		this.errorContent = errorContent;
	}
	public String getErrorContent( ) {
		return this.errorContent;
	}

	public void setProb(String prob) {
		this.prob = prob;
	}
	public String getProb( ) {
		return this.prob;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}
	public String getTxt( ) {
		return this.txt;
	}

}
