package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IndrISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.indrpreorder.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:51:55
 */
public class AlipayOverseasOpenIndrpreorderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7765548539572479451L;

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
