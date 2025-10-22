package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款还款计划查询数据
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:23:56
 */
public class ConsumerLoanRepayPlanQueryData extends AlipayObject {

	private static final long serialVersionUID = 5676923175548435428L;

	/**
	 * 还款计划信息
	 */
	@ApiField("bill_data")
	private ConsumerLoanLoanRepayPlanInfo billData;

	/**
	 * 不匹配的用户信息
	 */
	@ApiField("not_match_data")
	private ConsumerLoanNotMatchData notMatchData;

	public ConsumerLoanLoanRepayPlanInfo getBillData() {
		return this.billData;
	}
	public void setBillData(ConsumerLoanLoanRepayPlanInfo billData) {
		this.billData = billData;
	}

	public ConsumerLoanNotMatchData getNotMatchData() {
		return this.notMatchData;
	}
	public void setNotMatchData(ConsumerLoanNotMatchData notMatchData) {
		this.notMatchData = notMatchData;
	}

}
