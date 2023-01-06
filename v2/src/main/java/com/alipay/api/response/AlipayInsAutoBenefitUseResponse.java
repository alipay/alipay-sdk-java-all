package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.benefit.use response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-28 17:07:19
 */
public class AlipayInsAutoBenefitUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6237113818958978645L;

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
