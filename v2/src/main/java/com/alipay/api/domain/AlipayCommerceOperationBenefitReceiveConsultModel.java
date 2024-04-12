package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益领取咨询接口
 *
 * @author auto create
 * @since 1.0, 2023-06-28 14:21:10
 */
public class AlipayCommerceOperationBenefitReceiveConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1895373556334556313L;

	/**
	 * 计划id
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
