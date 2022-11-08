package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放计划玩法配置
 *
 * @author auto create
 * @since 1.0, 2022-06-15 17:47:30
 */
public class IotDeliveryPlayConfig extends AlipayObject {

	private static final long serialVersionUID = 8841716748726224743L;

	/**
	 * 投放展位的投放内容
	 */
	@ApiField("delivery_content_info")
	private IotDeliveryContentInfo deliveryContentInfo;

	public IotDeliveryContentInfo getDeliveryContentInfo() {
		return this.deliveryContentInfo;
	}
	public void setDeliveryContentInfo(IotDeliveryContentInfo deliveryContentInfo) {
		this.deliveryContentInfo = deliveryContentInfo;
	}

}
