package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供货商盘点单分页查询
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:18:22
 */
public class KoubeiRetailWmsSupplierreportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8645726948825515936L;

	/**
	 * 下单时间上区间
	 */
	@ApiField("end_time")
	private Date endTime;

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
	 * 下单时间下区间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 状态，INT:单据未完成，FINISHED:单据已完成
	 */
	@ApiField("state")
	private String state;

	/**
	 * 供货商盘点单id
	 */
	@ApiField("supplier_report_id")
	private String supplierReportId;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getSupplierReportId() {
		return this.supplierReportId;
	}
	public void setSupplierReportId(String supplierReportId) {
		this.supplierReportId = supplierReportId;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
