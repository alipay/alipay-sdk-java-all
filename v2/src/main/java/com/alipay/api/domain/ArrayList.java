package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单明细集合
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:45:24
 */
public class ArrayList extends AlipayObject {

	private static final long serialVersionUID = 7865632726284454541L;

	/**
	 * 未结清金额
	 */
	@ApiField("balanceamt")
	private AmountWf balanceamt;

	/**
	 * 网商支用编号
	 */
	@ApiField("billno")
	private String billno;

	/**
	 * 最晚还款日期/到期时间
	 */
	@ApiField("duedate")
	private Date duedate;

	/**
	 * 支用金额
	 */
	@ApiField("encashamt")
	private AmountWf encashamt;

	/**
	 * 支用成功时间
	 */
	@ApiField("startdate")
	private Date startdate;

	/**
	 * NOR：未结清
CLR：已结清
-：逾期
	 */
	@ApiField("status")
	private String status;

	public AmountWf getBalanceamt() {
		return this.balanceamt;
	}
	public void setBalanceamt(AmountWf balanceamt) {
		this.balanceamt = balanceamt;
	}

	public String getBillno() {
		return this.billno;
	}
	public void setBillno(String billno) {
		this.billno = billno;
	}

	public Date getDuedate() {
		return this.duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public AmountWf getEncashamt() {
		return this.encashamt;
	}
	public void setEncashamt(AmountWf encashamt) {
		this.encashamt = encashamt;
	}

	public Date getStartdate() {
		return this.startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
