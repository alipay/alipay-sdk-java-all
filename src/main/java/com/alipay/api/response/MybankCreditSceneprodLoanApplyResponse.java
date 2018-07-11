package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.loan.apply response.
 * 
 * @author auto create
 * @since 1.0, 2018-01-23 11:42:11
 */
public class MybankCreditSceneprodLoanApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2832994749121914792L;

	/** 
	 * 网商银行内部申请单号
	 */
	@ApiField("app_seqno")
	private String appSeqno;

	/** 
	 * 是否需要升级支付宝账户，如果为true，则需要引导客户进行支付宝账户升级，否则会影响客户的审批流程
	 */
	@ApiField("need_auth")
	private String needAuth;

	/** 
	 * 外部机构订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setAppSeqno(String appSeqno) {
		this.appSeqno = appSeqno;
	}
	public String getAppSeqno( ) {
		return this.appSeqno;
	}

	public void setNeedAuth(String needAuth) {
		this.needAuth = needAuth;
	}
	public String getNeedAuth( ) {
		return this.needAuth;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
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
