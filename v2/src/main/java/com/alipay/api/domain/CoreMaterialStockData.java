package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核心原材料库存数量信息
 *
 * @author auto create
 * @since 1.0, 2026-04-21 15:19:48
 */
public class CoreMaterialStockData extends AlipayObject {

	private static final long serialVersionUID = 2385462561687148459L;

	/**
	 * 实际库存数量,单位是个
	 */
	@ApiField("actual_count")
	private Long actualCount;

	/**
	 * 核心原材料ID
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 核心原材料名称
	 */
	@ApiField("material_name")
	private String materialName;

	/**
	 * 用于存储库存的记录日期
	 */
	@ApiField("record_date")
	private String recordDate;

	/**
	 * 在途库存数量，单位是个
	 */
	@ApiField("transferring_count")
	private Long transferringCount;

	/**
	 * 仓库ID
	 */
	@ApiField("warehouse_id")
	private String warehouseId;

	/**
	 * 仓库名称
	 */
	@ApiField("warehouse_name")
	private String warehouseName;

	public Long getActualCount() {
		return this.actualCount;
	}
	public void setActualCount(Long actualCount) {
		this.actualCount = actualCount;
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

	public String getRecordDate() {
		return this.recordDate;
	}
	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}

	public Long getTransferringCount() {
		return this.transferringCount;
	}
	public void setTransferringCount(Long transferringCount) {
		this.transferringCount = transferringCount;
	}

	public String getWarehouseId() {
		return this.warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getWarehouseName() {
		return this.warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

}
