package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁报名计划详情查询
 *
 * @author auto create
 * @since 1.0, 2023-07-11 11:07:25
 */
public class AlipayCommerceLeaseEnrollGetModel extends AlipayObject {

	private static final long serialVersionUID = 4394291447985277147L;

	/**
	 * 租赁计划id
	 */
	@ApiField("plan_id")
	private String planId;

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
