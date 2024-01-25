package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 角色
 *
 * @author auto create
 * @since 1.0, 2020-11-26 15:25:54
 */
public class Role extends AlipayObject {

	private static final long serialVersionUID = 4132831264635923178L;

	/**
	 * 部门id（即租户实例ID、数据权限ID）
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 创建人id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 角色描述描述
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
	 * 角色名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 最后修改时间
	 */
	@ApiField("update_time")
	private Date updateTime;

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

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdaterId() {
		return this.updaterId;
	}
	public void setUpdaterId(String updaterId) {
		this.updaterId = updaterId;
	}

}
