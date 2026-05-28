package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 核心原材料PO信息上传
 *
 * @author auto create
 * @since 1.0, 2026-04-21 15:19:31
 */
public class AntMerchantExpandCorematerialPoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4632686281876471358L;

	/**
	 * PO明细信息
	 */
	@ApiListField("po_data_list")
	@ApiField("core_material_po_data")
	private List<CoreMaterialPoData> poDataList;

	/**
	 * 供应商ID，由蚂蚁分配
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 供应商名称
	 */
	@ApiField("supplier_name")
	private String supplierName;

	/**
	 * 上传类型：NEW-新增/STATUS_CHANGE-状态变更
	 */
	@ApiField("upload_type")
	private String uploadType;

	public List<CoreMaterialPoData> getPoDataList() {
		return this.poDataList;
	}
	public void setPoDataList(List<CoreMaterialPoData> poDataList) {
		this.poDataList = poDataList;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return this.supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getUploadType() {
		return this.uploadType;
	}
	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

}
