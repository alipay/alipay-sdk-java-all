package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.preadmit.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-27 15:11:34
 */
public class MybankCreditSceneprodPreadmitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3496885133666228721L;

	/** 
	 * 是否通过前准入校验，通过true, 拒绝false
	 */
	@ApiField("pre_admit_result")
	private String preAdmitResult;

	/** 
	 * 前准入拒绝原因错误码
	 */
	@ApiField("reject_code")
	private String rejectCode;

	/** 
	 * 拒绝原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setPreAdmitResult(String preAdmitResult) {
		this.preAdmitResult = preAdmitResult;
	}
	public String getPreAdmitResult( ) {
		return this.preAdmitResult;
	}

	public void setRejectCode(String rejectCode) {
		this.rejectCode = rejectCode;
	}
	public String getRejectCode( ) {
		return this.rejectCode;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
