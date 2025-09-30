package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 花名册信息批量移动部门
 *
 * @author auto create
 * @since 1.0, 2025-06-18 17:15:31
 */
public class AlipayCommerceEducateRosterInfoTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4147199159771441359L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 移动的目标组织部门节点id
	 */
	@ApiField("node_id")
	private String nodeId;

	/**
	 * 花名册id列表
	 */
	@ApiListField("roster_id_list")
	@ApiField("string")
	private List<String> rosterIdList;

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

	public List<String> getRosterIdList() {
		return this.rosterIdList;
	}
	public void setRosterIdList(List<String> rosterIdList) {
		this.rosterIdList = rosterIdList;
	}

}
