package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款借据列表查询结果
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:22:51
 */
public class ConsumerLoanLoanListQueryData extends AlipayObject {

	private static final long serialVersionUID = 6416854342846195181L;

	/**
	 * 消费贷还款借据信息
	 */
	@ApiField("bill_data")
	private ConsumerLoanLoanInfo billData;

	/**
	 * 不匹配的用户信息
	 */
	@ApiField("not_match_data")
	private ConsumerLoanNotMatchData notMatchData;

	public ConsumerLoanLoanInfo getBillData() {
		return this.billData;
	}
	public void setBillData(ConsumerLoanLoanInfo billData) {
		this.billData = billData;
	}

	public ConsumerLoanNotMatchData getNotMatchData() {
		return this.notMatchData;
	}
	public void setNotMatchData(ConsumerLoanNotMatchData notMatchData) {
		this.notMatchData = notMatchData;
	}

}
