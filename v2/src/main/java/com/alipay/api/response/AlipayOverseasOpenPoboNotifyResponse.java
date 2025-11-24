package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TuitionISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.pobo.notify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-04 16:12:22
 */
public class AlipayOverseasOpenPoboNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4786691561843456337L;

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
