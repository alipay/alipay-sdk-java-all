package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除配送范围
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:32
 */
public class AlipayCommerceMedicalStoreDeliveryDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4865334832712426649L;

	/**
	 * app方配送范围编码，商户手动输入
	 */
	@ApiField("app_delivery_code")
	private String appDeliveryCode;

	/**
	 * 门店编码，商家自定义，录入门店时必填
	 */
	@ApiField("store_code")
	private String storeCode;

	public String getAppDeliveryCode() {
		return this.appDeliveryCode;
	}
	public void setAppDeliveryCode(String appDeliveryCode) {
		this.appDeliveryCode = appDeliveryCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
