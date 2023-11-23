package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序用户灰度分组修改
 *
 * @author auto create
 * @since 1.0, 2023-02-14 16:27:38
 */
public class AlipayOpenMiniInnerversionCustomgrayModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7876439266547551273L;

	/**
	 * 操作类型
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 来源类型，新接入方需要向支付宝申请专用来源，否则不予接入，申请方式请参见接入手册。
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 灰度用户id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * uid列表
	 */
	@ApiListField("open_ids")
	@ApiField("string")
	private List<String> openIds;

	/**
	 * uid列表
	 */
	@ApiListField("user_ids")
	@ApiField("string")
	private List<String> userIds;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getOpenIds() {
		return this.openIds;
	}
	public void setOpenIds(List<String> openIds) {
		this.openIds = openIds;
	}

	public List<String> getUserIds() {
		return this.userIds;
	}
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

}
