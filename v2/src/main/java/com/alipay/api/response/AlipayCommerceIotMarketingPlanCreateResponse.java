package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.marketing.plan.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-13 19:12:40
 */
public class AlipayCommerceIotMarketingPlanCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6491656193413513742L;

	/** 
	 * 投放计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/** 
	 * 投放计划状态
  WAITTING_AUDIT(0, "WAITTING_AUDIT", "待审核"),
    AUDITING(1, "AUDITING", "审核中"),
    AUDIT_SUCCESS(2, "AUDIT_SUCCESS", "审核成功"),
    AUDIT_FAIL(3, "AUDIT_FAIL", "审核失败"),
    ONLINE(4, "ONLINE", "已上线"),
    OFFLINE(5, "OFFLINE", "已失效");
	 */
	@ApiField("status")
	private Long status;

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

}
