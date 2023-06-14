package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据clv技能组id查询技能组信息
 *
 * @author auto create
 * @since 1.0, 2023-05-26 10:39:33
 */
public class AlipayIserviceIsresourceGrpquerybyclvgrpidsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6648372475594349588L;

	/**
	 * 根据clv技能组id查询技能组信息
	 */
	@ApiListField("clv_skill_group_ids")
	@ApiField("string")
	private List<String> clvSkillGroupIds;

	/**
	 * 是否查询场景实例信息
	 */
	@ApiField("query_scene_instance")
	private Boolean querySceneInstance;

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

	public Boolean getQuerySceneInstance() {
		return this.querySceneInstance;
	}
	public void setQuerySceneInstance(Boolean querySceneInstance) {
		this.querySceneInstance = querySceneInstance;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
