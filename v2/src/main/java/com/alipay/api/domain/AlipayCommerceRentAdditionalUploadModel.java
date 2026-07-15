package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁附加材料上传
 *
 * @author auto create
 * @since 1.0, 2026-06-24 16:47:55
 */
public class AlipayCommerceRentAdditionalUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8461596969879395411L;

	/**
	 * null
	 */
	@ApiListField("fulfillment_additional_media_list")
	@ApiField("fulfillment_additional_media_info")
	private List<FulfillmentAdditionalMediaInfo> fulfillmentAdditionalMediaList;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	public List<FulfillmentAdditionalMediaInfo> getFulfillmentAdditionalMediaList() {
		return this.fulfillmentAdditionalMediaList;
	}
	public void setFulfillmentAdditionalMediaList(List<FulfillmentAdditionalMediaInfo> fulfillmentAdditionalMediaList) {
		this.fulfillmentAdditionalMediaList = fulfillmentAdditionalMediaList;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
