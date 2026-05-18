package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saleforce更新客户接口
 *
 * @author auto create
 * @since 1.0, 2026-04-17 15:27:46
 */
public class AnttechOceanbaseObglobalSfcustomerModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2691684967462323662L;

	/**
	 * 客户BD工号
	 */
	@ApiField("bd")
	private String bd;

	/**
	 * 客户编码
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 行业
	 */
	@ApiField("customer_industry")
	private String customerIndustry;

	/**
	 * 客户常用名
	 */
	@ApiField("customer_short_name")
	private String customerShortName;

	/**
	 * 邓白氏编码
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 客户名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 地域
	 */
	@ApiField("region")
	private String region;

	/**
	 * salesforce客户region
	 */
	@ApiField("salesforce_region")
	private String salesforceRegion;

	public String getBd() {
		return this.bd;
	}
	public void setBd(String bd) {
		this.bd = bd;
	}

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCustomerIndustry() {
		return this.customerIndustry;
	}
	public void setCustomerIndustry(String customerIndustry) {
		this.customerIndustry = customerIndustry;
	}

	public String getCustomerShortName() {
		return this.customerShortName;
	}
	public void setCustomerShortName(String customerShortName) {
		this.customerShortName = customerShortName;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getSalesforceRegion() {
		return this.salesforceRegion;
	}
	public void setSalesforceRegion(String salesforceRegion) {
		this.salesforceRegion = salesforceRegion;
	}

}
