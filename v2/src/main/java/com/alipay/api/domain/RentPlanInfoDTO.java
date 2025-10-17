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
 * @since 1.0, 2025-06-10 11:42:10
 */
public class RentPlanInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7366619369737496145L;

	/**
	 * 租金分期计划
	 */
	@ApiListField("installments")
	@ApiField("rent_installment_info")
	private List<RentInstallmentInfo> installments;

	/**
	 * 租期结束时间
	 */
	@ApiField("rent_end_time")
	private Date rentEndTime;

	/**
	 * 租期起始时间
	 */
	@ApiField("rent_start_time")
	private Date rentStartTime;

	public List<RentInstallmentInfo> getInstallments() {
		return this.installments;
	}
	public void setInstallments(List<RentInstallmentInfo> installments) {
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
