package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群操作节点
 *
 * @author auto create
 * @since 1.0, 2023-11-09 19:22:08
 */
public class CrowdOperationNode extends AlipayObject {

	private static final long serialVersionUID = 3799749599388533277L;

	/**
	 * 节点id
	 */
	@ApiField("node_code")
	private String nodeCode;

	/**
	 * 节点描述
	 */
	@ApiField("node_desc")
	private String nodeDesc;

	/**
	 * 节点名称
	 */
	@ApiField("node_name")
	private String nodeName;

	/**
	 * 节点选项组
	 */
	@ApiField("node_option_group")
	private CrowdOperationNodeOptionGroup nodeOptionGroup;

	/**
	 * 节点选项组id
	 */
	@ApiField("node_option_group_id")
	private String nodeOptionGroupId;

	/**
	 * 节点展示类型
	 */
	@ApiField("node_show_type")
	private String nodeShowType;

	/**
	 * 节点类型
	 */
	@ApiField("node_type")
	private String nodeType;

	/**
	 * 父节点id
	 */
	@ApiField("parent_node_code")
	private String parentNodeCode;

	public String getNodeCode() {
		return this.nodeCode;
	}
	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	public String getNodeDesc() {
		return this.nodeDesc;
	}
	public void setNodeDesc(String nodeDesc) {
		this.nodeDesc = nodeDesc;
	}

	public String getNodeName() {
		return this.nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public CrowdOperationNodeOptionGroup getNodeOptionGroup() {
		return this.nodeOptionGroup;
	}
	public void setNodeOptionGroup(CrowdOperationNodeOptionGroup nodeOptionGroup) {
		this.nodeOptionGroup = nodeOptionGroup;
	}

	public String getNodeOptionGroupId() {
		return this.nodeOptionGroupId;
	}
	public void setNodeOptionGroupId(String nodeOptionGroupId) {
		this.nodeOptionGroupId = nodeOptionGroupId;
	}

	public String getNodeShowType() {
		return this.nodeShowType;
	}
	public void setNodeShowType(String nodeShowType) {
		this.nodeShowType = nodeShowType;
	}

	public String getNodeType() {
		return this.nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getParentNodeCode() {
		return this.parentNodeCode;
	}
	public void setParentNodeCode(String parentNodeCode) {
		this.parentNodeCode = parentNodeCode;
	}

}
