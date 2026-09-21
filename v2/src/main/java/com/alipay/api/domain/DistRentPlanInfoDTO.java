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
 * @since 1.0, 2026-09-11 23:27:50
 */
public class DistRentPlanInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4163468824462348223L;

	/**
	 * null
	 */
	@ApiListField("installments")
	@ApiField("distribution_rent_installment_info_d_t_o")
	private List<DistributionRentInstallmentInfoDTO> installments;

	/**
	 * 租赁天数
	 */
	@ApiField("rent_days")
	private Long rentDays;

	/**
	 * 租赁结束时间
	 */
	@ApiField("rent_end_time")
	private Date rentEndTime;

	/**
	 * 租赁开始时间
	 */
	@ApiField("rent_start_time")
	private Date rentStartTime;

	/**
	 * 长短租类型
	 */
	@ApiField("term_type")
	private String termType;

	public List<DistributionRentInstallmentInfoDTO> getInstallments() {
		return this.installments;
	}
	public void setInstallments(List<DistributionRentInstallmentInfoDTO> installments) {
		this.installments = installments;
	}

	public Long getRentDays() {
		return this.rentDays;
	}
	public void setRentDays(Long rentDays) {
		this.rentDays = rentDays;
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

	public String getTermType() {
		return this.termType;
	}
	public void setTermType(String termType) {
		this.termType = termType;
	}

}
