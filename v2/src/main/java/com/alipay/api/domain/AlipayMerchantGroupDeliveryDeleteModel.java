package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除推广计划
 *
 * @author auto create
 * @since 1.0, 2024-10-31 16:18:11
 */
public class AlipayMerchantGroupDeliveryDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2374828874242857812L;

	/**
	 * 推广计划id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

}
