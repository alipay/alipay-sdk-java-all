package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.unionmember.action.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 15:16:24
 */
public class AlipayCommerceAcommunicationUnionmemberActionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6638612539714635351L;

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
