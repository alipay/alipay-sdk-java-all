package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抬头信息
 *
 * @author auto create
 * @since 1.0, 2020-12-23 21:57:03
 */
public class InvoiceTitleModel extends AlipayObject {

	private static final long serialVersionUID = 6858974316793724368L;

	/**
	 * 是否为用户设置默认抬头
字段值包括两种情况：
false（非默认）
true（默认抬头）
	 */
	@ApiField("is_default")
	private Boolean isDefault;

	/**
	 * 支付宝用户登录名
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 银行账号
	 */
	@ApiField("open_bank_account")
	private String openBankAccount;

	/**
	 * 开户银行
	 */
	@ApiField("open_bank_name")
	private String openBankName;

	/**
	 * 纳税人识别号
	 */
	@ApiField("tax_register_no")
	private String taxRegisterNo;

	/**
	 * 用户私人手机号
	 */
	@ApiField("tele_phone_no")
	private String telePhoneNo;

	/**
	 * 抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	/**
	 * 抬头类型
字段值有两种情况抬:
PERSONAL（个人） 
CORPORATION（单位）
	 */
	@ApiField("title_type")
	private String titleType;

	/**
	 * 地址
	 */
	@ApiField("user_address")
	private String userAddress;

	/**
	 * 邮箱
	 */
	@ApiField("user_email")
	private String userEmail;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 电话号码
	 */
	@ApiField("user_mobile")
	private String userMobile;

	public Boolean getIsDefault() {
		return this.isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

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

	public String getTelePhoneNo() {
		return this.telePhoneNo;
	}
	public void setTelePhoneNo(String telePhoneNo) {
		this.telePhoneNo = telePhoneNo;
	}

	public String getTitleName() {
		return this.titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getTitleType() {
		return this.titleType;
	}
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public String getUserAddress() {
		return this.userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserEmail() {
		return this.userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
