package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支用明细
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:44:32
 */
public class BillDetailResult extends AlipayObject {

	private static final long serialVersionUID = 3547615225373744984L;

	/**
	 * 未结清金额
	 */
	@ApiField("balanceamt")
	private AmountWf balanceamt;

	/**
	 * 支用编号
	 */
	@ApiField("billno")
	private String billno;

	/**
	 * 最晚还款日期/到期时间
	 */
	@ApiField("duedate")
	private Long duedate;

	/**
	 * 支用金额
	 */
	@ApiField("encashamt")
	private AmountWf encashamt;

	/**
	 * 支用成功时间
	 */
	@ApiField("startdate")
	private Long startdate;

	/**
	 * NOR：未结清，CLR：已结清OVD：逾期
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

	public Long getDuedate() {
		return this.duedate;
	}
	public void setDuedate(Long duedate) {
		this.duedate = duedate;
	}

	public AmountWf getEncashamt() {
		return this.encashamt;
	}
	public void setEncashamt(AmountWf encashamt) {
		this.encashamt = encashamt;
	}

	public Long getStartdate() {
		return this.startdate;
	}
	public void setStartdate(Long startdate) {
		this.startdate = startdate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
