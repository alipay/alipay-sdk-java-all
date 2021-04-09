package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.selleradmit.admittance.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-17 13:37:26
 */
public class AlipayPcreditHuabeiSelleradmitAdmittanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2539459619346583154L;

	/** 
	 * 是否准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 不准入原因
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/** 
	 * 请求唯一标识
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 请求场景，id集合，拼接
	 */
	@ApiField("request_key")
	private String requestKey;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}
	public String getRefuseReason( ) {
		return this.refuseReason;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setRequestKey(String requestKey) {
		this.requestKey = requestKey;
	}
	public String getRequestKey( ) {
		return this.requestKey;
	}

}
