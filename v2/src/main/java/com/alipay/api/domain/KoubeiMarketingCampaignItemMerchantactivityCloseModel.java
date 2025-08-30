package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户下架代金券
 *
 * @author auto create
 * @since 1.0, 2022-09-19 15:11:24
 */
public class KoubeiMarketingCampaignItemMerchantactivityCloseModel extends AlipayObject {

	private static final long serialVersionUID = 5645654748757756817L;

	/**
	 * 活动id。通过 <a href="https://opendocs.alipay.com/pre-apis/api_pre/koubei.marketing.campaign.item.merchantactivity.create">koubei.marketing.campaign.item.merchantactivity.create</a>(商户创建商品代金券)获取。
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
