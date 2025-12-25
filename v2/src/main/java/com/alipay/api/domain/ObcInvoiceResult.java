package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票明细
 *
 * @author auto create
 * @since 1.0, 2025-06-20 10:12:09
 */
public class ObcInvoiceResult extends AlipayObject {

	private static final long serialVersionUID = 4222914746751852943L;

	/**
	 * 币种code，国内为CNY固定值
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 下载链接
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 发票单id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 发票金额，当币种为CNY时，单位为分
	 */
	@ApiField("invoice_amt")
	private Long invoiceAmt;

	/**
	 * 发票code
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票票面上的开具日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票号码
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 票面的状态
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 是否红票
	 */
	@ApiField("red_flag")
	private Boolean redFlag;

	/**
	 * 已红冲的金额，当币种为CNY时，单位为分
	 */
	@ApiField("redeem_amt")
	private Long redeemAmt;

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Long getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(Long invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

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

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public Boolean getRedFlag() {
		return this.redFlag;
	}
	public void setRedFlag(Boolean redFlag) {
		this.redFlag = redFlag;
	}

	public Long getRedeemAmt() {
		return this.redeemAmt;
	}
	public void setRedeemAmt(Long redeemAmt) {
		this.redeemAmt = redeemAmt;
	}

}
