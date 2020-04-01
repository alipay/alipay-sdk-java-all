package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告计划详情查询
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:17:19
 */
public class AlipayCommerceTransportAdPlanGetModel extends AlipayObject {

	private static final long serialVersionUID = 5616692434761276154L;

	/**
	 * 广告系统的用户ID
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 通过API新建计划，获得的计划ID
	 */
	@ApiField("plan_id")
	private Long planId;

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

	public Long getPlanId() {
		return this.planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}

}
