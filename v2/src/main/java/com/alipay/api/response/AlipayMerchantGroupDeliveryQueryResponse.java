package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupDeliveryDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.delivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-31 16:22:21
 */
public class AlipayMerchantGroupDeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5626645234954576535L;

	/** 
	 * 推广计划详情
	 */
	@ApiField("delivery_detail")
	private GroupDeliveryDetailVO deliveryDetail;

	public void setDeliveryDetail(GroupDeliveryDetailVO deliveryDetail) {
		this.deliveryDetail = deliveryDetail;
	}
	public GroupDeliveryDetailVO getDeliveryDetail( ) {
		return this.deliveryDetail;
	}

}
