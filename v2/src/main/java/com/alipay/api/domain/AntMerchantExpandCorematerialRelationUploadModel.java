package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应商原材料关联关系批量同步
 *
 * @author auto create
 * @since 1.0, 2026-04-21 15:36:17
 */
public class AntMerchantExpandCorematerialRelationUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7835992793672545266L;

	/**
	 * 供应商关联信息，如关联核心原材料等信息
	 */
	@ApiListField("supplier_rel_list")
	@ApiField("supplier_rel_data")
	private List<SupplierRelData> supplierRelList;

	public List<SupplierRelData> getSupplierRelList() {
		return this.supplierRelList;
	}
	public void setSupplierRelList(List<SupplierRelData> supplierRelList) {
		this.supplierRelList = supplierRelList;
	}

}
