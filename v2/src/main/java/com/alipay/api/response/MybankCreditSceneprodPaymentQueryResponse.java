package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.payment.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:30:27
 */
public class MybankCreditSceneprodPaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3867538861622431986L;

	/** 
	 * 备注信息
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 交易完成时间
	 */
	@ApiField("finish_time")
	private String finishTime;

	/** 
	 * 网商内部代收付申请单编号
	 */
	@ApiField("in_apply_no")
	private String inApplyNo;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 代收付申请单状态： SUC 成功，PRO 执行中 ，FAIL 失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}
	public String getFinishTime( ) {
		return this.finishTime;
	}

	public void setInApplyNo(String inApplyNo) {
		this.inApplyNo = inApplyNo;
	}
	public String getInApplyNo( ) {
		return this.inApplyNo;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
