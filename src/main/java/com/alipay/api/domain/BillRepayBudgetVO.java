package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算明细
 *
 * @author auto create
 * @since 1.0, 2020-07-01 11:28:13
 */
public class BillRepayBudgetVO extends AlipayObject {

	private static final long serialVersionUID = 2545478631993253774L;

	/**
	 * 申请金额，和入参一致
	 */
	@ApiField("apply_amount")
	private MultiCurrencyMoneyVO applyAmount;

	/**
	 * 账单编号，和入参中的账单编号相同
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 利息总额(含利息和逾期利息)
	 */
	@ApiField("should_repay_int_amt")
	private MultiCurrencyMoneyVO shouldRepayIntAmt;

	/**
	 * 罚息总额(本罚利罚和费罚)
	 */
	@ApiField("should_repay_pen_amt")
	private MultiCurrencyMoneyVO shouldRepayPenAmt;

	/**
	 * 本金总额(含本和逾本)
	 */
	@ApiField("should_repay_prin_amt")
	private MultiCurrencyMoneyVO shouldRepayPrinAmt;

	public MultiCurrencyMoneyVO getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(MultiCurrencyMoneyVO applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public MultiCurrencyMoneyVO getShouldRepayIntAmt() {
		return this.shouldRepayIntAmt;
	}
	public void setShouldRepayIntAmt(MultiCurrencyMoneyVO shouldRepayIntAmt) {
		this.shouldRepayIntAmt = shouldRepayIntAmt;
	}

	public MultiCurrencyMoneyVO getShouldRepayPenAmt() {
		return this.shouldRepayPenAmt;
	}
	public void setShouldRepayPenAmt(MultiCurrencyMoneyVO shouldRepayPenAmt) {
		this.shouldRepayPenAmt = shouldRepayPenAmt;
	}

	public MultiCurrencyMoneyVO getShouldRepayPrinAmt() {
		return this.shouldRepayPrinAmt;
	}
	public void setShouldRepayPrinAmt(MultiCurrencyMoneyVO shouldRepayPrinAmt) {
		this.shouldRepayPrinAmt = shouldRepayPrinAmt;
	}

}
