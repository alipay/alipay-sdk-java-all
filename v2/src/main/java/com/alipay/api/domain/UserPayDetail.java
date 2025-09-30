package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小二发薪结果详情信息
 *
 * @author auto create
 * @since 1.0, 2025-09-23 15:16:34
 */
public class UserPayDetail extends AlipayObject {

	private static final long serialVersionUID = 7413577525412243328L;

	/**
	 * 发款账号
	 */
	@ApiField("pay_account")
	private String payAccount;

	/**
	 * 发款完成时间
	 */
	@ApiField("pay_finish_time")
	private Date payFinishTime;

	/**
	 * 发款流水号
	 */
	@ApiField("pay_fund_order_id")
	private String payFundOrderId;

	/**
	 * 0：未发薪
1：发薪完成
2：发薪失败
	 */
	@ApiField("salary_status")
	private Long salaryStatus;

	/**
	 * 用户账单编号，全局唯一。计税时候传的user_bill_no字段
	 */
	@ApiField("user_bill_no")
	private String userBillNo;

	public String getPayAccount() {
		return this.payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public Date getPayFinishTime() {
		return this.payFinishTime;
	}
	public void setPayFinishTime(Date payFinishTime) {
		this.payFinishTime = payFinishTime;
	}

	public String getPayFundOrderId() {
		return this.payFundOrderId;
	}
	public void setPayFundOrderId(String payFundOrderId) {
		this.payFundOrderId = payFundOrderId;
	}

	public Long getSalaryStatus() {
		return this.salaryStatus;
	}
	public void setSalaryStatus(Long salaryStatus) {
		this.salaryStatus = salaryStatus;
	}

	public String getUserBillNo() {
		return this.userBillNo;
	}
	public void setUserBillNo(String userBillNo) {
		this.userBillNo = userBillNo;
	}

}
