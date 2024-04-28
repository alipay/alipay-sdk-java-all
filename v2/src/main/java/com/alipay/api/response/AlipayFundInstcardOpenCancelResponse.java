package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.instcard.open.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:55:41
 */
public class AlipayFundInstcardOpenCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5521346686433939868L;

	/** 
	 * 是否销户成功
	 */
	@ApiField("canceled")
	private Boolean canceled;

	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
	}
	public Boolean getCanceled( ) {
		return this.canceled;
	}

}
