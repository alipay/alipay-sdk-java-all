package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.gift.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:06
 */
public class AlipaySocialGiftOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4463335525997385267L;

	/** 
	 * 礼物单状态：
等待领取：WAIT_RECEIVE
已经领取：RECEIVED
领取失败 ： RECEIVE_ERROR

礼物单和订单状态是不同的。订单主要涉及支付退款状态，而礼物单状态则是用户接受礼物的状态。
	 */
	@ApiField("gift_order_status")
	private String giftOrderStatus;

	/** 
	 * 订单状态：
已支付：PAY_SUCCESS
已退款：REFUND_SUCCESS
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 产品数量
	 */
	@ApiField("quantity")
	private String quantity;

	/** 
	 * 收礼方id
	 */
	@ApiField("receiver_id")
	private String receiverId;

	/** 
	 * 送礼方id
	 */
	@ApiField("sender_id")
	private String senderId;

	/** 
	 * 对应送礼平台的sku_id，可用于找到送礼平台对应配置的产品，库存等信息。
	 */
	@ApiField("sku_id")
	private String skuId;

	/** 
	 * 订单总金额
	 */
	@ApiField("total_price")
	private String totalPrice;

	/** 
	 * 卡码信息
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setGiftOrderStatus(String giftOrderStatus) {
		this.giftOrderStatus = giftOrderStatus;
	}
	public String getGiftOrderStatus( ) {
		return this.giftOrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getQuantity( ) {
		return this.quantity;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}
	public String getReceiverId( ) {
		return this.receiverId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getSenderId( ) {
		return this.senderId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getSkuId( ) {
		return this.skuId;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getTotalPrice( ) {
		return this.totalPrice;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
