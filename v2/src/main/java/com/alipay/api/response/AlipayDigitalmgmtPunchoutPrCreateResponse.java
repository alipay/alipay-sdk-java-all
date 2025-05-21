package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MallReceivePrResponseData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.punchout.pr.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-21 12:04:49
 */
public class AlipayDigitalmgmtPunchoutPrCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3683326627818742611L;

	/** 
	 * pr下单返回数据
	 */
	@ApiField("response_data")
	private MallReceivePrResponseData responseData;

	public void setResponseData(MallReceivePrResponseData responseData) {
		this.responseData = responseData;
	}
	public MallReceivePrResponseData getResponseData( ) {
		return this.responseData;
	}

}
