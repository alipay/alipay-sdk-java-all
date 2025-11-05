package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放内容。
 *
 * @author auto create
 * @since 1.0, 2023-08-15 10:20:05
 */
public class DeliveryContentInfo extends AlipayObject {

	private static final long serialVersionUID = 5196692428337537863L;

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
	 * 运营内容类型。
	 */
	@ApiField("delivery_content_type")
	private String deliveryContentType;

	/**
	 * 对客内容表达
	 */
	@ApiField("delivery_display_info")
	private DeliveryDisplayInfo deliveryDisplayInfo;

	/**
	 * 商品对象
	 */
	@ApiField("delivery_item_content")
	private DeliveryItemContentInfo deliveryItemContent;

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

	public DeliveryDisplayInfo getDeliveryDisplayInfo() {
		return this.deliveryDisplayInfo;
	}
	public void setDeliveryDisplayInfo(DeliveryDisplayInfo deliveryDisplayInfo) {
		this.deliveryDisplayInfo = deliveryDisplayInfo;
	}

	public DeliveryItemContentInfo getDeliveryItemContent() {
		return this.deliveryItemContent;
	}
	public void setDeliveryItemContent(DeliveryItemContentInfo deliveryItemContent) {
		this.deliveryItemContent = deliveryItemContent;
	}

}
