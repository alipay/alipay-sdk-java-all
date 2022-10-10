package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票抬头开放模型
 *
 * @author auto create
 * @since 1.0, 2020-12-23 21:51:00
 */
public class InvoiceTitleOpenModel extends AlipayObject {

	private static final long serialVersionUID = 3143675223258265572L;

	/**
	 * 票面上的购买方地址、电话
	 */
	@ApiField("payer_address_tel")
	private String payerAddressTel;

	/**
	 * 票面上的购买方开户行及账户
	 */
	@ApiField("payer_bank_name_account")
	private String payerBankNameAccount;

	/**
	 * 票面上的购买方纳税人识别号
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/**
	 * 票面上的购买方名称
	 */
	@ApiField("title_name")
	private String titleName;

	public String getPayerAddressTel() {
		return this.payerAddressTel;
	}
	public void setPayerAddressTel(String payerAddressTel) {
		this.payerAddressTel = payerAddressTel;
	}

	public String getPayerBankNameAccount() {
		return this.payerBankNameAccount;
	}
	public void setPayerBankNameAccount(String payerBankNameAccount) {
		this.payerBankNameAccount = payerBankNameAccount;
	}

	public String getPayerRegisterNo() {
		return this.payerRegisterNo;
	}
	public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}

	public String getTitleName() {
		return this.titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

}
