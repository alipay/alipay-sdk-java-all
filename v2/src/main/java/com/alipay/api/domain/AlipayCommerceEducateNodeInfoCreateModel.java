package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建组织节点
 *
 * @author auto create
 * @since 1.0, 2025-09-05 10:09:53
 */
public class AlipayCommerceEducateNodeInfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8293454422962174682L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

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
