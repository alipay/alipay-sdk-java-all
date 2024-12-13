package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应商逆向申请明细
 *
 * @author auto create
 * @since 1.0, 2024-06-03 14:37:50
 */
public class AssetReverseSupplierApplyDetail extends AlipayObject {

	private static final long serialVersionUID = 2515496394623322393L;

	/**
	 * ["发起未妥投的sn和物流信息1","发起未妥投的sn和物流信息2"]
	 */
	@ApiListField("express_sn_details")
	@ApiField("asset_reverse_supplier_apply_express_sn_details")
	private List<AssetReverseSupplierApplyExpressSnDetails> expressSnDetails;

	/**
	 * 发起未妥投供应商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 发起未妥投的供应商id
	 */
	@ApiField("supplier_pid")
	private String supplierPid;

	/**
	 * 发起未妥投的仓库id
	 */
	@ApiField("warehouse_id")
	private String warehouseId;

	public List<AssetReverseSupplierApplyExpressSnDetails> getExpressSnDetails() {
		return this.expressSnDetails;
	}
	public void setExpressSnDetails(List<AssetReverseSupplierApplyExpressSnDetails> expressSnDetails) {
		this.expressSnDetails = expressSnDetails;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierPid() {
		return this.supplierPid;
	}
	public void setSupplierPid(String supplierPid) {
		this.supplierPid = supplierPid;
	}

	public String getWarehouseId() {
		return this.warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

}
