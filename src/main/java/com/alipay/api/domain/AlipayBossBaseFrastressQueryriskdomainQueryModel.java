package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务域信息查询请求queryRiskDomainWithTntInstId
 *
 * @author auto create
 * @since 1.0, 2022-03-25 17:46:16
 */
public class AlipayBossBaseFrastressQueryriskdomainQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7286345148253962739L;

	/**
	 * 是否需要递归【基础树】获取风险域的子节点 有默认值false
	 */
	@ApiField("need_child_domain")
	private Boolean needChildDomain;

	/**
	 * 节点id
	 */
	@ApiField("node_id")
	private String nodeId;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 树id
	 */
	@ApiField("tree_id")
	private String treeId;

	/**
	 * 用户id，可不传
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 视图可不传
	 */
	@ApiField("view")
	private String view;

	public Boolean getNeedChildDomain() {
		return this.needChildDomain;
	}
	public void setNeedChildDomain(Boolean needChildDomain) {
		this.needChildDomain = needChildDomain;
	}

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
