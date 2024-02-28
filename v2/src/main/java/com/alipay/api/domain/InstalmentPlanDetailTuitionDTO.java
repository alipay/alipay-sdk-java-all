package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 到账明细数据
 *
 * @author auto create
 * @since 1.0, 2020-12-08 18:51:22
 */
public class InstalmentPlanDetailTuitionDTO extends AlipayObject {

	private static final long serialVersionUID = 7466716576822388973L;

	/**
	 * 完成的计划信息
	 */
	@ApiField("plan")
	private InstalmentPlanTuitionDTO plan;

	/**
	 * 打款计划涉及的周期配置
	 */
	@ApiField("recharge_order")
	private RechargeOrderTuitionDTO rechargeOrder;

	public InstalmentPlanTuitionDTO getPlan() {
		return this.plan;
	}
	public void setPlan(InstalmentPlanTuitionDTO plan) {
		this.plan = plan;
	}

	public RechargeOrderTuitionDTO getRechargeOrder() {
		return this.rechargeOrder;
	}
	public void setRechargeOrder(RechargeOrderTuitionDTO rechargeOrder) {
		this.rechargeOrder = rechargeOrder;
	}

}
