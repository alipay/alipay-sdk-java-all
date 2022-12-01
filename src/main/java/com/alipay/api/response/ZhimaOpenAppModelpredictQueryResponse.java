package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.open.app.modelpredict.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-11 12:56:33
 */
public class ZhimaOpenAppModelpredictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2841761958896638653L;

	/** 
	 * 模型预测的结果
	 */
	@ApiField("resp")
	private String resp;

	public void setResp(String resp) {
		this.resp = resp;
	}
	public String getResp( ) {
		return this.resp;
	}

}
