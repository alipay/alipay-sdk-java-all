package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报销发票原件查询
 *
 * @author auto create
 * @since 1.0, 2023-02-20 21:29:15
 */
public class AlipayEbppInvoiceFileOutputQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1469399297999454323L;

	/**
	 * 发票代码
字段长度（10-12位），全电票时为空
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码
字段长度（8-10位），全电票时为20位
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票归属用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 发票pdf文件下载应用场景。固定为 INVOICE_EXPENSE  表示发票报销。
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 是否跳过发票报销状态同步；当为true时，跳过报销状态同步校验。默认为false，需要先做报销状态同步
	 */
	@ApiField("skip_expense_progress_sync")
	private Boolean skipExpenseProgressSync;

	/**
	 * 发票归属用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public Boolean getSkipExpenseProgressSync() {
		return this.skipExpenseProgressSync;
	}
	public void setSkipExpenseProgressSync(Boolean skipExpenseProgressSync) {
		this.skipExpenseProgressSync = skipExpenseProgressSync;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
