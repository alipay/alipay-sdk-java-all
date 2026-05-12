package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核心原材料供应商关联关系数据信息
 *
 * @author auto create
 * @since 1.0, 2026-04-21 15:36:17
 */
public class SupplierRelData extends AlipayObject {

	private static final long serialVersionUID = 1851783823292573914L;

	/**
	 * 蚂蚁原材料ID
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 蚂蚁原材料名称
	 */
	@ApiField("material_name")
	private String materialName;

	/**
	 * 二级供应商ID
	 */
	@ApiField("out_supplier_id")
	private String outSupplierId;

	/**
	 * 二级供应商名称
	 */
	@ApiField("out_supplier_name")
	private String outSupplierName;

	/**
	 * 整机供应商原材料ID
	 */
	@ApiField("supplier_material_id")
	private String supplierMaterialId;

	/**
	 * 整机供应商原材料名称
	 */
	@ApiField("supplier_material_name")
	private String supplierMaterialName;

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

	public String getSupplierMaterialId() {
		return this.supplierMaterialId;
	}
	public void setSupplierMaterialId(String supplierMaterialId) {
		this.supplierMaterialId = supplierMaterialId;
	}

	public String getSupplierMaterialName() {
		return this.supplierMaterialName;
	}
	public void setSupplierMaterialName(String supplierMaterialName) {
		this.supplierMaterialName = supplierMaterialName;
	}

}
