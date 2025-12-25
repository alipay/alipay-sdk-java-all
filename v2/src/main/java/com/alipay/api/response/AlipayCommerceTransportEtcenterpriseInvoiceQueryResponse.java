package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EtcCorpInvoiceTrade;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.invoice.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 14:07:41
 */
public class AlipayCommerceTransportEtcenterpriseInvoiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7197757753856729846L;

	/** 
	 * 是否有下一页
true:有
false:无
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 可开发票运单列表
	 */
	@ApiListField("invoice_waybill")
	@ApiField("etc_corp_invoice_trade")
	private List<EtcCorpInvoiceTrade> invoiceWaybill;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 总条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setInvoiceWaybill(List<EtcCorpInvoiceTrade> invoiceWaybill) {
		this.invoiceWaybill = invoiceWaybill;
	}
	public List<EtcCorpInvoiceTrade> getInvoiceWaybill( ) {
		return this.invoiceWaybill;
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

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
