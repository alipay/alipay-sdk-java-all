package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.sellerunsign.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:07
 */
public class MybankCreditSupplychainCreditpaySellerunsignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2366317342411989297L;

	/** 
	 * 是否可解约
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 日志id
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 不可解约原因码，解约失败时返回
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
