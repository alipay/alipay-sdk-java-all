package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无票付款
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:28:55
 */
public class NoInvoicePayOrder extends AlipayObject {

	private static final long serialVersionUID = 5282817131417331768L;

	/**
	 * 账单单据号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * PID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 当前操作人
	 */
	@ApiField("operator")
	private String operator;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
