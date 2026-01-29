package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租金分期信息
 *
 * @author auto create
 * @since 1.0, 2025-08-05 22:04:54
 */
public class OrderModifyRentInstallment extends AlipayObject {

	private static final long serialVersionUID = 4833296857498263442L;

	/**
	 * 租期。标识第几期，起始值为1，需保证编号递增
	 */
	@ApiField("installment_no")
	private Long installmentNo;

	/**
	 * 计划扣款时间，表示从该日期起可以发起当前租金扣款，多期需保证付款时间递增。
	 */
	@ApiField("plan_pay_time")
	private Date planPayTime;

	public Long getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(Long installmentNo) {
		this.installmentNo = installmentNo;
	}

	public Date getPlanPayTime() {
		return this.planPayTime;
	}
	public void setPlanPayTime(Date planPayTime) {
		this.planPayTime = planPayTime;
	}

}
