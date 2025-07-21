package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除组织节点
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:40
 */
public class AlipayCommerceEducateNodeInfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3668276263578535871L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 组织节点ID
	 */
	@ApiField("node_id")
	private String nodeId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

}
