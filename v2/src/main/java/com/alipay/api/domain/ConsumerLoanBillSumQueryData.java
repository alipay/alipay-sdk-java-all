package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款账单聚合返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:22:42
 */
public class ConsumerLoanBillSumQueryData extends AlipayObject {

	private static final long serialVersionUID = 2759282654627867148L;

	/**
	 * 消费贷还款账单聚合信息
	 */
	@ApiField("bill_data")
	private ConsumerLoanBillAggInfo billData;

	/**
	 * 不匹配的用户信息
	 */
	@ApiField("not_match_data")
	private ConsumerLoanNotMatchData notMatchData;

	public ConsumerLoanBillAggInfo getBillData() {
		return this.billData;
	}
	public void setBillData(ConsumerLoanBillAggInfo billData) {
		this.billData = billData;
	}

	public ConsumerLoanNotMatchData getNotMatchData() {
		return this.notMatchData;
	}
	public void setNotMatchData(ConsumerLoanNotMatchData notMatchData) {
		this.notMatchData = notMatchData;
	}

}
