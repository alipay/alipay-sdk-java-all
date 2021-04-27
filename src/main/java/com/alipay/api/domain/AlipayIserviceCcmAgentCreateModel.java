package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新增客服接口
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:21:50
 */
public class AlipayIserviceCcmAgentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3111697555418196697L;

	/**
	 * 热线接入方式，取值0，1，2
	 */
	@ApiField("answering_mode")
	private String answeringMode;

	/**
	 * 部门id列表
	 */
	@ApiListField("ccs_instance_ids")
	@ApiField("string")
	private List<String> ccsInstanceIds;

	/**
	 * 在线技能组设置，技能组部门间隔离，此设置应与ccs_instance_ids对应
	 */
	@ApiListField("chat_configs")
	@ApiField("agent_chat_info")
	private List<AgentChatInfo> chatConfigs;

	/**
	 * 操作人客服id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 客服邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 客服账号id，当user_channel=ALIPAY时，external_user_id为支付宝账号id
	 */
	@ApiField("external_user_id")
	private String externalUserId;

	/**
	 * 热线技能组设置，技能组部门间隔离，此设置应与ccs_instance_ids对应
	 */
	@ApiListField("hotline_configs")
	@ApiField("agent_hotline_info")
	private List<AgentHotlineInfo> hotlineConfigs;

	/**
	 * 客服工号，新增后不可变更。4位数字，不可重复
	 */
	@ApiField("job_number")
	private String jobNumber;

	/**
	 * 客服手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 客服昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 客服姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 角色id列表
	 */
	@ApiListField("role_ids")
	@ApiField("role_id")
	private List<RoleId> roleIds;

	/**
	 * 客服账号渠道 ALIPAY:支付宝账号
	 */
	@ApiField("user_channel")
	private String userChannel;

	public String getAnsweringMode() {
		return this.answeringMode;
	}
	public void setAnsweringMode(String answeringMode) {
		this.answeringMode = answeringMode;
	}

	public List<String> getCcsInstanceIds() {
		return this.ccsInstanceIds;
	}
	public void setCcsInstanceIds(List<String> ccsInstanceIds) {
		this.ccsInstanceIds = ccsInstanceIds;
	}

	public List<AgentChatInfo> getChatConfigs() {
		return this.chatConfigs;
	}
	public void setChatConfigs(List<AgentChatInfo> chatConfigs) {
		this.chatConfigs = chatConfigs;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getExternalUserId() {
		return this.externalUserId;
	}
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}

	public List<AgentHotlineInfo> getHotlineConfigs() {
		return this.hotlineConfigs;
	}
	public void setHotlineConfigs(List<AgentHotlineInfo> hotlineConfigs) {
		this.hotlineConfigs = hotlineConfigs;
	}

	public String getJobNumber() {
		return this.jobNumber;
	}
	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public List<RoleId> getRoleIds() {
		return this.roleIds;
	}
	public void setRoleIds(List<RoleId> roleIds) {
		this.roleIds = roleIds;
	}

	public String getUserChannel() {
		return this.userChannel;
	}
	public void setUserChannel(String userChannel) {
		this.userChannel = userChannel;
	}

}
