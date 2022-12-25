package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.instcard.open.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 01:54:43
 */
public class AlipayFundInstcardOpenCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5418696267275799982L;

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
