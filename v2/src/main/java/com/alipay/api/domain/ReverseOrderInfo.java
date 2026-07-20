package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-20 11:47:53
 */
public class ReverseOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 5427744419762452133L;

	/**
	 * 渠道逆向订单ID
	 */
	@ApiField("channel_reverse_order_no")
	private String channelReverseOrderNo;

	/**
	 * 逆向订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 退款金额，单位：分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * null
	 */
	@ApiListField("return_item_list")
	@ApiField("item_third_party_info")
	private List<ItemThirdPartyInfo> returnItemList;

	public String getChannelReverseOrderNo() {
		return this.channelReverseOrderNo;
	}
	public void setChannelReverseOrderNo(String channelReverseOrderNo) {
		this.channelReverseOrderNo = channelReverseOrderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public List<ItemThirdPartyInfo> getReturnItemList() {
		return this.returnItemList;
	}
	public void setReturnItemList(List<ItemThirdPartyInfo> returnItemList) {
		this.returnItemList = returnItemList;
	}

}
