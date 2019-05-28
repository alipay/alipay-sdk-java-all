package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商设备信息更新
 *
 * @author auto create
 * @since 1.0, 2019-04-10 18:52:45
 */
public class AlipayCommerceIotSupplierAssetModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3248695927739586552L;

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
