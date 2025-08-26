package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询下级组织节点列表
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:48
 */
public class AlipayCommerceEducateNodeChildBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8269175534177614443L;

	/**
	 * 结构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 节点ID，如果不传则查询学校下的第一级组织节点
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
