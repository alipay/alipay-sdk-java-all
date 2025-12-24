package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * OU税务信息
 *
 * @author auto create
 * @since 1.0, 2024-02-26 14:14:51
 */
public class OrgTaxInfoOpenApiDto extends AlipayObject {

	private static final long serialVersionUID = 7166896595742959566L;

	/**
	 * 银行账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 注册地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 开户行
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 生效日期
	 */
	@ApiField("effect_date")
	private Date effectDate;

	/**
	 * 是否电子抵账
	 */
	@ApiField("has_elec_account")
	private Boolean hasElecAccount;

	/**
	 * 是否支持网上认证
	 */
	@ApiField("is_online_verify")
	private Boolean isOnlineVerify;

	/**
	 * 是否支持发票扫描
	 */
	@ApiField("is_scan")
	private Boolean isScan;

	/**
	 * 组织code
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 组织id
	 */
	@ApiField("org_id")
	private Long orgId;

	/**
	 * 电话
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 税率
	 */
	@ApiListField("rates")
	@ApiField("string")
	private List<String> rates;

	/**
	 * 税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 抬头
	 */
	@ApiField("title")
	private String title;

	/**
	 * 纳税人类型
	 */
	@ApiField("type")
	private String type;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Date getEffectDate() {
		return this.effectDate;
	}
	public void setEffectDate(Date effectDate) {
		this.effectDate = effectDate;
	}

	public Boolean getHasElecAccount() {
		return this.hasElecAccount;
	}
	public void setHasElecAccount(Boolean hasElecAccount) {
		this.hasElecAccount = hasElecAccount;
	}

	public Boolean getIsOnlineVerify() {
		return this.isOnlineVerify;
	}
	public void setIsOnlineVerify(Boolean isOnlineVerify) {
		this.isOnlineVerify = isOnlineVerify;
	}

	public Boolean getIsScan() {
		return this.isScan;
	}
	public void setIsScan(Boolean isScan) {
		this.isScan = isScan;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public Long getOrgId() {
		return this.orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<String> getRates() {
		return this.rates;
	}
	public void setRates(List<String> rates) {
		this.rates = rates;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
