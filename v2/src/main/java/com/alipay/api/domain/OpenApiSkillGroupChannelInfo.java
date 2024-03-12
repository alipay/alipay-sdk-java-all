package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 技能组渠道信息
 *
 * @author auto create
 * @since 1.0, 2023-09-28 09:33:14
 */
public class OpenApiSkillGroupChannelInfo extends AlipayObject {

	private static final long serialVersionUID = 3519634139412935878L;

	/**
	 * Cc管理员的id
	 */
	@ApiField("admin_id")
	private String adminId;

	/**
	 * 渠道账户所属组织架构
	 */
	@ApiField("channel_account_ref_organization")
	private String channelAccountRefOrganization;

	/**
	 * 渠道账户所属角色
	 */
	@ApiField("channel_account_role")
	private String channelAccountRole;

	/**
	 * 渠道场景id
	 */
	@ApiField("channel_scene_id")
	private String channelSceneId;

	/**
	 * 渠道场景名
	 */
	@ApiField("channel_scene_name")
	private String channelSceneName;

	/**
	 * 渠道技能组id
	 */
	@ApiField("channel_skill_group_id")
	private String channelSkillGroupId;

	/**
	 * 渠道技能组名称
	 */
	@ApiField("channel_skill_group_name")
	private String channelSkillGroupName;

	/**
	 * 子渠道
	 */
	@ApiField("sub_channel")
	private String subChannel;

	/**
	 * 子渠道名称
	 */
	@ApiField("sub_channel_name")
	private String subChannelName;

	public String getAdminId() {
		return this.adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getChannelAccountRefOrganization() {
		return this.channelAccountRefOrganization;
	}
	public void setChannelAccountRefOrganization(String channelAccountRefOrganization) {
		this.channelAccountRefOrganization = channelAccountRefOrganization;
	}

	public String getChannelAccountRole() {
		return this.channelAccountRole;
	}
	public void setChannelAccountRole(String channelAccountRole) {
		this.channelAccountRole = channelAccountRole;
	}

	public String getChannelSceneId() {
		return this.channelSceneId;
	}
	public void setChannelSceneId(String channelSceneId) {
		this.channelSceneId = channelSceneId;
	}

	public String getChannelSceneName() {
		return this.channelSceneName;
	}
	public void setChannelSceneName(String channelSceneName) {
		this.channelSceneName = channelSceneName;
	}

	public String getChannelSkillGroupId() {
		return this.channelSkillGroupId;
	}
	public void setChannelSkillGroupId(String channelSkillGroupId) {
		this.channelSkillGroupId = channelSkillGroupId;
	}

	public String getChannelSkillGroupName() {
		return this.channelSkillGroupName;
	}
	public void setChannelSkillGroupName(String channelSkillGroupName) {
		this.channelSkillGroupName = channelSkillGroupName;
	}

	public String getSubChannel() {
		return this.subChannel;
	}
	public void setSubChannel(String subChannel) {
		this.subChannel = subChannel;
	}

	public String getSubChannelName() {
		return this.subChannelName;
	}
	public void setSubChannelName(String subChannelName) {
		this.subChannelName = subChannelName;
	}

}
