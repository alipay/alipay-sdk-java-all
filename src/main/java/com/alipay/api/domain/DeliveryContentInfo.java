package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放内容。
 *
 * @author auto create
 * @since 1.0, 2022-01-18 17:12:21
 */
public class DeliveryContentInfo extends AlipayObject {

	private static final long serialVersionUID = 8215543863941138494L;

	/**
	 * 活动对象，包括支付券和导码模式的商家券。
	 */
	@ApiField("delivery_activity_content")
	private DeliveryActivityContentInfo deliveryActivityContent;

	/**
	 * 枚举值：
ACTIVITY：活动枚举类型。
	 */
	@ApiField("delivery_content_type")
	private String deliveryContentType;

	public DeliveryActivityContentInfo getDeliveryActivityContent() {
		return this.deliveryActivityContent;
	}
	public void setDeliveryActivityContent(DeliveryActivityContentInfo deliveryActivityContent) {
		this.deliveryActivityContent = deliveryActivityContent;
	}

	public String getDeliveryContentType() {
		return this.deliveryContentType;
	}
	public void setDeliveryContentType(String deliveryContentType) {
		this.deliveryContentType = deliveryContentType;
	}

}
