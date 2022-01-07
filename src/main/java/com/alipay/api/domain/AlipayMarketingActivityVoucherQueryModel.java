package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付券
 *
 * @author auto create
 * @since 1.0, 2021-09-07 23:00:37
 */
public class AlipayMarketingActivityVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8859929257563512928L;

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
