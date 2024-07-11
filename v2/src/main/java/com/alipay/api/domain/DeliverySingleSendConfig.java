package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放内容
 *
 * @author auto create
 * @since 1.0, 2023-08-15 10:20:05
 */
public class DeliverySingleSendConfig extends AlipayObject {

	private static final long serialVersionUID = 5434625594271814358L;

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
