package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业（商户）产品配置
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:37:57
 */
public class CompanyProductConfig extends AlipayObject {

	private static final long serialVersionUID = 4387978796656342611L;

	/**
	 * 票种
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 启用订单审核
	 */
	@ApiField("order_audit")
	private String orderAudit;

	/**
	 * 计税方式
	 */
	@ApiField("tax_method")
	private String taxMethod;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getOrderAudit() {
		return this.orderAudit;
	}
	public void setOrderAudit(String orderAudit) {
		this.orderAudit = orderAudit;
	}

	public String getTaxMethod() {
		return this.taxMethod;
	}
	public void setTaxMethod(String taxMethod) {
		this.taxMethod = taxMethod;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
