package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商设备信息更新
 *
 * @author auto create
 * @since 1.0, 2025-11-18 15:03:14
 */
public class AlipayCommerceIotSupplierAssetModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5521993888347215887L;

	/**
	 * 供应商设备信息
	 */
	@ApiField("record")
	private SupplierAssetResponse record;

	public SupplierAssetResponse getRecord() {
		return this.record;
	}
	public void setRecord(SupplierAssetResponse record) {
		this.record = record;
	}

}
