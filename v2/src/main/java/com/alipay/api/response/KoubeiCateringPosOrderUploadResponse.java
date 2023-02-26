package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.order.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-03 16:15:12
 */
public class KoubeiCateringPosOrderUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7452195452329769518L;

	/** 
	 * 生成序列号标记每次上传
	 */
	@ApiField("flow_id")
	private String flowId;

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowId( ) {
		return this.flowId;
	}

}
