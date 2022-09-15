package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商设备信息更新
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:28:27
 */
public class AlipayCommerceIotSupplierAssetModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4882347261294227575L;

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
