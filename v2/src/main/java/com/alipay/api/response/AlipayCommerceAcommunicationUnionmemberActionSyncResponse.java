package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.unionmember.action.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-24 13:37:01
 */
public class AlipayCommerceAcommunicationUnionmemberActionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8617776984756952446L;

	/** 
	 * 回传成功的行为id
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
