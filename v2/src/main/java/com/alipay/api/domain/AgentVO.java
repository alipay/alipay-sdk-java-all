package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客服详情
 *
 * @author auto create
 * @since 1.0, 2023-06-08 20:09:27
 */
public class AgentVO extends AlipayObject {

	private static final long serialVersionUID = 7897448789739313731L;

	/**
	 * 热线接入方式
	 */
	@ApiField("answering_mode")
	private String answeringMode;

	/**
	 * 头像的oss file key
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 客服归属的部门id列表
	 */
	@ApiListField("ccs_instance_ids")
	@ApiField("string")
	private List<String> ccsInstanceIds;

	/**
	 * 在线技能组信息
	 */
	@ApiListField("chat_config")
	@ApiField("agent_chat_info")
	private List<AgentChatInfo> chatConfig;

	/**
	 * 创建时间， 标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 创建人id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 钉钉user_id（绑定钉钉的用户该字段非空）
	 */
	@ApiField("dingtalk_user_id")
	private String dingtalkUserId;

	/**
	 * 客服邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 外部系统用户,比如金融云的用户id、支付宝账号id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 热线技能组信息
	 */
	@ApiListField("hotline_config")
	@ApiField("agent_hotline_info")
	private List<AgentHotlineInfo> hotlineConfig;

	/**
	 * 客服唯一标识id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 客服工号
	 */
	@ApiField("job_number")
	private String jobNumber;

	/**
	 * 最后登录时间,标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("last_login_time")
	private Date lastLoginTime;

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
	 * 个人简介
	 */
	@ApiField("profile")
	private String profile;

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
	 * 状态：NORMAL，DELETE
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户类型：NORMAL（普通客服），ADMIN（超级管理员，不能被删除）
	 */
	@ApiField("type")
	private String type;

	/**
	 * 最后修改时间， 标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("update_time")
	private Date updateTime;

	/**
	 * 最后修改人id
	 */
	@ApiField("updater_id")
	private String updaterId;

	public String getAnsweringMode() {
		return this.answeringMode;
	}
	public void setAnsweringMode(String answeringMode) {
		this.answeringMode = answeringMode;
	}

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public List<String> getCcsInstanceIds() {
		return this.ccsInstanceIds;
	}
	public void setCcsInstanceIds(List<String> ccsInstanceIds) {
		this.ccsInstanceIds = ccsInstanceIds;
	}

	public List<AgentChatInfo> getChatConfig() {
		return this.chatConfig;
	}
	public void setChatConfig(List<AgentChatInfo> chatConfig) {
		this.chatConfig = chatConfig;
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

	public String getDingtalkUserId() {
		return this.dingtalkUserId;
	}
	public void setDingtalkUserId(String dingtalkUserId) {
		this.dingtalkUserId = dingtalkUserId;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public List<AgentHotlineInfo> getHotlineConfig() {
		return this.hotlineConfig;
	}
	public void setHotlineConfig(List<AgentHotlineInfo> hotlineConfig) {
		this.hotlineConfig = hotlineConfig;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getJobNumber() {
		return this.jobNumber;
	}
	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
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

	public String getProfile() {
		return this.profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
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
