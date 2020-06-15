package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报销发票原件查询
 *
 * @author auto create
 * @since 1.0, 2020-05-27 20:09:41
 */
public class AlipayEbppInvoiceFileOutputQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8211634962614493778L;

	/**
	 * 发票代码
字段长度（10-12位）
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码
字段长度（8-10位）
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票pdf文件下载应用场景
固定值－INVOICE_EXPENSE
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 支付宝用户id
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

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
