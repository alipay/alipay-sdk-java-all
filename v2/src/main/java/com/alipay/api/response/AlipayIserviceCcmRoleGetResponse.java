package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.role.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:48:31
 */
public class AlipayIserviceCcmRoleGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7222577656397568737L;

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
	 * 描述信息
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 角色关联的功能点id
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
	 * 角色名称
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

	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}
	public String getCcsInstanceId( ) {
		return this.ccsInstanceId;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	public String getCreatorId( ) {
		return this.creatorId;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setFunctionIds(List<String> functionIds) {
		this.functionIds = functionIds;
	}
	public List<String> getFunctionIds( ) {
		return this.functionIds;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getUpdateTime( ) {
		return this.updateTime;
	}

	public void setUpdaterId(String updaterId) {
		this.updaterId = updaterId;
	}
	public String getUpdaterId( ) {
		return this.updaterId;
	}

}
