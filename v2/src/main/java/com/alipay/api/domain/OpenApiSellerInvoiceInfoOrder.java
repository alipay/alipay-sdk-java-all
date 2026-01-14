package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 销方开票信息OpenApiOrder
 *
 * @author auto create
 * @since 1.0, 2025-11-12 16:35:55
 */
public class OpenApiSellerInvoiceInfoOrder extends AlipayObject {

	private static final long serialVersionUID = 5368539515563881751L;

	/**
	 * 开票人
	 */
	@ApiField("drawer")
	private String drawer;

	/**
	 * OU编码
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 可选, 发票抬头, 为空不填写时，从CIF或MIF取值
	 */
	@ApiField("invoice_title")
	private String invoiceTitle;

	/**
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 公司注册地址
	 */
	@ApiField("registered_address")
	private String registeredAddress;

	/**
	 * 公司注册电话
	 */
	@ApiField("registered_phone_no")
	private String registeredPhoneNo;

	/**
	 * 复核人
	 */
	@ApiField("reviewer")
	private String reviewer;

	/**
	 * 纳税人识别号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 可选, 纳税人类型, 传枚举TaxPayerQualificationEnum的englishName
不传的话默认一般纳税人GENERAL_VAT_TAXPAYER
	 */
	@ApiField("taxpayer_type")
	private String taxpayerType;

	public String getDrawer() {
		return this.drawer;
	}
	public void setDrawer(String drawer) {
		this.drawer = drawer;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getPayee() {
		return this.payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getRegisteredAddress() {
		return this.registeredAddress;
	}
	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	public String getRegisteredPhoneNo() {
		return this.registeredPhoneNo;
	}
	public void setRegisteredPhoneNo(String registeredPhoneNo) {
		this.registeredPhoneNo = registeredPhoneNo;
	}

	public String getReviewer() {
		return this.reviewer;
	}
	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTaxpayerType() {
		return this.taxpayerType;
	}
	public void setTaxpayerType(String taxpayerType) {
		this.taxpayerType = taxpayerType;
	}

}
