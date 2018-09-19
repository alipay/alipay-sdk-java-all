package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单参加活动信息
 *
 * @author auto create
 * @since 1.0, 2017-09-27 10:58:52
 */
public class KbOrderActivityModel extends AlipayObject {

	private static final long serialVersionUID = 8276542567721924985L;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

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

}
