package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户下架代金券
 *
 * @author auto create
 * @since 1.0, 2019-05-07 10:06:24
 */
public class KoubeiMarketingCampaignItemMerchantactivityCloseModel extends AlipayObject {

	private static final long serialVersionUID = 2767218145654386258L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

}
