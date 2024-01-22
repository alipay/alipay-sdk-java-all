package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.loan.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:41:41
 */
public class MybankCreditSceneprodLoanConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 1133116198871761614L;

	/** 
	 * 网商针对一次客户主动申请生成的申请单据编号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 处理时错误原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 资方生成的申请单号
	 */
	@ApiField("fin_order_no")
	private String finOrderNo;

	/** 
	 * 受理结果,成功：Y, 失败：N
	 */
	@ApiField("process_result")
	private String processResult;

	/** 
	 * 标识一次业务交互, 网商的ipRoleId+"_"YYYYMMDD+35位流水号, 最后2，3位要求是数字。
	 */
	@ApiField("request_id")
	private String requestId;

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

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setFinOrderNo(String finOrderNo) {
		this.finOrderNo = finOrderNo;
	}
	public String getFinOrderNo( ) {
		return this.finOrderNo;
	}

	public void setProcessResult(String processResult) {
		this.processResult = processResult;
	}
	public String getProcessResult( ) {
		return this.processResult;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
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
