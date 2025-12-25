package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流单修改信息
 *
 * @author auto create
 * @since 1.0, 2025-07-04 14:13:57
 */
public class LogisticsOrderModifyDTO extends AlipayObject {

	private static final long serialVersionUID = 7731733418937619934L;

	/**
	 * 快递公司标识
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 原始物流公司标识
	 */
	@ApiField("original_delivery_id")
	private String originalDeliveryId;

	/**
	 * 原始物流单号
	 */
	@ApiField("original_waybill_id")
	private String originalWaybillId;

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

	public String getOriginalDeliveryId() {
		return this.originalDeliveryId;
	}
	public void setOriginalDeliveryId(String originalDeliveryId) {
		this.originalDeliveryId = originalDeliveryId;
	}

	public String getOriginalWaybillId() {
		return this.originalWaybillId;
	}
	public void setOriginalWaybillId(String originalWaybillId) {
		this.originalWaybillId = originalWaybillId;
	}

	public String getWaybillId() {
		return this.waybillId;
	}
	public void setWaybillId(String waybillId) {
		this.waybillId = waybillId;
	}

}
