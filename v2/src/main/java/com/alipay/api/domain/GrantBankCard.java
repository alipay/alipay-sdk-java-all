package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 放款银行卡模型
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:08
 */
public class GrantBankCard extends AlipayObject {

	private static final long serialVersionUID = 2544251641666563127L;

	/**
	 * 支付宝绑卡唯一ID
	 */
	@ApiField("bank_card_id")
	private String bankCardId;

	/**
	 * 支付宝侧存储的银行编码，可能跟外域编码规则不一致
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 展示的银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 展示用户的银行卡号后四位
	 */
	@ApiField("show_card_no")
	private String showCardNo;

	public String getBankCardId() {
		return this.bankCardId;
	}
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getShowCardNo() {
		return this.showCardNo;
	}
	public void setShowCardNo(String showCardNo) {
		this.showCardNo = showCardNo;
	}

}
