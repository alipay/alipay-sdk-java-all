package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取门店配送范围
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:33
 */
public class AlipayCommerceMedicalStoreDeliveryGetModel extends AlipayObject {

	private static final long serialVersionUID = 3433337782934297889L;

	/**
	 * 查询配送范围的门店的门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
