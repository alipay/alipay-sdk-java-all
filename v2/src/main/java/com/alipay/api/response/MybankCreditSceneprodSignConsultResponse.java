package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.sign.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 19:19:45
 */
public class MybankCreditSceneprodSignConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5344333555457374918L;

	/** 
	 * 是否允许签约
	 */
	@ApiField("approved")
	private String approved;

	/** 
	 * 拒绝原因，当approved为false的时候透出
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setApproved(String approved) {
		this.approved = approved;
	}
	public String getApproved( ) {
		return this.approved;
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
