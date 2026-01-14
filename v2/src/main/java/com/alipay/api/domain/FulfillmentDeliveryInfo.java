package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息
 *
 * @author auto create
 * @since 1.0, 2025-06-10 20:15:49
 */
public class FulfillmentDeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 2635741336194963929L;

	/**
	 * 请查看<a href="https://opendocs.alipay.com/mini/07hva0?pathHash=5de3c48d">快递公司ID列表</a>，请确认传入的值在此列表内，若发货的快递公司不在此列表内，可以传入值other
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 快递单单号，例如EMS的单号8125658724208
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
