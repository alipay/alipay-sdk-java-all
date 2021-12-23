package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单信息列表
 *
 * @author auto create
 * @since 1.0, 2019-04-25 12:52:45
 */
public class BillDetailVo extends AlipayObject {

	private static final long serialVersionUID = 8847895238757243596L;

	/**
	 * 账单出账时间
	 */
	@ApiField("bill_account_date")
	private Date billAccountDate;

	/**
	 * 账单余额明细
	 */
	@ApiField("bill_balance_detail")
	private BillAmtVo billBalanceDetail;

	/**
	 * 账单创建时间
	 */
	@ApiField("bill_create_date")
	private Date billCreateDate;

	/**
	 * 账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单已还明细
	 */
	@ApiField("bill_repay_detail")
	private BillAmtVo billRepayDetail;

	/**
	 * 账单状态，NOR正常，OVD逾期，CLE结清
	 */
	@ApiField("bill_status")
	private String billStatus;

	/**
	 * 账单结清时间
	 */
	@ApiField("clear_date")
	private Date clearDate;

	/**
	 * 账单还款日
	 */
	@ApiField("repay_date")
	private Date repayDate;

	/**
	 * 账单本金总额
	 */
	@ApiField("total_prin_amt")
	private MultiCurrencyMoneyVO totalPrinAmt;

	public Date getBillAccountDate() {
		return this.billAccountDate;
	}
	public void setBillAccountDate(Date billAccountDate) {
		this.billAccountDate = billAccountDate;
	}

	public BillAmtVo getBillBalanceDetail() {
		return this.billBalanceDetail;
	}
	public void setBillBalanceDetail(BillAmtVo billBalanceDetail) {
		this.billBalanceDetail = billBalanceDetail;
	}

	public Date getBillCreateDate() {
		return this.billCreateDate;
	}
	public void setBillCreateDate(Date billCreateDate) {
		this.billCreateDate = billCreateDate;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public BillAmtVo getBillRepayDetail() {
		return this.billRepayDetail;
	}
	public void setBillRepayDetail(BillAmtVo billRepayDetail) {
		this.billRepayDetail = billRepayDetail;
	}

	public String getBillStatus() {
		return this.billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public Date getClearDate() {
		return this.clearDate;
	}
	public void setClearDate(Date clearDate) {
		this.clearDate = clearDate;
	}

	public Date getRepayDate() {
		return this.repayDate;
	}
	public void setRepayDate(Date repayDate) {
		this.repayDate = repayDate;
	}

	public MultiCurrencyMoneyVO getTotalPrinAmt() {
		return this.totalPrinAmt;
	}
	public void setTotalPrinAmt(MultiCurrencyMoneyVO totalPrinAmt) {
		this.totalPrinAmt = totalPrinAmt;
	}

}
