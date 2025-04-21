package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC行程退款明细项
 *
 * @author auto create
 * @since 1.0, 2024-06-24 21:33:26
 */
public class ETCRefundItemDto extends AlipayObject {

	private static final long serialVersionUID = 4234746242358364252L;

	/**
	 * 退款类目
	 */
	@ApiField("item_category")
	private String itemCategory;

	/**
	 * 本项实际退费
	 */
	@ApiField("item_refund_amount")
	private String itemRefundAmount;

	/**
	 * 外部行程唯一流水号
	 */
	@ApiField("out_trip_id")
	private String outTripId;

	public String getItemCategory() {
		return this.itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemRefundAmount() {
		return this.itemRefundAmount;
	}
	public void setItemRefundAmount(String itemRefundAmount) {
		this.itemRefundAmount = itemRefundAmount;
	}

	public String getOutTripId() {
		return this.outTripId;
	}
	public void setOutTripId(String outTripId) {
		this.outTripId = outTripId;
	}

}
