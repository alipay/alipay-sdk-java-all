package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商户自营销信息查询
 *
 * @author auto create
 * @since 1.0, 2021-01-25 10:16:15
 */
public class AlipayMarketingCampaignSelfActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6187187746278366494L;

	/**
	 * b.alipay.com 运营中心配置后台-活动详情-活动id
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
