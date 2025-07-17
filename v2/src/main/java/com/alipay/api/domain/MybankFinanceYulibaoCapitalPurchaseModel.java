package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行余利宝签约
 *
 * @author auto create
 * @since 1.0, 2016-11-18 16:08:26
 */
public class MybankFinanceYulibaoCapitalPurchaseModel extends AlipayObject {

	private static final long serialVersionUID = 3114497365346935155L;

	/**
	 * 余利宝申购金额，单位是“分”。如amount=123456表示申购1234.56元的余利宝份额。
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 金额对应的币种，目前仅支持CNY，即人民币。
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 基金代码。余利宝场景固定为 001529。
	 */
	@ApiField("fund_code")
	private String fundCode;

	/**
	 * 余利宝申购流水号，用于幂等控制。流水号必须长度在30到40位之间，且仅能由数字、字母、字符“-”和字符“_”组成。建议使用UUID，如“c39c24f1-73e5-497d-9b1f-0f585ae192c1”，或者使用自定义的数字流水号，如“201608150000000000000000000000000001”。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFundCode() {
		return this.fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
