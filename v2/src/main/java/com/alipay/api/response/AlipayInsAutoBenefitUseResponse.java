package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.benefit.use response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 14:41:41
 */
public class AlipayInsAutoBenefitUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1837239353288571764L;

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
