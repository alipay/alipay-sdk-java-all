package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组织节点结构体
 *
 * @author auto create
 * @since 1.0, 2023-09-28 09:33:14
 */
public class OpenApiOrganizationNodeInfo extends AlipayObject {

	private static final long serialVersionUID = 3854799925677746519L;

	/**
	 * 组织节点名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 节点id
	 */
	@ApiField("node_id")
	private String nodeId;

	/**
	 * 父节点id
	 */
	@ApiField("parent_node_id")
	private String parentNodeId;

	/**
	 * 节点排序
	 */
	@ApiField("sort")
	private Long sort;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getParentNodeId() {
		return this.parentNodeId;
	}
	public void setParentNodeId(String parentNodeId) {
		this.parentNodeId = parentNodeId;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

}
