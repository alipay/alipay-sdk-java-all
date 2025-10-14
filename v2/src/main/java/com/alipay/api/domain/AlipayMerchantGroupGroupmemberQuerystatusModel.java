package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商家群用户的入群状态
 *
 * @author auto create
 * @since 1.0, 2025-07-22 15:06:31
 */
public class AlipayMerchantGroupGroupmemberQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 4211642144718854814L;

	/**
	 * 群组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户uid，2088
	 */
	@ApiField("user_id")
	private String userId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
