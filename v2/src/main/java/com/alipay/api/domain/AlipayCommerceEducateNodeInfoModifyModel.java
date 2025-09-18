package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改组织节点
 *
 * @author auto create
 * @since 1.0, 2025-09-04 16:05:02
 */
public class AlipayCommerceEducateNodeInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8662629282859633785L;

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

	/**
	 * 组织节点图片URL地址
	 */
	@ApiField("node_logo")
	private String nodeLogo;

	/**
	 * 组织节点名称
	 */
	@ApiField("node_name")
	private String nodeName;

	/**
	 * 父节点ID
	 */
	@ApiField("parent_id")
	private String parentId;

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

	public String getNodeLogo() {
		return this.nodeLogo;
	}
	public void setNodeLogo(String nodeLogo) {
		this.nodeLogo = nodeLogo;
	}

	public String getNodeName() {
		return this.nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
