package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放内容
 *
 * @author auto create
 * @since 1.0, 2023-06-29 12:29:07
 */
public class DeliverySingleSendConfig extends AlipayObject {

	private static final long serialVersionUID = 1578161977595533148L;

	/**
	 * 推广内容配置
	 */
	@ApiField("delivery_content_config")
	private DeliveryContentConfig deliveryContentConfig;

	/**
	 * 投放展位的投放内容。
	 */
	@ApiField("delivery_content_info")
	private DeliveryContentInfo deliveryContentInfo;

	public DeliveryContentConfig getDeliveryContentConfig() {
		return this.deliveryContentConfig;
	}
	public void setDeliveryContentConfig(DeliveryContentConfig deliveryContentConfig) {
		this.deliveryContentConfig = deliveryContentConfig;
	}

	public DeliveryContentInfo getDeliveryContentInfo() {
		return this.deliveryContentInfo;
	}
	public void setDeliveryContentInfo(DeliveryContentInfo deliveryContentInfo) {
		this.deliveryContentInfo = deliveryContentInfo;
	}

}
