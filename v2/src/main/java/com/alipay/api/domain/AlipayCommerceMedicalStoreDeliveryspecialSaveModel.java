package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增更新特殊时段配送范围
 *
 * @author auto create
 * @since 1.0, 2025-06-19 19:03:02
 */
public class AlipayCommerceMedicalStoreDeliveryspecialSaveModel extends AlipayObject {

	private static final long serialVersionUID = 5592495952916555929L;

	/**
	 * 配送范围详情
	 */
	@ApiField("delivery_area")
	private Delivery deliveryArea;

	/**
	 * 配送范围生效时间
	 */
	@ApiField("delivery_time")
	private EffectivePeriodDTO deliveryTime;

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

	public EffectivePeriodDTO getDeliveryTime() {
		return this.deliveryTime;
	}
	public void setDeliveryTime(EffectivePeriodDTO deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
