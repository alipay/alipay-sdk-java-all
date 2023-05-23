package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建角色
 *
 * @author auto create
 * @since 1.0, 2022-11-09 11:19:28
 */
public class AlipayIserviceCcmRoleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6784412354599462759L;

	/**
	 * 部门id（即租户实例ID、数据权限ID）
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 创建人id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 角色描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 角色关联额功能点id
	 */
	@ApiListField("function_ids")
	@ApiField("string")
	private List<String> functionIds;

	/**
	 * 角色名
	 */
	@ApiField("name")
	private String name;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getFunctionIds() {
		return this.functionIds;
	}
	public void setFunctionIds(List<String> functionIds) {
		this.functionIds = functionIds;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
