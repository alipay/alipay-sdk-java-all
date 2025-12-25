package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.wanxintestaaa.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-06 17:57:41
 */
public class AlipayOpenWanxintestaaaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8644461427342655162L;

	/** 
	 * 结果
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
