package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放玩法配置。
限制：投放玩法配置有且仅能配置一个。
 *
 * @author auto create
 * @since 1.0, 2022-08-08 13:14:25
 */
public class DeliveryPlayConfig extends AlipayObject {

	private static final long serialVersionUID = 5867879768525928118L;

	/**
	 * 满额送玩法投放内容配置。
限制：展位码限制为PAYMENT_REUSLT时满额生效。
	 */
	@ApiField("delivery_full_send_config")
	private DeliveryFullSendConfig deliveryFullSendConfig;

	/**
	 * 通用投放内容配置。
限制：全展位码通用。
	 */
	@ApiField("delivery_single_send_config")
	private DeliverySingleSendConfig deliverySingleSendConfig;

	public DeliveryFullSendConfig getDeliveryFullSendConfig() {
		return this.deliveryFullSendConfig;
	}
	public void setDeliveryFullSendConfig(DeliveryFullSendConfig deliveryFullSendConfig) {
		this.deliveryFullSendConfig = deliveryFullSendConfig;
	}

	public DeliverySingleSendConfig getDeliverySingleSendConfig() {
		return this.deliverySingleSendConfig;
	}
	public void setDeliverySingleSendConfig(DeliverySingleSendConfig deliverySingleSendConfig) {
		this.deliverySingleSendConfig = deliverySingleSendConfig;
	}

}
