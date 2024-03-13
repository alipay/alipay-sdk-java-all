package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupplierReport;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.supplierreport.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:29:54
 */
public class KoubeiRetailWmsSupplierreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5443626555871875448L;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 盘点单列表
	 */
	@ApiListField("supplier_report_list")
	@ApiField("supplier_report")
	private List<SupplierReport> supplierReportList;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setSupplierReportList(List<SupplierReport> supplierReportList) {
		this.supplierReportList = supplierReportList;
	}
	public List<SupplierReport> getSupplierReportList( ) {
		return this.supplierReportList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
