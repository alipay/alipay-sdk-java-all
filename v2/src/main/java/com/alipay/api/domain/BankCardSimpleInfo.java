package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行卡信息
 *
 * @author auto create
 * @since 1.0, 2026-08-31 10:59:14
 */
public class BankCardSimpleInfo extends AlipayObject {

	private static final long serialVersionUID = 6634229273237297166L;

	/**
	 * 银行卡code
	 */
	@ApiField("bank_card_code")
	private String bankCardCode;

	/**
	 * 银行卡名称
	 */
	@ApiField("bank_card_name")
	private String bankCardName;

	/**
	 * 银行卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	public String getBankCardCode() {
		return this.bankCardCode;
	}
	public void setBankCardCode(String bankCardCode) {
		this.bankCardCode = bankCardCode;
	}

	public String getBankCardName() {
		return this.bankCardName;
	}
	public void setBankCardName(String bankCardName) {
		this.bankCardName = bankCardName;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

}
