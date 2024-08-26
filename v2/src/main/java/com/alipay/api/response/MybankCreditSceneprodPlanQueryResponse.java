package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.plan.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:35
 */
public class MybankCreditSceneprodPlanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8428387688274595581L;

	/** 
	 * 贷款方案内容
	 */
	@ApiField("loan_plan")
	private String loanPlan;

	/** 
	 * 是否离线准入，只有为true的时候loan_plan才会有数据
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 签约时间
	 */
	@ApiField("sign_time")
	private String signTime;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setLoanPlan(String loanPlan) {
		this.loanPlan = loanPlan;
	}
	public String getLoanPlan( ) {
		return this.loanPlan;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}
	public String getSignTime( ) {
		return this.signTime;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
