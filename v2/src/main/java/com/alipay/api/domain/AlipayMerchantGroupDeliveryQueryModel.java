package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询推广计划详情
 *
 * @author auto create
 * @since 1.0, 2024-10-31 16:17:09
 */
public class AlipayMerchantGroupDeliveryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7173683579373399567L;

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
