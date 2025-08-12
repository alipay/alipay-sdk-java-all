package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约物流发货
 *
 * @author auto create
 * @since 1.0, 2025-07-24 19:49:40
 */
public class AlipayCommerceRentOrderFulfillmentSendModel extends AlipayObject {

	private static final long serialVersionUID = 2513414376158838112L;

	/**
	 * 物流信息
	 */
	@ApiListField("delivery_list")
	@ApiField("fulfillment_delivery_info")
	private List<FulfillmentDeliveryInfo> deliveryList;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户订单号，创建订单请求由商户传入
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 记录商品发货的时间
	 */
	@ApiField("ship_done_time")
	private Date shipDoneTime;

	/**
	 * 发货类型。当前支持两种场景，一是商家发货寄出商品，二是用户到期归还寄回商品
	 */
	@ApiField("type")
	private String type;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public List<FulfillmentDeliveryInfo> getDeliveryList() {
		return this.deliveryList;
	}
	public void setDeliveryList(List<FulfillmentDeliveryInfo> deliveryList) {
		this.deliveryList = deliveryList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public Date getShipDoneTime() {
		return this.shipDoneTime;
	}
	public void setShipDoneTime(Date shipDoneTime) {
		this.shipDoneTime = shipDoneTime;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
