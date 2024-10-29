package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TuitionISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.pobo.notify response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-29 16:28:08
 */
public class AlipayOverseasOpenPoboNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6681465779258382846L;

	/** 
	 * 结果返回
	 */
	@ApiField("result")
	private TuitionISVResult result;

	public void setResult(TuitionISVResult result) {
		this.result = result;
	}
	public TuitionISVResult getResult( ) {
		return this.result;
	}

}
