package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景化商家营销活动查询
 *
 * @author auto create
 * @since 1.0, 2022-06-27 11:30:57
 */
public class KoubeiMarketingCampaignMerchantActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4362735629992614479L;

	/**
	 * 口碑营销活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 请求id，方便幂等控制和排查问题，请保证唯一
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
