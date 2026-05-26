package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约物流确认收货
 *
 * @author auto create
 * @since 1.0, 2026-04-13 15:25:31
 */
public class AlipayCommerceRentOrderFulfillmentReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 5639735568624444385L;

	/**
	 * 补充凭证
	 */
	@ApiListField("additional_media_list")
	@ApiField("fulfillment_additional_media_info")
	private List<FulfillmentAdditionalMediaInfo> additionalMediaList;

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
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 订单确认收货的类型。当前支持两种场景，一是商家发货寄出商品，用户确认收到商品；二是用户到期归还寄回商品，商家确认收到商品
	 */
	@ApiField("type")
	private String type;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public List<FulfillmentAdditionalMediaInfo> getAdditionalMediaList() {
		return this.additionalMediaList;
	}
	public void setAdditionalMediaList(List<FulfillmentAdditionalMediaInfo> additionalMediaList) {
		this.additionalMediaList = additionalMediaList;
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
