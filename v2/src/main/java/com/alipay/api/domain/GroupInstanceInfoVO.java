package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 群信息。包含群id、群名称、群介绍、欢迎语等群配置信息。
 *
 * @author auto create
 * @since 1.0, 2024-05-15 16:49:57
 */
public class GroupInstanceInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4529864245832888912L;

	/**
	 * 请一定打开，开启后获得满500人自动裂变新群聊功能。true：开启；false：关闭。
	 */
	@ApiField("auto_create_group_instance")
	private Boolean autoCreateGroupInstance;

	/**
	 * 允许管理员与群员私聊：建议开启。true：关闭；false：开启。
	 */
	@ApiField("forbid_admin_chat")
	private Boolean forbidAdminChat;

	/**
	 * 允许群员发起私聊：建议关闭；关闭后群员将不能主动添加群主或其它群内用户好友。true：关闭；false：开启。
	 */
	@ApiField("forbid_member_chat")
	private Boolean forbidMemberChat;

	/**
	 * 群创建的时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 输入群管理员的个人支付宝账号、真实姓名、登录账号，自动建群时会将该账号默认设为群管理员；如需多个可“添加管理员”，最多可设置10个。
	 */
	@ApiListField("group_instance_admin_user_list")
	@ApiField("group_user_v_o")
	private List<GroupUserVO> groupInstanceAdminUserList;

	/**
	 * 用户在加群页面可见的群相关介绍信息。建议填写日常活动以及群友福利。
	 */
	@ApiField("group_instance_desc")
	private String groupInstanceDesc;

	/**
	 * 群id
	 */
	@ApiField("group_instance_id")
	private String groupInstanceId;

	/**
	 * 群主。群主的个人支付宝uid、真实姓名、登录账号，自动建群时会将该账号默认设为群主。
	 */
	@ApiField("group_instance_master")
	private GroupUserVO groupInstanceMaster;

	/**
	 * 群成员总数
	 */
	@ApiField("group_instance_member_count")
	private String groupInstanceMemberCount;

	/**
	 * 用户在支付宝APP可见的群名称，自动建群时会使用“该名称+X群”来命名，无需手动输入群号。建议以品牌名称+分类方式命名，请勿添加数字。
	 */
	@ApiField("group_instance_name")
	private String groupInstanceName;

	/**
	 * 群头像url
	 */
	@ApiField("head_img")
	private String headImg;

	/**
	 * 支付宝内群成员列表
	 */
	@ApiListField("member_list")
	@ApiField("group_user_v_o")
	private List<GroupUserVO> memberList;

	/**
	 * 群公告
	 */
	@ApiField("notice")
	private String notice;

	/**
	 * 允许群员邀请其他用户入群：建议开启。true：开启；false：关闭。
	 */
	@ApiField("open_invite")
	private Boolean openInvite;

	public Boolean getAutoCreateGroupInstance() {
		return this.autoCreateGroupInstance;
	}
	public void setAutoCreateGroupInstance(Boolean autoCreateGroupInstance) {
		this.autoCreateGroupInstance = autoCreateGroupInstance;
	}

	public Boolean getForbidAdminChat() {
		return this.forbidAdminChat;
	}
	public void setForbidAdminChat(Boolean forbidAdminChat) {
		this.forbidAdminChat = forbidAdminChat;
	}

	public Boolean getForbidMemberChat() {
		return this.forbidMemberChat;
	}
	public void setForbidMemberChat(Boolean forbidMemberChat) {
		this.forbidMemberChat = forbidMemberChat;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public List<GroupUserVO> getGroupInstanceAdminUserList() {
		return this.groupInstanceAdminUserList;
	}
	public void setGroupInstanceAdminUserList(List<GroupUserVO> groupInstanceAdminUserList) {
		this.groupInstanceAdminUserList = groupInstanceAdminUserList;
	}

	public String getGroupInstanceDesc() {
		return this.groupInstanceDesc;
	}
	public void setGroupInstanceDesc(String groupInstanceDesc) {
		this.groupInstanceDesc = groupInstanceDesc;
	}

	public String getGroupInstanceId() {
		return this.groupInstanceId;
	}
	public void setGroupInstanceId(String groupInstanceId) {
		this.groupInstanceId = groupInstanceId;
	}

	public GroupUserVO getGroupInstanceMaster() {
		return this.groupInstanceMaster;
	}
	public void setGroupInstanceMaster(GroupUserVO groupInstanceMaster) {
		this.groupInstanceMaster = groupInstanceMaster;
	}

	public String getGroupInstanceMemberCount() {
		return this.groupInstanceMemberCount;
	}
	public void setGroupInstanceMemberCount(String groupInstanceMemberCount) {
		this.groupInstanceMemberCount = groupInstanceMemberCount;
	}

	public String getGroupInstanceName() {
		return this.groupInstanceName;
	}
	public void setGroupInstanceName(String groupInstanceName) {
		this.groupInstanceName = groupInstanceName;
	}

	public String getHeadImg() {
		return this.headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public List<GroupUserVO> getMemberList() {
		return this.memberList;
	}
	public void setMemberList(List<GroupUserVO> memberList) {
		this.memberList = memberList;
	}

	public String getNotice() {
		return this.notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}

	public Boolean getOpenInvite() {
		return this.openInvite;
	}
	public void setOpenInvite(Boolean openInvite) {
		this.openInvite = openInvite;
	}

}
