package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租金分期信息
 *
 * @author auto create
 * @since 1.0, 2025-07-16 19:25:02
 */
public class RentInstallmentInfo extends AlipayObject {

	private static final long serialVersionUID = 2377526787225155412L;

	/**
	 * 当期购买金额。当期购买金=当期购买价-截止到当期已支付租金
	 */
	@ApiField("buyout_price")
	private String buyoutPrice;

	/**
	 * 租期。标识第几期，起始值为1，需保证编号递增
	 */
	@ApiField("installment_no")
	private Long installmentNo;

	/**
	 * 租金，单位：元,精确到小数点后两位
	 */
	@ApiField("installment_price")
	private String installmentPrice;

	/**
	 * 计划扣款时间，表示从该日期起可以发起当前租金扣款，多期需保证付款时间递增。
	 */
	@ApiField("plan_pay_time")
	private Date planPayTime;

	public String getBuyoutPrice() {
		return this.buyoutPrice;
	}
	public void setBuyoutPrice(String buyoutPrice) {
		this.buyoutPrice = buyoutPrice;
	}

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
