package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告计划审核
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:30:03
 */
public class AlipayCommerceTransportAdPlanCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 8857729818633634624L;

	/**
	 * 广告系统用户ID
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 广告计划ID
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
