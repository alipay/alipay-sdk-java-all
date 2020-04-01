package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 按天定价视图
 *
 * @author auto create
 * @since 1.0, 2019-07-12 14:25:43
 */
public class CreditPayDayRangePricingVO extends AlipayObject {

	private static final long serialVersionUID = 4631916158244262227L;

	/**
	 * 按天定价结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 分段利率（小数形式，自行*100%转换为百分数形式）
	 */
	@ApiField("int_rate")
	private String intRate;

	/**
	 * 分段利息，单位元
	 */
	@ApiField("interest")
	private String interest;

	/**
	 * 按天定价开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getIntRate() {
		return this.intRate;
	}
	public void setIntRate(String intRate) {
		this.intRate = intRate;
	}

	public String getInterest() {
		return this.interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
