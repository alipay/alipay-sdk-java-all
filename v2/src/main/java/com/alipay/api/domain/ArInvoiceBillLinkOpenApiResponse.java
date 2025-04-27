package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Ar对账单发票关联明细response
 *
 * @author auto create
 * @since 1.0, 2020-08-28 13:47:05
 */
public class ArInvoiceBillLinkOpenApiResponse extends AlipayObject {

	private static final long serialVersionUID = 1249537492593926928L;

	/**
	 * 开票金额
	 */
	@ApiField("amt")
	private MultiCurrencyMoneyOpenApi amt;

	/**
	 * 应收月账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 创建人
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 创建
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 可开票时间 yyyymm
	 */
	@ApiField("inv_rcpt_month")
	private String invRcptMonth;

	/**
	 * 发票ID
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票单据ID
	 */
	@ApiField("invoice_receipt_id")
	private String invoiceReceiptId;

	/**
	 * 修改人
	 */
	@ApiField("last_moder")
	private String lastModer;

	/**
	 * 关联明细号
	 */
	@ApiField("link_id")
	private String linkId;

	/**
	 * 01主站，02芝麻，03金融云
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 已撤回金额
	 */
	@ApiField("ret_amt")
	private MultiCurrencyMoneyOpenApi retAmt;

	/**
	 * 关联明细状态 
Y：有效，N：无效
	 */
	@ApiField("status")
	private String status;

	/**
	 * 租户机构id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public MultiCurrencyMoneyOpenApi getAmt() {
		return this.amt;
	}
	public void setAmt(MultiCurrencyMoneyOpenApi amt) {
		this.amt = amt;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getInvRcptMonth() {
		return this.invRcptMonth;
	}
	public void setInvRcptMonth(String invRcptMonth) {
		this.invRcptMonth = invRcptMonth;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceReceiptId() {
		return this.invoiceReceiptId;
	}
	public void setInvoiceReceiptId(String invoiceReceiptId) {
		this.invoiceReceiptId = invoiceReceiptId;
	}

	public String getLastModer() {
		return this.lastModer;
	}
	public void setLastModer(String lastModer) {
		this.lastModer = lastModer;
	}

	public String getLinkId() {
		return this.linkId;
	}
	public void setLinkId(String linkId) {
		this.linkId = linkId;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public MultiCurrencyMoneyOpenApi getRetAmt() {
		return this.retAmt;
	}
	public void setRetAmt(MultiCurrencyMoneyOpenApi retAmt) {
		this.retAmt = retAmt;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
