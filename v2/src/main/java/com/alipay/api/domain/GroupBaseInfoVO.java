package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 群组基础信息。包含群组id、群组名称、群组管理员列表等信息。
 *
 * @author auto create
 * @since 1.0, 2024-09-30 21:05:18
 */
public class GroupBaseInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8829456176344513426L;

	/**
	 * 是否禁言，true：已经被禁言了，false：未被禁言。
	 */
	@ApiField("forbid_send_msg")
	private Boolean forbidSendMsg;

	/**
	 * 传入已经有群组权限的用户user_id，2088开头的16位数字。有群组权限的角色：主账号、群超级管理员、群组管理员。
	 */
	@ApiListField("group_admin_open_id_list")
	@ApiField("string")
	private List<String> groupAdminOpenIdList;

	/**
	 * 传入已经有群组权限的用户user_id，2088开头的16位数字。有群组权限的角色：主账号、群超级管理员、群组管理员。
	 */
	@ApiListField("group_admin_user_id_list")
	@ApiField("string")
	private List<String> groupAdminUserIdList;

	/**
	 * 群数量
	 */
	@ApiField("group_count")
	private String groupCount;

	/**
	 * 群组id，表里唯一键，创建群组自动生成，编辑群组必填
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 群组下群成员总数
	 */
	@ApiField("group_member_count")
	private String groupMemberCount;

	/**
	 * 定义群组分类，便于后台管理运营识别，可与下面设置的群名称保持一致；例：xx门店群，内部测试群
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 修改是否对历史群组生效。true：修改对历史群组生效,false：修改对历史群组不生效。
	 */
	@ApiField("modify_history_group")
	private Boolean modifyHistoryGroup;

	/**
	 * 小程序id。用于群头像展示。
	 */
	@ApiField("related_app_id")
	private String relatedAppId;

	/**
	 * 小程序logo。用于商家群头像展示。
	 */
	@ApiField("related_app_logo")
	private String relatedAppLogo;

	public Boolean getForbidSendMsg() {
		return this.forbidSendMsg;
	}
	public void setForbidSendMsg(Boolean forbidSendMsg) {
		this.forbidSendMsg = forbidSendMsg;
	}

	public List<String> getGroupAdminOpenIdList() {
		return this.groupAdminOpenIdList;
	}
	public void setGroupAdminOpenIdList(List<String> groupAdminOpenIdList) {
		this.groupAdminOpenIdList = groupAdminOpenIdList;
	}

	public List<String> getGroupAdminUserIdList() {
		return this.groupAdminUserIdList;
	}
	public void setGroupAdminUserIdList(List<String> groupAdminUserIdList) {
		this.groupAdminUserIdList = groupAdminUserIdList;
	}

	public String getGroupCount() {
		return this.groupCount;
	}
	public void setGroupCount(String groupCount) {
		this.groupCount = groupCount;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupMemberCount() {
		return this.groupMemberCount;
	}
	public void setGroupMemberCount(String groupMemberCount) {
		this.groupMemberCount = groupMemberCount;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Boolean getModifyHistoryGroup() {
		return this.modifyHistoryGroup;
	}
	public void setModifyHistoryGroup(Boolean modifyHistoryGroup) {
		this.modifyHistoryGroup = modifyHistoryGroup;
	}

	public String getRelatedAppId() {
		return this.relatedAppId;
	}
	public void setRelatedAppId(String relatedAppId) {
		this.relatedAppId = relatedAppId;
	}

	public String getRelatedAppLogo() {
		return this.relatedAppLogo;
	}
	public void setRelatedAppLogo(String relatedAppLogo) {
		this.relatedAppLogo = relatedAppLogo;
	}

}
