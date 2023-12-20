package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indrpreorder.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:11:44
 */
public class AlipayOverseasOpenIndrpreorderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4576975624637966717L;

	/** 
	 * 返回结果
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
