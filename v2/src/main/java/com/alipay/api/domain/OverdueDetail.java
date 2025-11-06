package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当前订单逾期时，需要传以下信息
 *
 * @author auto create
 * @since 1.0, 2024-07-05 12:04:51
 */
public class OverdueDetail extends AlipayObject {

	private static final long serialVersionUID = 7376516668455172848L;

	/**
	 * 逾期的天数
	 */
	@ApiField("overdue_day")
	private Long overdueDay;

	/**
	 * 逾期的备注和描述
	 */
	@ApiField("overdue_desc")
	private String overdueDesc;

	/**
	 * 逾期的金额。单位:元，精度:分。
	 */
	@ApiField("overdue_fee")
	private String overdueFee;

	/**
	 * 当前订单逾期的期数
	 */
	@ApiField("overdue_period_num")
	private Long overduePeriodNum;

	/**
	 * 逾期时间
年-月-日 时:分:秒
	 */
	@ApiField("overdue_time")
	private Date overdueTime;

	public Long getOverdueDay() {
		return this.overdueDay;
	}
	public void setOverdueDay(Long overdueDay) {
		this.overdueDay = overdueDay;
	}

	public String getOverdueDesc() {
		return this.overdueDesc;
	}
	public void setOverdueDesc(String overdueDesc) {
		this.overdueDesc = overdueDesc;
	}

	public String getOverdueFee() {
		return this.overdueFee;
	}
	public void setOverdueFee(String overdueFee) {
		this.overdueFee = overdueFee;
	}

	public Long getOverduePeriodNum() {
		return this.overduePeriodNum;
	}
	public void setOverduePeriodNum(Long overduePeriodNum) {
		this.overduePeriodNum = overduePeriodNum;
	}

	public Date getOverdueTime() {
		return this.overdueTime;
	}
	public void setOverdueTime(Date overdueTime) {
		this.overdueTime = overdueTime;
	}

}
