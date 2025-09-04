package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款借据账单列表查询返回结果
 *
 * @author auto create
 * @since 1.0, 2025-04-21 15:15:49
 */
public class ConsumerLoanBillListQueryData extends AlipayObject {

	private static final long serialVersionUID = 3549616114511968614L;

	/**
	 * 账单信息
	 */
	@ApiField("bill_data")
	private ConsumerLoanBillInfo billData;

	/**
	 * 不匹配的用户信息
	 */
	@ApiField("not_match_data")
	private ConsumerLoanNotMatchData notMatchData;

	public ConsumerLoanBillInfo getBillData() {
		return this.billData;
	}
	public void setBillData(ConsumerLoanBillInfo billData) {
		this.billData = billData;
	}

	public ConsumerLoanNotMatchData getNotMatchData() {
		return this.notMatchData;
	}
	public void setNotMatchData(ConsumerLoanNotMatchData notMatchData) {
		this.notMatchData = notMatchData;
	}

}
