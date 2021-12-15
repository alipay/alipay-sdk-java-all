package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新角色
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:24:55
 */
public class AlipayIserviceCcmRoleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7525766964628992745L;

	/**
	 * 部门id（即租户实例ID、数据权限ID），不传默认使用租户id
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 描述信息
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
	 * 角色id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 最后修改人id
	 */
	@ApiField("updater_id")
	private String updaterId;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
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

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getUpdaterId() {
		return this.updaterId;
	}
	public void setUpdaterId(String updaterId) {
		this.updaterId = updaterId;
	}

}
