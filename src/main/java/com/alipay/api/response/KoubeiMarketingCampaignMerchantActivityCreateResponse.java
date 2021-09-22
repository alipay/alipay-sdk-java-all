package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MActivityDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.merchant.activity.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-18 17:22:31
 */
public class KoubeiMarketingCampaignMerchantActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8254731387492674118L;

	/** 
	 * 创建成功之后返回活动详情信息，包含活动activity_id和活动当前状态activity_status等信息。
	 */
	@ApiField("activity_detail_info")
	private MActivityDetailInfo activityDetailInfo;

	public void setActivityDetailInfo(MActivityDetailInfo activityDetailInfo) {
		this.activityDetailInfo = activityDetailInfo;
	}
	public MActivityDetailInfo getActivityDetailInfo( ) {
		return this.activityDetailInfo;
	}

}
