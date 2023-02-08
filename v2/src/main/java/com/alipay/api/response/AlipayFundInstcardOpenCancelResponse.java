package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.instcard.open.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 00:40:22
 */
public class AlipayFundInstcardOpenCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2319954956368394256L;

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
