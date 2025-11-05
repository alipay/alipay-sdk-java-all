package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收平台分账关系查询接口
 *
 * @author auto create
 * @since 1.0, 2025-08-11 22:46:52
 */
public class AlipayCommerceRecycleRoyaltyRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8161224467483379633L;

	/**
	 * 绑定的角色id列表
	 */
	@ApiListField("bind_role_ids")
	@ApiField("string")
	private List<String> bindRoleIds;

	/**
	 * 绑定的角色loginid列表
	 */
	@ApiListField("bind_role_login_ids")
	@ApiField("string")
	private List<String> bindRoleLoginIds;

	/**
	 * 绑定的角色id列表
	 */
	@ApiListField("bind_role_open_ids")
	@ApiField("string")
	private List<String> bindRoleOpenIds;

	/**
	 * 绑定的角色类型
	 */
	@ApiField("bind_role_type")
	private String bindRoleType;

	public List<String> getBindRoleIds() {
		return this.bindRoleIds;
	}
	public void setBindRoleIds(List<String> bindRoleIds) {
		this.bindRoleIds = bindRoleIds;
	}

	public List<String> getBindRoleLoginIds() {
		return this.bindRoleLoginIds;
	}
	public void setBindRoleLoginIds(List<String> bindRoleLoginIds) {
		this.bindRoleLoginIds = bindRoleLoginIds;
	}

	public List<String> getBindRoleOpenIds() {
		return this.bindRoleOpenIds;
	}
	public void setBindRoleOpenIds(List<String> bindRoleOpenIds) {
		this.bindRoleOpenIds = bindRoleOpenIds;
	}

	public String getBindRoleType() {
		return this.bindRoleType;
	}
	public void setBindRoleType(String bindRoleType) {
		this.bindRoleType = bindRoleType;
	}

}
