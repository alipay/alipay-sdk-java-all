package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenInvoiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.tcn.invoice.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 11:33:21
 */
public class AlipayCommerceEcTcnInvoiceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5689415167169628693L;

	/** 
	 * 发票信息列表
	 */
	@ApiListField("invoice_info_list")
	@ApiField("open_invoice_info")
	private List<OpenInvoiceInfo> invoiceInfoList;

	/** 
	 * 页号
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 数据总数
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setInvoiceInfoList(List<OpenInvoiceInfo> invoiceInfoList) {
		this.invoiceInfoList = invoiceInfoList;
	}
	public List<OpenInvoiceInfo> getInvoiceInfoList( ) {
		return this.invoiceInfoList;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
