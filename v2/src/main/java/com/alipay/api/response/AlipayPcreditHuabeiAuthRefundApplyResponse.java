package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.auth.refund.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:16:48
 */
public class AlipayPcreditHuabeiAuthRefundApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4311174824862481684L;

	/** 
	 * 授权支付单ID
	 */
	@ApiField("auth_opt_id")
	private String authOptId;

	/** 
	 * 退款操作错误原因描述
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setAuthOptId(String authOptId) {
		this.authOptId = authOptId;
	}
	public String getAuthOptId( ) {
		return this.authOptId;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
