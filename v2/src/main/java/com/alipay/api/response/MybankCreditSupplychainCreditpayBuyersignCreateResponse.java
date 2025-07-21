package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.buyersign.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:17
 */
public class MybankCreditSupplychainCreditpayBuyersignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6295672611567597385L;

	/** 
	 * 合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

	/** 
	 * 签约失败原因，签约失败时返回
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * ipId
	 */
	@ApiField("ip_id")
	private String ipId;

	/** 
	 * ipRoleId
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private Boolean retry;

	/** 
	 * 是否签约成功：true/false
	 */
	@ApiField("sign_result")
	private Boolean signResult;

	/** 
	 * 网商日志跟踪ID
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public String getArNo( ) {
		return this.arNo;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setIpId(String ipId) {
		this.ipId = ipId;
	}
	public String getIpId( ) {
		return this.ipId;
	}

	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public String getIpRoleId( ) {
		return this.ipRoleId;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

	public void setSignResult(Boolean signResult) {
		this.signResult = signResult;
	}
	public Boolean getSignResult( ) {
		return this.signResult;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
