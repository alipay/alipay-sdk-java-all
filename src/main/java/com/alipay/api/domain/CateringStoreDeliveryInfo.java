package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外卖相关参数
 *
 * @author auto create
 * @since 1.0, 2021-06-09 17:33:18
 */
public class CateringStoreDeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 4849355885837244562L;

	/**
	 * 门店配送范围（单位：公里），数值型，精确至小数点两位。外卖场景必填，其余非必填。
	 */
	@ApiField("delivery_area")
	private String deliveryArea;

	/**
	 * 配送费用
	 */
	@ApiField("delivery_fee")
	private String deliveryFee;

	/**
	 * 起送金额。外卖场景必填，其余非必填。
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
