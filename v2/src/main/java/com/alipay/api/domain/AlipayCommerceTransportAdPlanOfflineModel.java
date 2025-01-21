package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计划下线操作
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:17:45
 */
public class AlipayCommerceTransportAdPlanOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 1431564358598155566L;

	/**
	 * 广告主id + 下线计划操作时，需要校验该plan是否属于该广告主
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 广告计划id + 根据广告计划id下线对应的广告计划
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
