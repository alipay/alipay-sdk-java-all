package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询条件
 *
 * @author auto create
 * @since 1.0, 2022-02-23 12:05:09
 */
public class OrgRoleQuery extends AlipayObject {

	private static final long serialVersionUID = 2644435324512338418L;

	/**
	 * 组织树节点code
	 */
	@ApiField("node_code")
	private String nodeCode;

	/**
	 * 节点类型(组织部门/业务线/自定义树)
	 */
	@ApiField("node_type")
	private String nodeType;

	/**
	 * 角色
	 */
	@ApiField("role")
	private String role;

	/**
	 * 主站的租户id,目前是固定值：ALIPW3CN， 以后会让用户自定义
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getNodeCode() {
		return this.nodeCode;
	}
	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	public String getNodeType() {
		return this.nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
