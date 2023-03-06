package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险发票申请
 *
 * @author auto create
 * @since 1.0, 2022-09-23 17:34:28
 */
public class AlipayInsSceneInvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7339137454359712639L;

	/**
	 * 发票寄送类型;ELECTRONIC:电子发票;PAPER:纸质发票；BOTH:电子+纸质
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/**
	 * 发票收件人
	 */
	@ApiField("invoice_addressee")
	private InsAddressee invoiceAddressee;

	/**
	 * 发票申请明细
	 */
	@ApiField("invoice_apply_item")
	private InsInvoiceApplyItem invoiceApplyItem;

	/**
	 * 申请发票开票日期
	 */
	@ApiField("invoice_date")
	private Date invoiceDate;

	/**
	 * 发票抬头;收取发票的公司名称或个人姓名
	 */
	@ApiField("invoice_title")
	private String invoiceTitle;

	/**
	 * 开票类型;1:增值税普通发票（公司） ;2:增值税普通发票（个人） ;3:增值税专用发票.
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 商户业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户生成的发票申请请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public InsAddressee getInvoiceAddressee() {
		return this.invoiceAddressee;
	}
	public void setInvoiceAddressee(InsAddressee invoiceAddressee) {
		this.invoiceAddressee = invoiceAddressee;
	}

	public InsInvoiceApplyItem getInvoiceApplyItem() {
		return this.invoiceApplyItem;
	}
	public void setInvoiceApplyItem(InsInvoiceApplyItem invoiceApplyItem) {
		this.invoiceApplyItem = invoiceApplyItem;
	}

	public Date getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
