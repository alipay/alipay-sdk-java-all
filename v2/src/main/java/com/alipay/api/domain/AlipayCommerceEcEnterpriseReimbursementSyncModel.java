package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业报销信息同步
 *
 * @author auto create
 * @since 1.0, 2025-06-19 17:29:23
 */
public class AlipayCommerceEcEnterpriseReimbursementSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3721982147451819367L;

	/**
	 * 企业码场景中员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业码场景中对应企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 报销发票列表，用于同步报销状态出现变化的发票列表数据
	 */
	@ApiListField("invoice_list")
	@ApiField("reimburse_invoice")
	private List<ReimburseInvoice> invoiceList;

	/**
	 * 报销状态
	 */
	@ApiField("reimburse_status")
	private String reimburseStatus;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public List<ReimburseInvoice> getInvoiceList() {
		return this.invoiceList;
	}
	public void setInvoiceList(List<ReimburseInvoice> invoiceList) {
		this.invoiceList = invoiceList;
	}

	public String getReimburseStatus() {
		return this.reimburseStatus;
	}
	public void setReimburseStatus(String reimburseStatus) {
		this.reimburseStatus = reimburseStatus;
	}

}
