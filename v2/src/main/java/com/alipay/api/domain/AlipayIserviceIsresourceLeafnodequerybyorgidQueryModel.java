package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过组织id查询组织架构叶子结点
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:02:34
 */
public class AlipayIserviceIsresourceLeafnodequerybyorgidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5711725141764571263L;

	/**
	 * 组织节点id
	 */
	@ApiField("org_node_id")
	private String orgNodeId;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getOrgNodeId() {
		return this.orgNodeId;
	}
	public void setOrgNodeId(String orgNodeId) {
		this.orgNodeId = orgNodeId;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
