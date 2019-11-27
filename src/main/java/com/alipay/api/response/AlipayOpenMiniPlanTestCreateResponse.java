package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.plan.test.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-02 14:56:27
 */
public class AlipayOpenMiniPlanTestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6552661673884449758L;

	/** 
	 * 创建的投放计划id, 用于后续查询、删除操作
	 */
	@ApiField("plan_id")
	private String planId;

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

}
