package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广内容配置
 *
 * @author auto create
 * @since 1.0, 2023-08-15 10:20:05
 */
public class DeliveryContentConfig extends AlipayObject {

	private static final long serialVersionUID = 1143696863913329843L;

	/**
	 * 投放引导信息
	 */
	@ApiField("delivery_send_guide")
	private DeliverySendGuide deliverySendGuide;

	public DeliverySendGuide getDeliverySendGuide() {
		return this.deliverySendGuide;
	}
	public void setDeliverySendGuide(DeliverySendGuide deliverySendGuide) {
		this.deliverySendGuide = deliverySendGuide;
	}

}
