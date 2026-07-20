package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租金分期信息
 *
 * @author auto create
 * @since 1.0, 2026-06-17 14:56:51
 */
public class RentInstallmentInfo extends AlipayObject {

	private static final long serialVersionUID = 2858785432151853637L;

	/**
	 * 残值：指租赁期满后，租赁物的预估剩余价值。平台以这个价格 对买断，赔偿等行为进行巡检。
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
