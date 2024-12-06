package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MallReceivePrResponseData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.punchout.pr.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-08 10:56:38
 */
public class AlipayDigitalmgmtPunchoutPrCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6447142478725814515L;

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
