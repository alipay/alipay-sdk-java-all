package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充电桩履约信息同步
 *
 * @author auto create
 * @since 1.0, 2025-02-28 11:09:23
 */
public class AlipayCommerceTransportChargerPrivatefulfillmentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7292295831892798258L;

	/**
	 * 履约信息
	 */
	@ApiField("fulfillment")
	private PrivateChargingOrder fulfillment;

	public PrivateChargingOrder getFulfillment() {
		return this.fulfillment;
	}
	public void setFulfillment(PrivateChargingOrder fulfillment) {
		this.fulfillment = fulfillment;
	}

}
