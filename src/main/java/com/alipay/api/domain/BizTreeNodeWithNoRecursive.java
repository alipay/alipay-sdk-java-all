package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BizTreeNode树结构的非递归版本。
 *
 * @author auto create
 * @since 1.0, 2022-03-25 17:44:58
 */
public class BizTreeNodeWithNoRecursive extends AlipayObject {

	private static final long serialVersionUID = 6248365235596474455L;

	/**
	 * 是否有孩子节点。0表示无 1表示有
	 */
	@ApiField("has_children")
	private String hasChildren;

	/**
	 * CODE
	 */
	@ApiField("node_id")
	private String nodeId;

	/**
	 * name
	 */
	@ApiField("node_name")
	private String nodeName;

	/**
	 * 父节点标记
	 */
	@ApiField("parent_node_id")
	private String parentNodeId;

	/**
	 * sequence
	 */
	@ApiField("sequence")
	private String sequence;

	public String getHasChildren() {
		return this.hasChildren;
	}
	public void setHasChildren(String hasChildren) {
		this.hasChildren = hasChildren;
	}

	public String getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getNodeName() {
		return this.nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getParentNodeId() {
		return this.parentNodeId;
	}
	public void setParentNodeId(String parentNodeId) {
		this.parentNodeId = parentNodeId;
	}

	public String getSequence() {
		return this.sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

}
