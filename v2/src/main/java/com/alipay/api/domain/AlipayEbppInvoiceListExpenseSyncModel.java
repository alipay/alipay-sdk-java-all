package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报销状态批量同步开放接口
 *
 * @author auto create
 * @since 1.0, 2023-02-08 18:51:54
 */
public class AlipayEbppInvoiceListExpenseSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1513625152383194349L;

	/**
	 * 报销进度变更时间
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 商户报销单据号
	 */
	@ApiField("expense_order_no")
	private String expenseOrderNo;

	/**
	 * 报销企业税号
	 */
	@ApiField("expense_tax_no")
	private String expenseTaxNo;

	/**
	 * 需要同步报销状态的发票列表
	 */
	@ApiListField("invoice_element_list")
	@ApiField("invoice_element_status_sync_open_model")
	private List<InvoiceElementStatusSyncOpenModel> invoiceElementList;

	/**
	 * 报销审批备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 用户uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * EXPENSE_APPLY:报销申请提交;EXPENSE_APPROVAL_PASS:报销申请审核通过;EXPENSE_FINISHED:报销申请完成;EXPENSE_CANCEL:报销申请撤回
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

	public String getExpenseOrderNo() {
		return this.expenseOrderNo;
	}
	public void setExpenseOrderNo(String expenseOrderNo) {
		this.expenseOrderNo = expenseOrderNo;
	}

	public String getExpenseTaxNo() {
		return this.expenseTaxNo;
	}
	public void setExpenseTaxNo(String expenseTaxNo) {
		this.expenseTaxNo = expenseTaxNo;
	}

	public List<InvoiceElementStatusSyncOpenModel> getInvoiceElementList() {
		return this.invoiceElementList;
	}
	public void setInvoiceElementList(List<InvoiceElementStatusSyncOpenModel> invoiceElementList) {
		this.invoiceElementList = invoiceElementList;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
