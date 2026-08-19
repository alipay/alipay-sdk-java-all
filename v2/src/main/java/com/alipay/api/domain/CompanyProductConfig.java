package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业（商户）产品配置
 *
 * @author auto create
 * @since 1.0, 2026-07-31 15:27:01
 */
public class CompanyProductConfig extends AlipayObject {

	private static final long serialVersionUID = 1746444933172961167L;

	/**
	 * 银行卡收款月度额度（最近两个月）
	 */
	@ApiListField("bank_quota_list")
	@ApiField("bank_quota_result")
	private List<BankQuotaResult> bankQuotaList;

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
	 * 是否允许自然人收款到银行卡
	 */
	@ApiField("natural_person_bankcard_receive_status")
	private String naturalPersonBankcardReceiveStatus;

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

	public List<BankQuotaResult> getBankQuotaList() {
		return this.bankQuotaList;
	}
	public void setBankQuotaList(List<BankQuotaResult> bankQuotaList) {
		this.bankQuotaList = bankQuotaList;
	}

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

	public String getNaturalPersonBankcardReceiveStatus() {
		return this.naturalPersonBankcardReceiveStatus;
	}
	public void setNaturalPersonBankcardReceiveStatus(String naturalPersonBankcardReceiveStatus) {
		this.naturalPersonBankcardReceiveStatus = naturalPersonBankcardReceiveStatus;
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
