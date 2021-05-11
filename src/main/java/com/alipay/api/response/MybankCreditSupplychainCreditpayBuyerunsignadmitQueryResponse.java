package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.buyerunsignadmit.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-04 11:22:33
 */
public class MybankCreditSupplychainCreditpayBuyerunsignadmitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7715956692877316895L;

	/** 
	 * 能否解约：true/false
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 网商日志跟踪ID
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 不可解约原因码，失败时返回
	 */
	@ApiField("unadmit_reason")
	private String unadmitReason;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

	public void setUnadmitReason(String unadmitReason) {
		this.unadmitReason = unadmitReason;
	}
	public String getUnadmitReason( ) {
		return this.unadmitReason;
	}

}
