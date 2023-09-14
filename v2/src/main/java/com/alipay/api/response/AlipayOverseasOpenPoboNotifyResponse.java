package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TuitionISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.pobo.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:36:43
 */
public class AlipayOverseasOpenPoboNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4678551863342439668L;

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
