package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indrbeneficiary.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-10 11:42:02
 */
public class AlipayOverseasOpenIndrbeneficiaryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2695492385687566258L;

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
