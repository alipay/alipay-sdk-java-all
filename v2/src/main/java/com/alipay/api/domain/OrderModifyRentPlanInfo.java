package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁计划信息
 *
 * @author auto create
 * @since 1.0, 2025-08-05 22:04:54
 */
public class OrderModifyRentPlanInfo extends AlipayObject {

	private static final long serialVersionUID = 8448954882351258994L;

	/**
	 * 租金分期计划
	 */
	@ApiListField("installments")
	@ApiField("order_modify_rent_installment")
	private List<OrderModifyRentInstallment> installments;

	/**
	 * 租赁结束时间
	 */
	@ApiField("rent_end_time")
	private Date rentEndTime;

	/**
	 * 租期开始时间
	 */
	@ApiField("rent_start_time")
	private Date rentStartTime;

	public List<OrderModifyRentInstallment> getInstallments() {
		return this.installments;
	}
	public void setInstallments(List<OrderModifyRentInstallment> installments) {
		this.installments = installments;
	}

	public Date getRentEndTime() {
		return this.rentEndTime;
	}
	public void setRentEndTime(Date rentEndTime) {
		this.rentEndTime = rentEndTime;
	}

	public Date getRentStartTime() {
		return this.rentStartTime;
	}
	public void setRentStartTime(Date rentStartTime) {
		this.rentStartTime = rentStartTime;
	}

}
