package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票批量查询
 *
 * @author auto create
 * @since 1.0, 2026-08-14 20:02:48
 */
public class AlipayTradeSaasInvoiceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2615322366639678375L;

	/**
	 * 创建时间终点
	 */
	@ApiField("gmt_create_end")
	private Date gmtCreateEnd;

	/**
	 * 创建时间起点
	 */
	@ApiField("gmt_create_start")
	private Date gmtCreateStart;

	/**
	 * 发票状态
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * BLUE / RED；不传表示两类结果均可查询
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * null
	 */
	@ApiListField("out_request_no_list")
	@ApiField("string")
	private List<String> outRequestNoList;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小，建议最大 100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询模式
	 */
	@ApiField("query_mode")
	private String queryMode;

	/**
	 * null
	 */
	@ApiListField("saas_invoice_order_no_list")
	@ApiField("string")
	private List<String> saasInvoiceOrderNoList;

	public Date getGmtCreateEnd() {
		return this.gmtCreateEnd;
	}
	public void setGmtCreateEnd(Date gmtCreateEnd) {
		this.gmtCreateEnd = gmtCreateEnd;
	}

	public Date getGmtCreateStart() {
		return this.gmtCreateStart;
	}
	public void setGmtCreateStart(Date gmtCreateStart) {
		this.gmtCreateStart = gmtCreateStart;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public List<String> getOutRequestNoList() {
		return this.outRequestNoList;
	}
	public void setOutRequestNoList(List<String> outRequestNoList) {
		this.outRequestNoList = outRequestNoList;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getQueryMode() {
		return this.queryMode;
	}
	public void setQueryMode(String queryMode) {
		this.queryMode = queryMode;
	}

	public List<String> getSaasInvoiceOrderNoList() {
		return this.saasInvoiceOrderNoList;
	}
	public void setSaasInvoiceOrderNoList(List<String> saasInvoiceOrderNoList) {
		this.saasInvoiceOrderNoList = saasInvoiceOrderNoList;
	}

}
