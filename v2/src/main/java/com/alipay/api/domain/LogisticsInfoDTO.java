package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息模型
 *
 * @author auto create
 * @since 1.0, 2023-06-20 13:44:52
 */
public class LogisticsInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6881568429911948654L;

	/**
	 * 否
物流类型,
POST 平邮,
EXPRESS 其他快递,
VIRTUAL 虚拟物品,
EMS EMS,
DIRECT 无需物流。
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

}
