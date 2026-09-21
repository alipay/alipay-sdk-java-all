package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店设置为小二下架状态
 *
 * @author auto create
 * @since 1.0, 2026-07-08 10:52:56
 */
public class AlipayCommerceMedicalStoreBusinessCloseModel extends AlipayObject {

	private static final long serialVersionUID = 3612972256885924345L;

	/**
	 * 门店编码
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
