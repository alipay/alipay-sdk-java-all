package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnterpriseInvoiceInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterprise.invoiceinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-03 20:27:41
 */
public class AlipayEbppInvoiceEnterpriseInvoiceinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1338765639146228443L;

	/** 
	 * 发票列表
	 */
	@ApiListField("invoice_info_list")
	@ApiField("enterprise_invoice_info_d_t_o")
	private List<EnterpriseInvoiceInfoDTO> invoiceInfoList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setInvoiceInfoList(List<EnterpriseInvoiceInfoDTO> invoiceInfoList) {
		this.invoiceInfoList = invoiceInfoList;
	}
	public List<EnterpriseInvoiceInfoDTO> getInvoiceInfoList( ) {
		return this.invoiceInfoList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
