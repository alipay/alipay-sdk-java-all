package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户奖品兑奖资格数
 *
 * @author auto create
 * @since 1.0, 2025-04-16 11:02:01
 */
public class AlipayPayAppBainaPrizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7276617796419879144L;

	/**
	 * 下单url的extJson参数中获取，key= activityId,此接口带回
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 下单商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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
