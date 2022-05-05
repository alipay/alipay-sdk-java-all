package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放内容
 *
 * @author auto create
 * @since 1.0, 2022-04-24 11:05:40
 */
public class DeliverySingleSendConfig extends AlipayObject {

	private static final long serialVersionUID = 2796875578767446523L;

	/**
	 * 投放展位的投放内容。
	 */
	@ApiField("delivery_content_info")
	private DeliveryContentInfo deliveryContentInfo;

	public DeliveryContentInfo getDeliveryContentInfo() {
		return this.deliveryContentInfo;
	}
	public void setDeliveryContentInfo(DeliveryContentInfo deliveryContentInfo) {
		this.deliveryContentInfo = deliveryContentInfo;
	}

}
