package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阶段付款计划详情
 *
 * @author auto create
 * @since 1.0, 2024-04-23 10:59:50
 */
public class StagePayPlanInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7294431478645234848L;

	/**
	 * 阶段计划付款编号
	 */
	@ApiField("plan_pay_no")
	private Long planPayNo;

	/**
	 * 阶段付款计划付款金额，单位：元，精确到小数点后两位
	 */
	@ApiField("plan_pay_price")
	private String planPayPrice;

	/**
	 * 阶段付款计划付款时间，多个计划需保证付款时间递增
	 */
	@ApiField("plan_pay_time")
	private Date planPayTime;

	public Long getPlanPayNo() {
		return this.planPayNo;
	}
	public void setPlanPayNo(Long planPayNo) {
		this.planPayNo = planPayNo;
	}

	public String getPlanPayPrice() {
		return this.planPayPrice;
	}
	public void setPlanPayPrice(String planPayPrice) {
		this.planPayPrice = planPayPrice;
	}

	public Date getPlanPayTime() {
		return this.planPayTime;
	}
	public void setPlanPayTime(Date planPayTime) {
		this.planPayTime = planPayTime;
	}

}
