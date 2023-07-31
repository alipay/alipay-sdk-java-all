package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.sellersign.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:21:56
 */
public class MybankCreditSupplychainCreditpaySellersignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4191191178627955795L;

	/** 
	 * 合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

	/** 
	 * 签约失败时需要，签约失败原因码
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
	 * 扩展参数
	 */
	@ApiField("retry")
	private Boolean retry;

	/** 
	 * 成功与否：true/false
	 */
	@ApiField("sign_result")
	private Boolean signResult;

	/** 
	 * trace信息
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
