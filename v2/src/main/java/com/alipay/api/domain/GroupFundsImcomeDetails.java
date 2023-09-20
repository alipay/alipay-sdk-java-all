package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 团体资金流入明细
 *
 * @author auto create
 * @since 1.0, 2019-04-12 14:24:20
 */
public class GroupFundsImcomeDetails extends AlipayObject {

	private static final long serialVersionUID = 2771141677157478312L;

	/**
	 * 待付款金额,只支持两位小数点的正数,单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资金分配明细，Map类型，key为收款对象支付宝账户ID，value为分配的金额，两位小数点的正数,单位元
	 */
	@ApiField("fund_distributions")
	private String fundDistributions;

	/**
	 * 付款方支付宝账户ID
	 */
	@ApiField("payer_id")
	private String payerId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFundDistributions() {
		return this.fundDistributions;
	}
	public void setFundDistributions(String fundDistributions) {
		this.fundDistributions = fundDistributions;
	}

	public String getPayerId() {
		return this.payerId;
	}
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

}
