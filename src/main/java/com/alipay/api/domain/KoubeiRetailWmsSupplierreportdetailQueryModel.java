package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供货商通知单详情
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:18:11
 */
public class KoubeiRetailWmsSupplierreportdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2122556137135539978L;

	/**
	 * 供货商盘点单id
	 */
	@ApiField("supplier_report_id")
	private String supplierReportId;

	public String getSupplierReportId() {
		return this.supplierReportId;
	}
	public void setSupplierReportId(String supplierReportId) {
		this.supplierReportId = supplierReportId;
	}

}
