package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户查询商品代金券详情
 *
 * @author auto create
 * @since 1.0, 2019-05-07 10:06:31
 */
public class KoubeiMarketingCampaignItemMerchantactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8569759413876242356L;

	/**
	 * 运营活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 外部id
	 */
	@ApiField("external_unique_id")
	private String externalUniqueId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getExternalUniqueId() {
		return this.externalUniqueId;
	}
	public void setExternalUniqueId(String externalUniqueId) {
		this.externalUniqueId = externalUniqueId;
	}

}
