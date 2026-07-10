package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核心原材料库存出入库明细信息
 *
 * @author auto create
 * @since 1.0, 2026-04-21 15:19:48
 */
public class CoreMaterialStockDetail extends AlipayObject {

	private static final long serialVersionUID = 7727419574185867458L;

	/**
	 * 移动时间
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 库存id
	 */
	@ApiField("core_material_stock_id")
	private String coreMaterialStockId;

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
	 * 备注信息，由供应商自定义
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 移动数量,单位个
	 */
	@ApiField("move_amount")
	private Long moveAmount;

	/**
	 * 移动类型
	 */
	@ApiField("move_type")
	private String moveType;

	/**
	 * 关联外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 库存类型
	 */
	@ApiField("stock_type")
	private String stockType;

	/**
	 * 仓库ID（由蚂蚁分配）
	 */
	@ApiField("warehouse_id")
	private String warehouseId;

	/**
	 * 仓库名称，由蚂蚁指定
	 */
	@ApiField("warehouse_name")
	private String warehouseName;

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getCoreMaterialStockId() {
		return this.coreMaterialStockId;
	}
	public void setCoreMaterialStockId(String coreMaterialStockId) {
		this.coreMaterialStockId = coreMaterialStockId;
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

	public Long getMoveAmount() {
		return this.moveAmount;
	}
	public void setMoveAmount(Long moveAmount) {
		this.moveAmount = moveAmount;
	}

	public String getMoveType() {
		return this.moveType;
	}
	public void setMoveType(String moveType) {
		this.moveType = moveType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getStockType() {
		return this.stockType;
	}
	public void setStockType(String stockType) {
		this.stockType = stockType;
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
