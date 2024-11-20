package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单的分期计划
 *
 * @author auto create
 * @since 1.0, 2024-11-11 16:58:03
 */
public class RentPlan extends AlipayObject {

	private static final long serialVersionUID = 6211696691671669235L;

	/**
	 * 实际还款时间
	 */
	@ApiField("actual_pay_time")
	private String actualPayTime;

	/**
	 * 本期买断金金额，单位：元，精确到小数点后两位
	 */
	@ApiField("buyout_price")
	private String buyoutPrice;

	/**
	 * 预期还款时间
	 */
	@ApiField("expect_pay_time")
	private String expectPayTime;

	/**
	 * 每一期的扣款分期单号
	 */
	@ApiField("installment_id")
	private String installmentId;

	/**
	 * 代表某一个阶段的第几期的还款计划，要结合stage进行锁定某一期计划
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 分期计划的状态
	 */
	@ApiField("plan_status")
	private String planStatus;

	/**
	 * 分期还款金额，单位：元，精确到小数点后两位
	 */
	@ApiField("rent_price")
	private String rentPrice;

	/**
	 * 代表第几阶段的还款计划，要配合period锁定第几期还款计划
	 */
	@ApiField("stage")
	private Long stage;

	public String getActualPayTime() {
		return this.actualPayTime;
	}
	public void setActualPayTime(String actualPayTime) {
		this.actualPayTime = actualPayTime;
	}

	public String getBuyoutPrice() {
		return this.buyoutPrice;
	}
	public void setBuyoutPrice(String buyoutPrice) {
		this.buyoutPrice = buyoutPrice;
	}

	public String getExpectPayTime() {
		return this.expectPayTime;
	}
	public void setExpectPayTime(String expectPayTime) {
		this.expectPayTime = expectPayTime;
	}

	public String getInstallmentId() {
		return this.installmentId;
	}
	public void setInstallmentId(String installmentId) {
		this.installmentId = installmentId;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public String getPlanStatus() {
		return this.planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public String getRentPrice() {
		return this.rentPrice;
	}
	public void setRentPrice(String rentPrice) {
		this.rentPrice = rentPrice;
	}

	public Long getStage() {
		return this.stage;
	}
	public void setStage(Long stage) {
		this.stage = stage;
	}

}
