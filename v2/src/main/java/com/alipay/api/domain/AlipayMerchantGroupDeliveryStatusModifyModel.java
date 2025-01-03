package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改推广计划状态
 *
 * @author auto create
 * @since 1.0, 2024-10-31 16:15:48
 */
public class AlipayMerchantGroupDeliveryStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5459541572181791848L;

	/**
	 * 推广计划id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 推广计划更新状态，对指定推广delivery_id进行变更。操作说明：1、状态VALID启用时，只能进行INVALID停用操作 2、状态INVALID停用时，只能进行VALID启用操作。状态流转如下：VALID启用->INVALID停用;INVALID停用->VALID启用。
	 */
	@ApiField("status")
	private String status;

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
