package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票报销处理进度同步
 *
 * @author auto create
 * @since 1.0, 2024-05-30 19:19:17
 */
public class AlipayEbppInvoiceExpenseProgressSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7425156612152881587L;

	/**
	 * 同步申请id，每次发起同步时生成，isv每次请求需要保证唯一
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 报销状态变更执行时间
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 报销详情地址，提供用户通过发票管家查看报销进度的地址
如果报销企业入驻发票管家时需要isv传入报销详情地址，则必须提供
	 */
	@ApiField("expense_detail_url")
	private String expenseDetailUrl;

	/**
	 * 报销单据号
	 */
	@ApiField("expense_order_no")
	private String expenseOrderNo;

	/**
	 * 报销企业税号
	 */
	@ApiField("expense_tax_no")
	private String expenseTaxNo;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * open_id，支付宝用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 报销操作
	 */
	@ApiField("status")
	private String status;

	/**
	 * 发票归属用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
	 */
	@ApiField("user_id")
	private String userId;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

	public String getExpenseDetailUrl() {
		return this.expenseDetailUrl;
	}
	public void setExpenseDetailUrl(String expenseDetailUrl) {
		this.expenseDetailUrl = expenseDetailUrl;
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

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
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
