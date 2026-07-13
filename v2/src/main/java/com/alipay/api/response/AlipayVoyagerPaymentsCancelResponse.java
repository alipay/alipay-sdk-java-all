package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.payments.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-25 11:09:58
 */
public class AlipayVoyagerPaymentsCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4517125534982791479L;

	/** 
	 * 必填
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

}
