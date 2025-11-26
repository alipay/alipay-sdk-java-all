package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建总代发货单
 *
 * @author auto create
 * @since 1.0, 2025-08-28 16:21:37
 */
public class FxiaokeCreateInvoiceRequest extends AlipayObject {

	private static final long serialVersionUID = 7511613567618363662L;

	/**
	 * 附件
	 */
	@ApiField("email_attachments")
	private String emailAttachments;

	/**
	 * 首年维保结束时间
	 */
	@ApiField("first_year_warranty_end_date")
	private Date firstYearWarrantyEndDate;

	/**
	 * 首年维保开始时间
	 */
	@ApiField("first_year_warranty_start_date")
	private Date firstYearWarrantyStartDate;

	/**
	 * 对象
	 */
	@ApiListField("fxiao_invoice_detail")
	@ApiField("fxiao_invoice_detail")
	private List<FxiaoInvoiceDetail> fxiaoInvoiceDetail;

	/**
	 * 关联的【总代订单】
	 */
	@ApiField("general_agency_order_no")
	private String generalAgencyOrderNo;

	/**
	 * 负责人工号
	 */
	@ApiField("invoice_owner")
	private String invoiceOwner;

	/**
	 * 自增编号
	 */
	@ApiField("name")
	private String name;

	/**
	 * 关联【报价单】
	 */
	@ApiField("quotation_no")
	private String quotationNo;

	public String getEmailAttachments() {
		return this.emailAttachments;
	}
	public void setEmailAttachments(String emailAttachments) {
		this.emailAttachments = emailAttachments;
	}

	public Date getFirstYearWarrantyEndDate() {
		return this.firstYearWarrantyEndDate;
	}
	public void setFirstYearWarrantyEndDate(Date firstYearWarrantyEndDate) {
		this.firstYearWarrantyEndDate = firstYearWarrantyEndDate;
	}

	public Date getFirstYearWarrantyStartDate() {
		return this.firstYearWarrantyStartDate;
	}
	public void setFirstYearWarrantyStartDate(Date firstYearWarrantyStartDate) {
		this.firstYearWarrantyStartDate = firstYearWarrantyStartDate;
	}

	public List<FxiaoInvoiceDetail> getFxiaoInvoiceDetail() {
		return this.fxiaoInvoiceDetail;
	}
	public void setFxiaoInvoiceDetail(List<FxiaoInvoiceDetail> fxiaoInvoiceDetail) {
		this.fxiaoInvoiceDetail = fxiaoInvoiceDetail;
	}

	public String getGeneralAgencyOrderNo() {
		return this.generalAgencyOrderNo;
	}
	public void setGeneralAgencyOrderNo(String generalAgencyOrderNo) {
		this.generalAgencyOrderNo = generalAgencyOrderNo;
	}

	public String getInvoiceOwner() {
		return this.invoiceOwner;
	}
	public void setInvoiceOwner(String invoiceOwner) {
		this.invoiceOwner = invoiceOwner;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getQuotationNo() {
		return this.quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}

}
