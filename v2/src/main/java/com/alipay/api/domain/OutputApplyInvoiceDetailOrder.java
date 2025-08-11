package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请开票的详情（为支持总分模式开票新增的参数
 *
 * @author auto create
 * @since 1.0, 2024-06-11 19:03:22
 */
public class OutputApplyInvoiceDetailOrder extends AlipayObject {

	private static final long serialVersionUID = 1758281212672934327L;

	/**
	 * 分配多少金额到本组对象
	 */
	@ApiField("target_invoice_amt")
	private MultiCurrencyMoneyOpenApi targetInvoiceAmt;

	/**
	 * 打印到发票上面的备注
	 */
	@ApiField("target_invoice_note")
	private String targetInvoiceNote;

	/**
	 * 目标ipRoleId
	 */
	@ApiField("target_ip_role_id")
	private String targetIpRoleId;

	public MultiCurrencyMoneyOpenApi getTargetInvoiceAmt() {
		return this.targetInvoiceAmt;
	}
	public void setTargetInvoiceAmt(MultiCurrencyMoneyOpenApi targetInvoiceAmt) {
		this.targetInvoiceAmt = targetInvoiceAmt;
	}

	public String getTargetInvoiceNote() {
		return this.targetInvoiceNote;
	}
	public void setTargetInvoiceNote(String targetInvoiceNote) {
		this.targetInvoiceNote = targetInvoiceNote;
	}

	public String getTargetIpRoleId() {
		return this.targetIpRoleId;
	}
	public void setTargetIpRoleId(String targetIpRoleId) {
		this.targetIpRoleId = targetIpRoleId;
	}

}
