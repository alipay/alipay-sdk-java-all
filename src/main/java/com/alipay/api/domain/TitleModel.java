package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票抬头模型
 *
 * @author auto create
 * @since 1.0, 2019-06-21 17:06:54
 */
public class TitleModel extends AlipayObject {

	private static final long serialVersionUID = 4511575483694991928L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 是否默认
	 */
	@ApiField("by_default")
	private Boolean byDefault;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 手机号
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 银行账户
	 */
	@ApiField("open_bank_account")
	private String openBankAccount;

	/**
	 * 开户行
	 */
	@ApiField("open_bank_name")
	private String openBankName;

	/**
	 * 纳税人识别号
	 */
	@ApiField("tax_register_no")
	private String taxRegisterNo;

	/**
	 * 抬头id
	 */
	@ApiField("title_id")
	private String titleId;

	/**
	 * 抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	/**
	 * 抬头来源
	 */
	@ApiField("title_source")
	private String titleSource;

	/**
	 * 抬头类型
	 */
	@ApiField("title_type")
	private String titleType;

	/**
	 * 用户邮箱
	 */
	@ApiField("user_email")
	private String userEmail;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getByDefault() {
		return this.byDefault;
	}
	public void setByDefault(Boolean byDefault) {
		this.byDefault = byDefault;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
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

	public String getTitleId() {
		return this.titleId;
	}
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public String getTitleName() {
		return this.titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getTitleSource() {
		return this.titleSource;
	}
	public void setTitleSource(String titleSource) {
		this.titleSource = titleSource;
	}

	public String getTitleType() {
		return this.titleType;
	}
	public void setTitleType(String titleType) {
		this.titleType = titleType;
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

}
