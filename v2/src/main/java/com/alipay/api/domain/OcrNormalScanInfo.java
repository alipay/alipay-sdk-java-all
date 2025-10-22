package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 增值税发票、定额发票、卷式发票、过路费扫描模型
 *
 * @author auto create
 * @since 1.0, 2024-03-13 14:08:36
 */
public class OcrNormalScanInfo extends AlipayObject {

	private static final long serialVersionUID = 6535468462719748834L;

	/**
	 * 发票代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票时间
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 金额（元）
	 */
	@ApiField("price")
	private String price;

	/**
	 * 明细事由
	 */
	@ApiField("remark")
	private String remark;

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
