package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝群详情
 *
 * @author auto create
 * @since 1.0, 2022-10-31 19:26:55
 */
public class GroupDetail extends AlipayObject {

	private static final long serialVersionUID = 2172293777865172272L;

	/**
	 * 管理员商家id
	 */
	@ApiListField("admin_open_ids")
	@ApiField("string")
	private List<String> adminOpenIds;

	/**
	 * 群管理员user_id
	 */
	@ApiListField("admin_user_ids")
	@ApiField("string")
	private List<String> adminUserIds;

	/**
	 * 群创建的时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 支付宝群id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 群头像url
	 */
	@ApiField("group_img")
	private String groupImg;

	/**
	 * 支付宝群名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 群主商家openId
	 */
	@ApiField("master_open_id")
	private String masterOpenId;

	/**
	 * 群主的user_id
	 */
	@ApiField("master_user_id")
	private String masterUserId;

	/**
	 * 群成员个数
	 */
	@ApiField("member_count")
	private Long memberCount;

	/**
	 * 支付宝内群成员列表
	 */
	@ApiListField("members")
	@ApiField("group_member_detail")
	private List<GroupMemberDetail> members;

	/**
	 * 群公告
	 */
	@ApiField("notice")
	private String notice;

	public List<String> getAdminOpenIds() {
		return this.adminOpenIds;
	}
	public void setAdminOpenIds(List<String> adminOpenIds) {
		this.adminOpenIds = adminOpenIds;
	}

	public List<String> getAdminUserIds() {
		return this.adminUserIds;
	}
	public void setAdminUserIds(List<String> adminUserIds) {
		this.adminUserIds = adminUserIds;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupImg() {
		return this.groupImg;
	}
	public void setGroupImg(String groupImg) {
		this.groupImg = groupImg;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getMasterOpenId() {
		return this.masterOpenId;
	}
	public void setMasterOpenId(String masterOpenId) {
		this.masterOpenId = masterOpenId;
	}

	public String getMasterUserId() {
		return this.masterUserId;
	}
	public void setMasterUserId(String masterUserId) {
		this.masterUserId = masterUserId;
	}

	public Long getMemberCount() {
		return this.memberCount;
	}
	public void setMemberCount(Long memberCount) {
		this.memberCount = memberCount;
	}

	public List<GroupMemberDetail> getMembers() {
		return this.members;
	}
	public void setMembers(List<GroupMemberDetail> members) {
		this.members = members;
	}

	public String getNotice() {
		return this.notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}

}
