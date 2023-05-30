package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.antbudget.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 03:02:17
 */
public class AlipayBossFncAntbudgetCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8817883814799877268L;

	/** 
	 * 描述具体的错误信息，方便排查问题
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
