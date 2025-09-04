package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票行
 *
 * @author auto create
 * @since 1.0, 2024-11-27 15:32:49
 */
public class SyncInvoiceLineOpenApiOrder extends AlipayObject {

	private static final long serialVersionUID = 6395684281325884876L;

	/**
	 * 含税金额
	 */
	@ApiField("amt")
	private String amt;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 货物名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 税额
	 */
	@ApiField("tax_amt")
	private String taxAmt;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	public String getAmt() {
		return this.amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
