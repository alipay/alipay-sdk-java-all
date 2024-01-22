package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indraccount.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-15 12:06:43
 */
public class AlipayOverseasOpenIndraccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7327479389648943218L;

	/** 
	 * 调用结果
	 */
	@ApiField("result")
	private IndrISVResult result;

	public void setResult(IndrISVResult result) {
		this.result = result;
	}
	public IndrISVResult getResult( ) {
		return this.result;
	}

}
