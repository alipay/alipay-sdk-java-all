package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据clvUserIds查询用户信息
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:02:03
 */
public class AlipayIserviceIsresourceUserquerybyclvuidsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5114465313772141363L;

	/**
	 * 旧平台的用户id
	 */
	@ApiListField("clv_user_ids")
	@ApiField("number")
	private List<Long> clvUserIds;

	/**
	 * 是否查询角色
	 */
	@ApiField("query_role")
	private Boolean queryRole;

	/**
	 * 是否查询技能组
	 */
	@ApiField("query_skill_group")
	private Boolean querySkillGroup;

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

	public List<Long> getClvUserIds() {
		return this.clvUserIds;
	}
	public void setClvUserIds(List<Long> clvUserIds) {
		this.clvUserIds = clvUserIds;
	}

	public Boolean getQueryRole() {
		return this.queryRole;
	}
	public void setQueryRole(Boolean queryRole) {
		this.queryRole = queryRole;
	}

	public Boolean getQuerySkillGroup() {
		return this.querySkillGroup;
	}
	public void setQuerySkillGroup(Boolean querySkillGroup) {
		this.querySkillGroup = querySkillGroup;
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
