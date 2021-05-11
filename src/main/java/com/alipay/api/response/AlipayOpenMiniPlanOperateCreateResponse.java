package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.plan.operate.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-22 20:28:33
 */
public class AlipayOpenMiniPlanOperateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8468535989978387429L;

	/** 
	 * 创建支付后推荐方案返回的方案id，后续用户可根据该方案ID对方案进行终止和调整优先级
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
