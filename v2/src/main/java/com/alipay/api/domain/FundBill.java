package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易支付使用的资金渠道
 *
 * @author auto create
 * @since 1.0, 2019-06-23 10:39:13
 */
public class FundBill extends AlipayObject {

	private static final long serialVersionUID = 5762721874921919939L;

	/**
	 * 该支付工具类型所使用的金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 银行卡支付时的银行代码
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 交易使用的资金渠道，详见 支付渠道列表https://alipay.open.taobao.com/doc2/detail?treeId=26&articleId=103259&docType=1
	 */
	@ApiField("fund_channel")
	private String fundChannel;

	/**
	 * 渠道实际付款金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getFundChannel() {
		return this.fundChannel;
	}
	public void setFundChannel(String fundChannel) {
		this.fundChannel = fundChannel;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

}
