package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店设置为营业状态
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:31
 */
public class AlipayCommerceMedicalStoreBusinessOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 6129652915836131565L;

	/**
	 * APP方门店编码
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
