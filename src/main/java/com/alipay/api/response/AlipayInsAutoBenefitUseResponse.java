package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.benefit.use response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-08 19:54:59
 */
public class AlipayInsAutoBenefitUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3167253125258665841L;

	/** 
	 * 蚂蚁平台使用记录id
	 */
	@ApiField("use_flow_id")
	private String useFlowId;

	public void setUseFlowId(String useFlowId) {
		this.useFlowId = useFlowId;
	}
	public String getUseFlowId( ) {
		return this.useFlowId;
	}

}
