package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.tbsign.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-11 20:30:19
 */
public class ZhimaCreditPeZmgoTbsignApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2191116451834253642L;

	/** 
	 * 签约申请返回的JSON信息
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
