package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可开票金额信息
 *
 * @author auto create
 * @since 1.0, 2025-06-16 10:16:11
 */
public class InvoiceAmountInfo extends AlipayObject {

	private static final long serialVersionUID = 5754416949434868759L;

	/**
	 * 应付金额，单位：元
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 小程序云id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 已开票金额，单位：元
	 */
	@ApiField("invoiced_amount")
	private String invoicedAmount;

	/**
	 * 商户id
	 */
	@ApiField("oid")
	private String oid;

	/**
	 * 实付金额，单位：元
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 可开票金额，单位：元
	 */
	@ApiField("uninvoice_amount")
	private String uninvoiceAmount;

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getInvoicedAmount() {
		return this.invoicedAmount;
	}
	public void setInvoicedAmount(String invoicedAmount) {
		this.invoicedAmount = invoicedAmount;
	}

	public String getOid() {
		return this.oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getUninvoiceAmount() {
		return this.uninvoiceAmount;
	}
	public void setUninvoiceAmount(String uninvoiceAmount) {
		this.uninvoiceAmount = uninvoiceAmount;
	}

}
