package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拼团信息
 *
 * @author auto create
 * @since 1.0, 2024-07-15 15:44:16
 */
public class GroupBuyInfo extends AlipayObject {

	private static final long serialVersionUID = 6124172877436858851L;

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
