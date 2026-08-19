package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票备注与展示控制，包含发票备注及购销双方银行账号、地址电话是否展示
 *
 * @author auto create
 * @since 1.0, 2026-08-14 19:59:20
 */
public class InvoiceRemarkInfo extends AlipayObject {

	private static final long serialVersionUID = 6131652844622274899L;

	/**
	 * 发票备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 是否显示购方地址和电话，Y 显示，N 不显示。
默认为 N
	 */
	@ApiField("show_buyer_address_phone")
	private String showBuyerAddressPhone;

	/**
	 * 是否显示购方银行账号,Y 显示，N 不显示。
默认为 N
	 */
	@ApiField("show_buyer_bank_account")
	private String showBuyerBankAccount;

	/**
	 * 是否显示销方地址和电话。Y 显示，N 不显示。
默认为 N
	 */
	@ApiField("show_seller_address_phone")
	private String showSellerAddressPhone;

	/**
	 * 是否显示销方银行账号，Y 显示，N 不显示。
默认为 N
	 */
	@ApiField("show_seller_bank_account")
	private String showSellerBankAccount;

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getShowBuyerAddressPhone() {
		return this.showBuyerAddressPhone;
	}
	public void setShowBuyerAddressPhone(String showBuyerAddressPhone) {
		this.showBuyerAddressPhone = showBuyerAddressPhone;
	}

	public String getShowBuyerBankAccount() {
		return this.showBuyerBankAccount;
	}
	public void setShowBuyerBankAccount(String showBuyerBankAccount) {
		this.showBuyerBankAccount = showBuyerBankAccount;
	}

	public String getShowSellerAddressPhone() {
		return this.showSellerAddressPhone;
	}
	public void setShowSellerAddressPhone(String showSellerAddressPhone) {
		this.showSellerAddressPhone = showSellerAddressPhone;
	}

	public String getShowSellerBankAccount() {
		return this.showSellerBankAccount;
	}
	public void setShowSellerBankAccount(String showSellerBankAccount) {
		this.showSellerBankAccount = showSellerBankAccount;
	}

}
