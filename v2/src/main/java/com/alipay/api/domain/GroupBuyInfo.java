package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拼团信息
 *
 * @author auto create
 * @since 1.0, 2024-05-30 10:21:37
 */
public class GroupBuyInfo extends AlipayObject {

	private static final long serialVersionUID = 5711648614375222436L;

	/**
	 * 团ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 拼团状态
	 */
	@ApiField("group_status")
	private String groupStatus;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupStatus() {
		return this.groupStatus;
	}
	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}

}
