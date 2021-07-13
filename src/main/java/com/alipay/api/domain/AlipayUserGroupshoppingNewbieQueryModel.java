package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝拼团查询是否有一元拼资格
 *
 * @author auto create
 * @since 1.0, 2018-08-24 11:23:47
 */
public class AlipayUserGroupshoppingNewbieQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4748136736114438831L;

	/**
	 * 支付宝淘宝拼团的组团id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 淘宝支付宝拼团的商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
