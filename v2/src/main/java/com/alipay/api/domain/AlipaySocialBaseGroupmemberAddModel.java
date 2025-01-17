package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝增加群成员
 *
 * @author auto create
 * @since 1.0, 2022-11-01 22:15:13
 */
public class AlipaySocialBaseGroupmemberAddModel extends AlipayObject {

	private static final long serialVersionUID = 6797373166312337767L;

	/**
	 * 加人的时候，是否需要校验加人者和被加的人的好友关系
	 */
	@ApiField("friend_validate")
	private Boolean friendValidate;

	/**
	 * 群的id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 商家id列表
	 */
	@ApiListField("open_ids")
	@ApiField("string")
	private List<String> openIds;

	/**
	 * 增加群成员的时候，选择的用户userid,每次不能超过50个，每个群人数上限500人，user_ids的值为错误的uid时，多个uid的情况下会添加成功正确的uid，如果所有添加的uid全部错误，则会报错
	 */
	@ApiListField("user_ids")
	@ApiField("string")
	private List<String> userIds;

	public Boolean getFriendValidate() {
		return this.friendValidate;
	}
	public void setFriendValidate(Boolean friendValidate) {
		this.friendValidate = friendValidate;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
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
