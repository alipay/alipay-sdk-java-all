package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消百万小店活动报名商家查询
 *
 * @author auto create
 * @since 1.0, 2022-04-20 19:16:02
 */
public class AlipayCommerceOperationBrandsolutionEnrollmerchantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2151773863899254718L;

	/**
	 * 活动唯一标识
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
