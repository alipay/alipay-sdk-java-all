package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建更新门店配送范围
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:34
 */
public class AlipayCommerceMedicalStoreDeliverySaveModel extends AlipayObject {

	private static final long serialVersionUID = 7336559432628986641L;

	/**
	 * 配送范围详情
	 */
	@ApiField("delivery_area")
	private Delivery deliveryArea;

	/**
	 * 门店编码，商家自定义，录入门店时必填。
	 */
	@ApiField("store_code")
	private String storeCode;

	public Delivery getDeliveryArea() {
		return this.deliveryArea;
	}
	public void setDeliveryArea(Delivery deliveryArea) {
		this.deliveryArea = deliveryArea;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
