package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁订单的简版信息
 *
 * @author auto create
 * @since 1.0, 2024-04-30 20:05:51
 */
public class SimpleOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 8354624594114893981L;

	/**
	 * 订单的商品信息，包括商品数量、价格、ItemId
	 */
	@ApiListField("item_info_list")
	@ApiField("rent_item_info")
	private List<RentItemInfo> itemInfoList;

	/**
	 * 交易组件的订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 包含订单的金额信息，包括订单金额、运费信息、优惠信息等
	 */
	@ApiField("price_info")
	private RentPriceInfo priceInfo;

	public List<RentItemInfo> getItemInfoList() {
		return this.itemInfoList;
	}
	public void setItemInfoList(List<RentItemInfo> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public RentPriceInfo getPriceInfo() {
		return this.priceInfo;
	}
	public void setPriceInfo(RentPriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}

}
