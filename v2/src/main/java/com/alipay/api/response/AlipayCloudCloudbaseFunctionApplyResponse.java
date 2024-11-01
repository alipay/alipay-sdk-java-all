package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-22 15:41:41
 */
public class AlipayCloudCloudbaseFunctionApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6738674173365477693L;

	/** 
	 * Trace ID
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	/** 
	 * 执行耗时，单位为毫秒
	 */
	@ApiField("cost")
	private Long cost;

	/** 
	 * 执行云函数后返回对应函数执行结果
	 */
	@ApiField("data")
	private String data;

	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}
	public String getBizTraceId( ) {
		return this.bizTraceId;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}
	public Long getCost( ) {
		return this.cost;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
