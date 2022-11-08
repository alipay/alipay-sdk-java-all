package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付账单详情视图
 *
 * @author auto create
 * @since 1.0, 2022-01-13 17:15:52
 */
public class CreditPayBillDetailVO extends AlipayObject {

	private static final long serialVersionUID = 5287973217447361929L;

	/**
	 * 出账日
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单期次描述，如9月或，9月第1周
	 */
	@ApiField("bill_term_desc")
	private String billTermDesc;

	/**
	 * 还款日
	 */
	@ApiField("repay_date")
	private String repayDate;

	/**
	 * 还款费用
	 */
	@ApiField("repay_fee_amt")
	private CreditPayMoneyVO repayFeeAmt;

	/**
	 * 还款利息金额
	 */
	@ApiField("repay_int_amt")
	private CreditPayMoneyVO repayIntAmt;

	/**
	 * 还款本金
	 */
	@ApiField("repay_prin_amt")
	private CreditPayMoneyVO repayPrinAmt;

	/**
	 * 总还款金额
	 */
	@ApiField("total_repay_amt")
	private CreditPayMoneyVO totalRepayAmt;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBillTermDesc() {
		return this.billTermDesc;
	}
	public void setBillTermDesc(String billTermDesc) {
		this.billTermDesc = billTermDesc;
	}

	public String getRepayDate() {
		return this.repayDate;
	}
	public void setRepayDate(String repayDate) {
		this.repayDate = repayDate;
	}

	public CreditPayMoneyVO getRepayFeeAmt() {
		return this.repayFeeAmt;
	}
	public void setRepayFeeAmt(CreditPayMoneyVO repayFeeAmt) {
		this.repayFeeAmt = repayFeeAmt;
	}

	public CreditPayMoneyVO getRepayIntAmt() {
		return this.repayIntAmt;
	}
	public void setRepayIntAmt(CreditPayMoneyVO repayIntAmt) {
		this.repayIntAmt = repayIntAmt;
	}

	public CreditPayMoneyVO getRepayPrinAmt() {
		return this.repayPrinAmt;
	}
	public void setRepayPrinAmt(CreditPayMoneyVO repayPrinAmt) {
		this.repayPrinAmt = repayPrinAmt;
	}

	public CreditPayMoneyVO getTotalRepayAmt() {
		return this.totalRepayAmt;
	}
	public void setTotalRepayAmt(CreditPayMoneyVO totalRepayAmt) {
		this.totalRepayAmt = totalRepayAmt;
	}

}
