package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期计划明细
 *
 * @author auto create
 * @since 1.0, 2026-08-26 12:37:37
 */
public class DistributionRentInstallmentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1679192316754864336L;

	/**
	 * 期号
	 */
	@ApiField("installment_no")
	private Long installmentNo;

	/**
	 * 租金,单位元
	 */
	@ApiField("installment_price")
	private String installmentPrice;

	/**
	 * 计划扣款时间
	 */
	@ApiField("plan_pay_time")
	private Date planPayTime;

	public Long getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(Long installmentNo) {
		this.installmentNo = installmentNo;
	}

	public String getInstallmentPrice() {
		return this.installmentPrice;
	}
	public void setInstallmentPrice(String installmentPrice) {
		this.installmentPrice = installmentPrice;
	}

	public Date getPlanPayTime() {
		return this.planPayTime;
	}
	public void setPlanPayTime(Date planPayTime) {
		this.planPayTime = planPayTime;
	}

}
