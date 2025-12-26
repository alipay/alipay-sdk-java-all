package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告权益详情查询接口
 *
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:41
 */
public class AlipayCommerceRetailBenefitdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2544443221254416132L;

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
