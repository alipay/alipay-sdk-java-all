package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用电用户信息
 *
 * @author auto create
 * @since 1.0, 2024-12-19 10:12:06
 */
public class EnergyAggrElectricUserInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5828468283169523178L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 年用电量（KWH）范围
	 */
	@ApiField("annual_electric_consumption_range")
	private String annualElectricConsumptionRange;

	/**
	 * 是否在国网购电
	 */
	@ApiField("buy_electric_from_state_grid")
	private Boolean buyElectricFromStateGrid;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系方式电话
	 */
	@ApiField("contact_num")
	private String contactNum;

	/**
	 * 用电用户号
	 */
	@ApiField("electric_account_id")
	private String electricAccountId;

	/**
	 * 0-独立缴费
1-缴费到公户
2-缴费到物业
	 */
	@ApiField("payment_type")
	private Long paymentType;

	/**
	 * 省份地区
	 */
	@ApiField("province")
	private String province;

	/**
	 * 企业统一社会信用代码
	 */
	@ApiField("social_credit_code")
	private String socialCreditCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAnnualElectricConsumptionRange() {
		return this.annualElectricConsumptionRange;
	}
	public void setAnnualElectricConsumptionRange(String annualElectricConsumptionRange) {
		this.annualElectricConsumptionRange = annualElectricConsumptionRange;
	}

	public Boolean getBuyElectricFromStateGrid() {
		return this.buyElectricFromStateGrid;
	}
	public void setBuyElectricFromStateGrid(Boolean buyElectricFromStateGrid) {
		this.buyElectricFromStateGrid = buyElectricFromStateGrid;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNum() {
		return this.contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public String getElectricAccountId() {
		return this.electricAccountId;
	}
	public void setElectricAccountId(String electricAccountId) {
		this.electricAccountId = electricAccountId;
	}

	public Long getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(Long paymentType) {
		this.paymentType = paymentType;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getSocialCreditCode() {
		return this.socialCreditCode;
	}
	public void setSocialCreditCode(String socialCreditCode) {
		this.socialCreditCode = socialCreditCode;
	}

}
