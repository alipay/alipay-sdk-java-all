package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新客服接口
 *
 * @author auto create
 * @since 1.0, 2024-07-02 10:25:16
 */
public class AlipayIserviceCcmAgentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1159317971362578476L;

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
	 * 客服邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 热线技能组设置，技能组部门间隔离，此设置应与ccs_instance_ids对应
	 */
	@ApiListField("hotline_configs")
	@ApiField("agent_hotline_info")
	private List<AgentHotlineInfo> hotlineConfigs;

	/**
	 * 客服id
	 */
	@ApiField("id")
	private String id;

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
	 * 客服角色id列表
	 */
	@ApiListField("role_ids")
	@ApiField("role_id")
	private List<RoleId> roleIds;

	/**
	 * 操作人客服id
	 */
	@ApiField("updater_id")
	private String updaterId;

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

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<AgentHotlineInfo> getHotlineConfigs() {
		return this.hotlineConfigs;
	}
	public void setHotlineConfigs(List<AgentHotlineInfo> hotlineConfigs) {
		this.hotlineConfigs = hotlineConfigs;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
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

	public String getUpdaterId() {
		return this.updaterId;
	}
	public void setUpdaterId(String updaterId) {
		this.updaterId = updaterId;
	}

}
