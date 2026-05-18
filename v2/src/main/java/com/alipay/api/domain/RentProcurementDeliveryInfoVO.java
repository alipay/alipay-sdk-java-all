package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-18 10:15:56
 */
public class RentProcurementDeliveryInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2156636515696184231L;

	/**
	 * 快递公司ID
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 快递单单号
	 */
	@ApiField("waybill_id")
	private String waybillId;

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getWaybillId() {
		return this.waybillId;
	}
	public void setWaybillId(String waybillId) {
		this.waybillId = waybillId;
	}

}
