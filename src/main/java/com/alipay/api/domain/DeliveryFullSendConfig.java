package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满送玩法配置。

限制：booth_code选择PAY_REUSLT时，才可以进行配置。
含义：用户支付满足一定门槛后，才能够在支付成功页面领取商户投放的活动。
说明：可投放的活动类型在满减玩法配置中进行说明。
 *
 * @author auto create
 * @since 1.0, 2022-08-08 13:14:25
 */
public class DeliveryFullSendConfig extends AlipayObject {

	private static final long serialVersionUID = 8721863235772629216L;

	/**
	 * 投放展位的投放内容。
	 */
	@ApiField("delivery_content_info")
	private DeliveryContentInfo deliveryContentInfo;

	/**
	 * 满足消费金额门槛，左闭区间，单位元。
说明：限制支付时的订单金额最少满足的金额门槛。
限制：value > 0 && value <= 99999。
	 */
	@ApiField("delivery_floor_amount")
	private String deliveryFloorAmount;

	public DeliveryContentInfo getDeliveryContentInfo() {
		return this.deliveryContentInfo;
	}
	public void setDeliveryContentInfo(DeliveryContentInfo deliveryContentInfo) {
		this.deliveryContentInfo = deliveryContentInfo;
	}

	public String getDeliveryFloorAmount() {
		return this.deliveryFloorAmount;
	}
	public void setDeliveryFloorAmount(String deliveryFloorAmount) {
		this.deliveryFloorAmount = deliveryFloorAmount;
	}

}
