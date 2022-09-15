package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单资金明细，包括本金，逾本，本罚，利息，逾期利息，利罚
 *
 * @author auto create
 * @since 1.0, 2019-04-18 12:22:41
 */
public class BillAmtVo extends AlipayObject {

	private static final long serialVersionUID = 2599882597498279557L;

	/**
	 * 利息
	 */
	@ApiField("int_amt")
	private MultiCurrencyMoneyVO intAmt;

	/**
	 * 逾期利息
	 */
	@ApiField("ovd_int_amt")
	private MultiCurrencyMoneyVO ovdIntAmt;

	/**
	 * 本罚
	 */
	@ApiField("ovd_prin_amt")
	private MultiCurrencyMoneyVO ovdPrinAmt;

	/**
	 * 罚息
	 */
	@ApiField("pen_int_amt")
	private MultiCurrencyMoneyVO penIntAmt;

	/**
	 * 本罚
	 */
	@ApiField("pen_prin_amt")
	private MultiCurrencyMoneyVO penPrinAmt;

	/**
	 * 本金
	 */
	@ApiField("prin_amt")
	private MultiCurrencyMoneyVO prinAmt;

	public MultiCurrencyMoneyVO getIntAmt() {
		return this.intAmt;
	}
	public void setIntAmt(MultiCurrencyMoneyVO intAmt) {
		this.intAmt = intAmt;
	}

	public MultiCurrencyMoneyVO getOvdIntAmt() {
		return this.ovdIntAmt;
	}
	public void setOvdIntAmt(MultiCurrencyMoneyVO ovdIntAmt) {
		this.ovdIntAmt = ovdIntAmt;
	}

	public MultiCurrencyMoneyVO getOvdPrinAmt() {
		return this.ovdPrinAmt;
	}
	public void setOvdPrinAmt(MultiCurrencyMoneyVO ovdPrinAmt) {
		this.ovdPrinAmt = ovdPrinAmt;
	}

	public MultiCurrencyMoneyVO getPenIntAmt() {
		return this.penIntAmt;
	}
	public void setPenIntAmt(MultiCurrencyMoneyVO penIntAmt) {
		this.penIntAmt = penIntAmt;
	}

	public MultiCurrencyMoneyVO getPenPrinAmt() {
		return this.penPrinAmt;
	}
	public void setPenPrinAmt(MultiCurrencyMoneyVO penPrinAmt) {
		this.penPrinAmt = penPrinAmt;
	}

	public MultiCurrencyMoneyVO getPrinAmt() {
		return this.prinAmt;
	}
	public void setPrinAmt(MultiCurrencyMoneyVO prinAmt) {
		this.prinAmt = prinAmt;
	}

}
