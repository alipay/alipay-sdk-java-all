package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业（商户）产品配置
 *
 * @author auto create
 * @since 1.0, 2025-09-10 00:28:15
 */
public class CompanyProductConfig extends AlipayObject {

	private static final long serialVersionUID = 8323472968471849497L;

	/**
	 * 字段为Y时，扫码关联的订单在自然人确认后，会邀约自然人成为供应商，前提自然人非当前企业的供应商 字段默认为N
	 */
	@ApiField("invite_suppliers_after_order_confirm")
	private String inviteSuppliersAfterOrderConfirm;

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

	public String getInviteSuppliersAfterOrderConfirm() {
		return this.inviteSuppliersAfterOrderConfirm;
	}
	public void setInviteSuppliersAfterOrderConfirm(String inviteSuppliersAfterOrderConfirm) {
		this.inviteSuppliersAfterOrderConfirm = inviteSuppliersAfterOrderConfirm;
	}

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
