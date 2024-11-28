package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转接技能组信息
 *
 * @author auto create
 * @since 1.0, 2023-09-28 09:33:14
 */
public class OpenApiTransferSkillGroupInfo extends AlipayObject {

	private static final long serialVersionUID = 5662614286583199137L;

	/**
	 * 旧平台技能组id
	 */
	@ApiField("clv_meta_organization_id")
	private String clvMetaOrganizationId;

	/**
	 * 旧平台技能组id
	 */
	@ApiField("clv_skill_group_id")
	private String clvSkillGroupId;

	/**
	 * 技能组类型
	 */
	@ApiField("clv_skill_group_type")
	private Long clvSkillGroupType;

	/**
	 * 场景实例信息
	 */
	@ApiField("scene_instance_info")
	private OpenApiSceneInstanceInfo sceneInstanceInfo;

	/**
	 * 技能组渠道信息
	 */
	@ApiField("skill_group_channel")
	private OpenApiSkillGroupChannelInfo skillGroupChannel;

	/**
	 * 技能组id
	 */
	@ApiField("skill_group_id")
	private String skillGroupId;

	/**
	 * 技能组名称
	 */
	@ApiField("skill_group_name")
	private String skillGroupName;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getClvMetaOrganizationId() {
		return this.clvMetaOrganizationId;
	}
	public void setClvMetaOrganizationId(String clvMetaOrganizationId) {
		this.clvMetaOrganizationId = clvMetaOrganizationId;
	}

	public String getClvSkillGroupId() {
		return this.clvSkillGroupId;
	}
	public void setClvSkillGroupId(String clvSkillGroupId) {
		this.clvSkillGroupId = clvSkillGroupId;
	}

	public Long getClvSkillGroupType() {
		return this.clvSkillGroupType;
	}
	public void setClvSkillGroupType(Long clvSkillGroupType) {
		this.clvSkillGroupType = clvSkillGroupType;
	}

	public OpenApiSceneInstanceInfo getSceneInstanceInfo() {
		return this.sceneInstanceInfo;
	}
	public void setSceneInstanceInfo(OpenApiSceneInstanceInfo sceneInstanceInfo) {
		this.sceneInstanceInfo = sceneInstanceInfo;
	}

	public OpenApiSkillGroupChannelInfo getSkillGroupChannel() {
		return this.skillGroupChannel;
	}
	public void setSkillGroupChannel(OpenApiSkillGroupChannelInfo skillGroupChannel) {
		this.skillGroupChannel = skillGroupChannel;
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}
	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
	}

	public String getSkillGroupName() {
		return this.skillGroupName;
	}
	public void setSkillGroupName(String skillGroupName) {
		this.skillGroupName = skillGroupName;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
