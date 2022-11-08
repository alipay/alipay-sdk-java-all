package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据树查询节点和节点下的child
 *
 * @author auto create
 * @since 1.0, 2022-03-25 17:45:51
 */
public class AlipayBossBaseFrastressQuerybiztreeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8862251592421468579L;

	/**
	 * 节点id
	 */
	@ApiField("node_id")
	private String nodeId;

	/**
	 * 户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 树id
	 */
	@ApiField("tree_id")
	private String treeId;

	/**
	 * 用户id，可不传，传入会鉴权
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 不需要视图过滤可不传
	 */
	@ApiField("view")
	private String view;

	public String getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getTreeId() {
		return this.treeId;
	}
	public void setTreeId(String treeId) {
		this.treeId = treeId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getView() {
		return this.view;
	}
	public void setView(String view) {
		this.view = view;
	}

}
