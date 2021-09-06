package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.loan.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-27 14:37:08
 */
public class MybankCreditSceneprodLoanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3495634947824183928L;

	/** 
	 * 对于订单信息需要说明的内容
	 */
	@ApiField("desc_msg")
	private String descMsg;

	/** 
	 * 返回当前订单的信息
	 */
	@ApiField("info")
	private String info;

	/** 
	 * 是否重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setDescMsg(String descMsg) {
		this.descMsg = descMsg;
	}
	public String getDescMsg( ) {
		return this.descMsg;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfo( ) {
		return this.info;
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
