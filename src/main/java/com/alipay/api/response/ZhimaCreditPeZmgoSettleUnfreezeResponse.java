package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.settle.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 14:09:33
 */
public class ZhimaCreditPeZmgoSettleUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2394392618367813715L;

	/** 
	 * 失败原因
	 */
	@ApiField("fail_reaseon")
	private String failReaseon;

	/** 
	 * 是否可以重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 解冻金额字符串
	 */
	@ApiField("unfreeze_amount")
	private String unfreezeAmount;

	/** 
	 * 解冻状态
	 */
	@ApiField("unfreeze_status")
	private String unfreezeStatus;

	public void setFailReaseon(String failReaseon) {
		this.failReaseon = failReaseon;
	}
	public String getFailReaseon( ) {
		return this.failReaseon;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setUnfreezeAmount(String unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
	}
	public String getUnfreezeAmount( ) {
		return this.unfreezeAmount;
	}

	public void setUnfreezeStatus(String unfreezeStatus) {
		this.unfreezeStatus = unfreezeStatus;
	}
	public String getUnfreezeStatus( ) {
		return this.unfreezeStatus;
	}

}
