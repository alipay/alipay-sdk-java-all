package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁履约单物流信息
 *
 * @author auto create
 * @since 1.0, 2025-07-25 20:38:34
 */
public class RentFulfillmentDeliveryInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6665147371664293534L;

	/**
	 * 快递公司ID。<a href="https://opendocs.alipay.com/mini/07hva0?pathHash=5de3c48d">快递公司ID列表</a>
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 快递单号
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
