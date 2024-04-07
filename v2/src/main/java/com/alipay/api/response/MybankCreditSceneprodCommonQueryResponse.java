package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.common.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:16
 */
public class MybankCreditSceneprodCommonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1193672922611858892L;

	/** 
	 * 请求结果响应说明唯一序号，包含多个字符串
	 */
	@ApiField("info")
	private String info;

	/** 
	 * 支付宝账号不存在。
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 请求是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 请求响应唯一描述
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfo( ) {
		return this.info;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
