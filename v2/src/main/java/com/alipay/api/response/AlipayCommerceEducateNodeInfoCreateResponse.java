package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.node.info.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:37:30
 */
public class AlipayCommerceEducateNodeInfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7436133591358251529L;

	/** 
	 * 创建的组织节点ID，如果组织节点已被创建，则返回原组织节点ID。
	 */
	@ApiField("node_id")
	private String nodeId;

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getNodeId( ) {
		return this.nodeId;
	}

}
