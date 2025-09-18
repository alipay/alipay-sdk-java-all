package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序商品券
 *
 * @author auto create
 * @since 1.0, 2024-08-16 15:14:15
 */
public class AlipayMarketingToolActivityAppitemvoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2637795484249823323L;

	/**
	 * 活动id 来源：来自创建接口返回的activity_id
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
