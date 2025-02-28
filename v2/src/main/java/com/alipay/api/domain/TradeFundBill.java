package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易支付的渠道属性
 *
 * @author auto create
 * @since 1.0, 2023-07-11 20:33:14
 */
public class TradeFundBill extends AlipayObject {

	private static final long serialVersionUID = 5243188258116661718L;

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
	 * 交易使用的资金渠道，详见 <a href="https://doc.open.alipay.com/doc2/detail?treeId=26&articleId=103259&docType=1">支付渠道列表</a>
	 */
	@ApiField("fund_channel")
	private String fundChannel;

	/**
	 * 渠道所使用的资金类型,目前只在资金渠道(fund_channel)是银行卡渠道(BANKCARD)的情况下才返回该信息
	 */
	@ApiField("fund_type")
	private String fundType;

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

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

}
