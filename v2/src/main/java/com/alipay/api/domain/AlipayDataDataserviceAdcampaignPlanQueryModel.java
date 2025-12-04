package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计划详情查询
 *
 * @author auto create
 * @since 1.0, 2025-07-15 15:13:04
 */
public class AlipayDataDataserviceAdcampaignPlanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2551643569392469128L;

	/**
	 * 计划id
	 */
	@ApiField("plan_id")
	private Long planId;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public Long getPlanId() {
		return this.planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
