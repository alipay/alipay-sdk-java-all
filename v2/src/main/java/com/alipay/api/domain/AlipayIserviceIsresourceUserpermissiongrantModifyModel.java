package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改用户技能组权限
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:04:45
 */
public class AlipayIserviceIsresourceUserpermissiongrantModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5369246748159474334L;

	/**
	 * 工作台技能组id列表
	 */
	@ApiListField("clv_skill_group_ids")
	@ApiField("string")
	private List<String> clvSkillGroupIds;

	/**
	 * 工作台用户id
	 */
	@ApiField("clv_user_id")
	private Long clvUserId;

	/**
	 * true，赋权; false，回收
	 */
	@ApiField("grant")
	private Boolean grant;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public List<String> getClvSkillGroupIds() {
		return this.clvSkillGroupIds;
	}
	public void setClvSkillGroupIds(List<String> clvSkillGroupIds) {
		this.clvSkillGroupIds = clvSkillGroupIds;
	}

	public Long getClvUserId() {
		return this.clvUserId;
	}
	public void setClvUserId(Long clvUserId) {
		this.clvUserId = clvUserId;
	}

	public Boolean getGrant() {
		return this.grant;
	}
	public void setGrant(Boolean grant) {
		this.grant = grant;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
