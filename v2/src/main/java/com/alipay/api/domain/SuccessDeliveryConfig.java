package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建成功的投放信息配置
 *
 * @author auto create
 * @since 1.0, 2023-03-30 20:16:36
 */
public class SuccessDeliveryConfig extends AlipayObject {

	private static final long serialVersionUID = 5131145765395918117L;

	/**
	 * 投放配置。
	 */
	@ApiField("delivery_config")
	private DeliveryConfig deliveryConfig;

	public DeliveryConfig getDeliveryConfig() {
		return this.deliveryConfig;
	}
	public void setDeliveryConfig(DeliveryConfig deliveryConfig) {
		this.deliveryConfig = deliveryConfig;
	}

}
