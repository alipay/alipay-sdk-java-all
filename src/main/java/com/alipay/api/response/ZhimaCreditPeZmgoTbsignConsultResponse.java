package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.tbsign.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-14 15:40:15
 */
public class ZhimaCreditPeZmgoTbsignConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4226487672667435887L;

	/** 
	 * 签约咨询返回的JSON信息
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
