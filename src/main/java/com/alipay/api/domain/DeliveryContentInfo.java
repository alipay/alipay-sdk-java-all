package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放内容。
 *
 * @author auto create
 * @since 1.0, 2022-08-08 13:14:25
 */
public class DeliveryContentInfo extends AlipayObject {

	private static final long serialVersionUID = 3592975679449198654L;

	/**
	 * 活动对象。
	 */
	@ApiField("delivery_activity_content")
	private DeliveryActivityContentInfo deliveryActivityContent;

	/**
	 * 小程序对象
	 */
	@ApiField("delivery_app_content")
	private DeliveryMiniAppContentInfo deliveryAppContent;

	/**
	 * 枚举值：
ACTIVITY：活动枚举类型，
MINI_APP：小程序枚举类型
	 */
	@ApiField("delivery_content_type")
	private String deliveryContentType;

	public DeliveryActivityContentInfo getDeliveryActivityContent() {
		return this.deliveryActivityContent;
	}
	public void setDeliveryActivityContent(DeliveryActivityContentInfo deliveryActivityContent) {
		this.deliveryActivityContent = deliveryActivityContent;
	}

	public DeliveryMiniAppContentInfo getDeliveryAppContent() {
		return this.deliveryAppContent;
	}
	public void setDeliveryAppContent(DeliveryMiniAppContentInfo deliveryAppContent) {
		this.deliveryAppContent = deliveryAppContent;
	}

	public String getDeliveryContentType() {
		return this.deliveryContentType;
	}
	public void setDeliveryContentType(String deliveryContentType) {
		this.deliveryContentType = deliveryContentType;
	}

}
