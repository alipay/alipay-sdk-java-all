package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AgentChatInfo;
import com.alipay.api.domain.AgentHotlineInfo;
import com.alipay.api.domain.RoleId;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.agent.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:21:44
 */
public class AlipayIserviceCcmAgentGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5561229731258494164L;

	/** 
	 * 热线接入方式： 0：话机 1：电脑耳机；2：webrtc
	 */
	@ApiField("answering_mode")
	private String answeringMode;

	/** 
	 * 头像的oss file key
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 客服关联的数据权限id列表
	 */
	@ApiListField("ccs_instance_ids")
	@ApiField("string")
	private List<String> ccsInstanceIds;

	/** 
	 * 客服在线信息
	 */
	@ApiListField("chat_config")
	@ApiField("agent_chat_info")
	private List<AgentChatInfo> chatConfig;

	/** 
	 * 创建时间，采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 创建人id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/** 
	 * 钉钉user_id
	 */
	@ApiField("dingtalk_user_id")
	private String dingtalkUserId;

	/** 
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 外部系统用户id,比如：金融云的用户id
	 */
	@ApiField("external_id")
	private String externalId;

	/** 
	 * 客服热线信息
	 */
	@ApiListField("hotline_config")
	@ApiField("agent_hotline_info")
	private List<AgentHotlineInfo> hotlineConfig;

	/** 
	 * 客服id
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 工号
	 */
	@ApiField("job_number")
	private String jobNumber;

	/** 
	 * 客服上次登录时间
采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'
	 */
	@ApiField("last_login_time")
	private Date lastLoginTime;

	/** 
	 * 手机号
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
	 * 角色id列表
	 */
	@ApiListField("role_ids")
	@ApiField("role_id")
	private List<RoleId> roleIds;

	/** 
	 * 客服状态：NORMAL，DELETE
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 用户类型：NORMAL（普通客服），ADMIN（超级管理员，不能被删除）
	 */
	@ApiField("type")
	private String type;

	/** 
	 * 最后修改时间，采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'
	 */
	@ApiField("update_time")
	private Date updateTime;

	/** 
	 * 最后修改人id
	 */
	@ApiField("updater_id")
	private String updaterId;

	public void setAnsweringMode(String answeringMode) {
		this.answeringMode = answeringMode;
	}
	public String getAnsweringMode( ) {
		return this.answeringMode;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar( ) {
		return this.avatar;
	}

	public void setCcsInstanceIds(List<String> ccsInstanceIds) {
		this.ccsInstanceIds = ccsInstanceIds;
	}
	public List<String> getCcsInstanceIds( ) {
		return this.ccsInstanceIds;
	}

	public void setChatConfig(List<AgentChatInfo> chatConfig) {
		this.chatConfig = chatConfig;
	}
	public List<AgentChatInfo> getChatConfig( ) {
		return this.chatConfig;
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

	public void setDingtalkUserId(String dingtalkUserId) {
		this.dingtalkUserId = dingtalkUserId;
	}
	public String getDingtalkUserId( ) {
		return this.dingtalkUserId;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getExternalId( ) {
		return this.externalId;
	}

	public void setHotlineConfig(List<AgentHotlineInfo> hotlineConfig) {
		this.hotlineConfig = hotlineConfig;
	}
	public List<AgentHotlineInfo> getHotlineConfig( ) {
		return this.hotlineConfig;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}
	public String getJobNumber( ) {
		return this.jobNumber;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public Date getLastLoginTime( ) {
		return this.lastLoginTime;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getNickName( ) {
		return this.nickName;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getProfile( ) {
		return this.profile;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getRealName( ) {
		return this.realName;
	}

	public void setRoleIds(List<RoleId> roleIds) {
		this.roleIds = roleIds;
	}
	public List<RoleId> getRoleIds( ) {
		return this.roleIds;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
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
