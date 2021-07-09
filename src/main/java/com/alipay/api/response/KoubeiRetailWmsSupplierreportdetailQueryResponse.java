package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupplierReport;
import com.alipay.api.domain.SupplierReportDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.supplierreportdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsSupplierreportdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2729718215386437678L;

	/** 
	 * 盘点单信息
	 */
	@ApiField("supplier_report")
	private SupplierReport supplierReport;

	/** 
	 * 盘点单明细记录
	 */
	@ApiListField("supplier_report_details")
	@ApiField("supplier_report_detail")
	private List<SupplierReportDetail> supplierReportDetails;

	public void setSupplierReport(SupplierReport supplierReport) {
		this.supplierReport = supplierReport;
	}
	public SupplierReport getSupplierReport( ) {
		return this.supplierReport;
	}

	public void setSupplierReportDetails(List<SupplierReportDetail> supplierReportDetails) {
		this.supplierReportDetails = supplierReportDetails;
	}
	public List<SupplierReportDetail> getSupplierReportDetails( ) {
		return this.supplierReportDetails;
	}

}
