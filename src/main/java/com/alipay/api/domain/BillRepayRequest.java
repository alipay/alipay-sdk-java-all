package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单还款明细
 *
 * @author auto create
 * @since 1.0, 2019-04-25 12:53:01
 */
public class BillRepayRequest extends AlipayObject {

	private static final long serialVersionUID = 8268469547528326386L;

	/**
	 * 还款金额
	 */
	@ApiField("repay_amt")
	private MultiCurrencyMoneyVO repayAmt;

	public MultiCurrencyMoneyVO getRepayAmt() {
		return this.repayAmt;
	}
	public void setRepayAmt(MultiCurrencyMoneyVO repayAmt) {
		this.repayAmt = repayAmt;
	}

}
