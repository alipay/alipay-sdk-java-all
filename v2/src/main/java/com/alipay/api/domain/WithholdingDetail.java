package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣详情信息
 *
 * @author auto create
 * @since 1.0, 2026-01-26 17:52:42
 */
public class WithholdingDetail extends AlipayObject {

	private static final long serialVersionUID = 2457226387765367771L;

	/**
	 * 应扣时间
	 */
	@ApiField("due_time")
	private String dueTime;

	/**
	 * 扣款金额比较大时，一个周期多分多次扣款，通过这个字段告诉是否最好一次，默认值Y；取值Y/N
	 */
	@ApiField("last_payment_period")
	private String lastPaymentPeriod;

	/**
	 * 代扣是第几期
	 */
	@ApiField("period_number")
	private Long periodNumber;

	/**
	 * 代扣金额,单位元，保留两位小数
	 */
	@ApiField("withholding_amount")
	private String withholdingAmount;

	public String getDueTime() {
		return this.dueTime;
	}
	public void setDueTime(String dueTime) {
		this.dueTime = dueTime;
	}

	public String getLastPaymentPeriod() {
		return this.lastPaymentPeriod;
	}
	public void setLastPaymentPeriod(String lastPaymentPeriod) {
		this.lastPaymentPeriod = lastPaymentPeriod;
	}

	public Long getPeriodNumber() {
		return this.periodNumber;
	}
	public void setPeriodNumber(Long periodNumber) {
		this.periodNumber = periodNumber;
	}

	public String getWithholdingAmount() {
		return this.withholdingAmount;
	}
	public void setWithholdingAmount(String withholdingAmount) {
		this.withholdingAmount = withholdingAmount;
	}

}
