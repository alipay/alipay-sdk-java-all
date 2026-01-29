package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 税务信息
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:18:42
 */
public class TaxInfoDto extends AlipayObject {

	private static final long serialVersionUID = 5489421739459567644L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 生效时间
	 */
	@ApiField("effective_date")
	private Date effectiveDate;

	/**
	 * 发票抬头
	 */
	@ApiField("invoice_title")
	private String invoiceTitle;

	/**
	 * 税务id
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 电话
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 税务号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 纳税人类别
	 */
	@ApiField("type")
	private String type;

	/**
	 * 纳税人类别描述
	 */
	@ApiField("type_desc")
	private String typeDesc;

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

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getTypeDesc() {
		return this.typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

}
