package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 最新发票作废
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:26:14
 */
public class AlipayBossFncGfsettleprodInvoiceCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1766543956174692999L;

	/**
	 * 发票ID
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * INVALID-发票作废
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 结算PID
	 */
	@ApiField("settle_ip_role_id")
	private String settleIpRoleId;

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getSettleIpRoleId() {
		return this.settleIpRoleId;
	}
	public void setSettleIpRoleId(String settleIpRoleId) {
		this.settleIpRoleId = settleIpRoleId;
	}

}
