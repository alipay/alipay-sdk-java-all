package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款结果回调明细
 *
 * @author auto create
 * @since 1.0, 2026-07-20 16:32:51
 */
public class RepaymentCallbackBizDetail extends AlipayObject {

	private static final long serialVersionUID = 6216127212959278347L;

	/**
	 * 单期履约结果
	 */
	@ApiField("repayment_results")
	private String repaymentResults;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getRepaymentResults() {
		return this.repaymentResults;
	}
	public void setRepaymentResults(String repaymentResults) {
		this.repaymentResults = repaymentResults;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
