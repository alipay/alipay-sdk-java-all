package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收平台分账关系查询接口
 *
 * @author auto create
 * @since 1.0, 2025-06-20 18:06:31
 */
public class AlipayCommerceRecycleRoyaltyRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2119516886352477538L;

	/**
	 * 绑定的角色id列表
	 */
	@ApiListField("bind_role_ids")
	@ApiField("string")
	private List<String> bindRoleIds;

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

	public String getBindRoleType() {
		return this.bindRoleType;
	}
	public void setBindRoleType(String bindRoleType) {
		this.bindRoleType = bindRoleType;
	}

}
