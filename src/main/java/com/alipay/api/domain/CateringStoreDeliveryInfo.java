package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外卖相关参数
 *
 * @author auto create
 * @since 1.0, 2021-04-11 09:02:45
 */
public class CateringStoreDeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 6242138615899494332L;

	/**
	 * 门店配送范围（单位：公里）
	 */
	@ApiField("delivery_area")
	private String deliveryArea;

	/**
	 * 配送费用
	 */
	@ApiField("delivery_fee")
	private String deliveryFee;

	/**
	 * 起送金额
	 */
	@ApiField("delivery_threshold")
	private String deliveryThreshold;

	public String getDeliveryArea() {
		return this.deliveryArea;
	}
	public void setDeliveryArea(String deliveryArea) {
		this.deliveryArea = deliveryArea;
	}

	public String getDeliveryFee() {
		return this.deliveryFee;
	}
	public void setDeliveryFee(String deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public String getDeliveryThreshold() {
		return this.deliveryThreshold;
	}
	public void setDeliveryThreshold(String deliveryThreshold) {
		this.deliveryThreshold = deliveryThreshold;
	}

}
