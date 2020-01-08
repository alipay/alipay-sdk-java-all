package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行余利宝赎回
 *
 * @author auto create
 * @since 1.0, 2016-11-18 16:08:08
 */
public class MybankFinanceYulibaoCapitalRansomModel extends AlipayObject {

	private static final long serialVersionUID = 4873377161865399722L;

	/**
	 * 赎回的金额，以分为单位，必须为正整数。如amount=123456表示赎回1234.56元的余利宝份额。
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 币种，CNY表示人民币，目前只支持人民币
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 基金代码，必填。目前默认填001529，代表余利宝。
	 */
	@ApiField("fund_code")
	private String fundCode;

	/**
	 * 余利宝赎回流水号，用于幂等控制。流水号必须长度在30到40位之间，且仅能由数字、字母、字符“-”和字符“_”组成。建议使用UUID，如“c39c24f1-73e5-497d-9b1f-0f585ae192c1”，或者使用自定义的数字流水号，如“201608150000000000000000000000000001”。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 赎回模式，REALTIME表示实时，NOTREALTIME表示非实时赎回（T+1到账），仅支持这两种模式。实时赎回日累计金额小于等于500万，大于500万则要使用非实时赎回，选择非实时赎回且日累计金额小于等于500万则会自动转为实时。
	 */
	@ApiField("ransom_mode")
	private String ransomMode;

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

	public String getRansomMode() {
		return this.ransomMode;
	}
	public void setRansomMode(String ransomMode) {
		this.ransomMode = ransomMode;
	}

}
