package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子发票抬头添加
 *
 * @author auto create
 * @since 1.0, 2020-05-20 15:51:05
 */
public class AlipayEbppInvoiceTitleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6535315865967697492L;

	/**
	 * 开户银行账号
	 */
	@ApiField("open_bank_account")
	private String openBankAccount;

	/**
	 * 开户银行
	 */
	@ApiField("open_bank_name")
	private String openBankName;

	/**
	 * 税号
	 */
	@ApiField("tax_register_no")
	private String taxRegisterNo;

	/**
	 * 抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	/**
	 * 地址
	 */
	@ApiField("user_address")
	private String userAddress;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 电话
	 */
	@ApiField("user_mobile")
	private String userMobile;

	public String getOpenBankAccount() {
		return this.openBankAccount;
	}
	public void setOpenBankAccount(String openBankAccount) {
		this.openBankAccount = openBankAccount;
	}

	public String getOpenBankName() {
		return this.openBankName;
	}
	public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
	}

	public String getTaxRegisterNo() {
		return this.taxRegisterNo;
	}
	public void setTaxRegisterNo(String taxRegisterNo) {
		this.taxRegisterNo = taxRegisterNo;
	}

	public String getTitleName() {
		return this.titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getUserAddress() {
		return this.userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserMobile() {
		return this.userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

}
