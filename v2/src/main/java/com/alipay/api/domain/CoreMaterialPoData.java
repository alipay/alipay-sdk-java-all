package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核心原材料PO信息
 *
 * @author auto create
 * @since 1.0, 2026-04-21 15:19:31
 */
public class CoreMaterialPoData extends AlipayObject {

	private static final long serialVersionUID = 2189147771173531433L;

	/**
	 * 已到货数量，单位是个
	 */
	@ApiField("delivered_count")
	private Long deliveredCount;

	/**
	 * 原材料ID
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 原材料名称
	 */
	@ApiField("material_name")
	private String materialName;

	/**
	 * 备注，由供应商自定义
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 下单时间
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 关联外部PO号
	 */
	@ApiField("out_po_no")
	private String outPoNo;

	/**
	 * 外部供应商ID
	 */
	@ApiField("out_supplier_id")
	private String outSupplierId;

	/**
	 * 外部供应商名称
	 */
	@ApiField("out_supplier_name")
	private String outSupplierName;

	/**
	 * PO状态（新增时必填）：CONFIRMED-已确认/SHIPPED-已发货/RECEIVED-已收货/CANCELLED-已取消
	 */
	@ApiField("po_status")
	private String poStatus;

	/**
	 * PO总数量
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 在途数量，单位是个
	 */
	@ApiField("transferring_count")
	private Long transferringCount;

	public Long getDeliveredCount() {
		return this.deliveredCount;
	}
	public void setDeliveredCount(Long deliveredCount) {
		this.deliveredCount = deliveredCount;
	}

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return this.materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOutPoNo() {
		return this.outPoNo;
	}
	public void setOutPoNo(String outPoNo) {
		this.outPoNo = outPoNo;
	}

	public String getOutSupplierId() {
		return this.outSupplierId;
	}
	public void setOutSupplierId(String outSupplierId) {
		this.outSupplierId = outSupplierId;
	}

	public String getOutSupplierName() {
		return this.outSupplierName;
	}
	public void setOutSupplierName(String outSupplierName) {
		this.outSupplierName = outSupplierName;
	}

	public String getPoStatus() {
		return this.poStatus;
	}
	public void setPoStatus(String poStatus) {
		this.poStatus = poStatus;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTransferringCount() {
		return this.transferringCount;
	}
	public void setTransferringCount(Long transferringCount) {
		this.transferringCount = transferringCount;
	}

}
