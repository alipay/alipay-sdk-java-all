package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供货商盘点单
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:29:58
 */
public class SupplierReport extends AlipayObject {

	private static final long serialVersionUID = 5674455521712188921L;

	/**
	 * 盘点单创建渠道 notify:菜鸟通知,daily:日常调度,manual:手动定制
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 操作者id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作者类型，只会是system
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 盘点单下单日期
	 */
	@ApiField("order_date")
	private Date orderDate;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 盘点单状态  INIT:未完成 FINISHED:已完成
	 */
	@ApiField("state")
	private String state;

	/**
	 * 供货商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 供货商盘点单id
	 */
	@ApiField("supplier_report_id")
	private String supplierReportId;

	/**
	 * 唯一约束
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierReportId() {
		return this.supplierReportId;
	}
	public void setSupplierReportId(String supplierReportId) {
		this.supplierReportId = supplierReportId;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
