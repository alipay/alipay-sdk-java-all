package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据bumngId查询用户信息
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:01:53
 */
public class AlipayIserviceIsresourceUserquerybybusvcidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3814947587323533747L;

	/**
	 * antbuserviceID
	 */
	@ApiField("busvc_id")
	private String busvcId;

	/**
	 * 是否查询组织架构信息
	 */
	@ApiField("query_org_node")
	private Boolean queryOrgNode;

	/**
	 * 是否查询角色信息
	 */
	@ApiField("query_role")
	private Boolean queryRole;

	/**
	 * 是否查询用户资源信息
	 */
	@ApiField("query_user_resource")
	private Boolean queryUserResource;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getBusvcId() {
		return this.busvcId;
	}
	public void setBusvcId(String busvcId) {
		this.busvcId = busvcId;
	}

	public Boolean getQueryOrgNode() {
		return this.queryOrgNode;
	}
	public void setQueryOrgNode(Boolean queryOrgNode) {
		this.queryOrgNode = queryOrgNode;
	}

	public Boolean getQueryRole() {
		return this.queryRole;
	}
	public void setQueryRole(Boolean queryRole) {
		this.queryRole = queryRole;
	}

	public Boolean getQueryUserResource() {
		return this.queryUserResource;
	}
	public void setQueryUserResource(Boolean queryUserResource) {
		this.queryUserResource = queryUserResource;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
