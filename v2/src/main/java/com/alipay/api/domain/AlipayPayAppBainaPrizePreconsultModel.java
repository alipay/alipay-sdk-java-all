package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 领奖资格预咨询
 *
 * @author auto create
 * @since 1.0, 2025-04-16 11:02:02
 */
public class AlipayPayAppBainaPrizePreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 6139275736651972879L;

	/**
	 * 从下单url的扩展extJson中获取，key=activityId，此接口带回
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 用户下单的商品id,用于确认用户是否可对该商品进行下单
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
