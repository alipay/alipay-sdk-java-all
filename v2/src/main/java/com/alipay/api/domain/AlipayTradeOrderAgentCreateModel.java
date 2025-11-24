package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收单交易第三方代理下单
 *
 * @author auto create
 * @since 1.0, 2024-09-26 16:12:05
 */
public class AlipayTradeOrderAgentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3571473394635421756L;

	/**
	 * 支付宝会员UID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家开放网关openId
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * order_create_type为order_str的话，该值为使用base64 encode之后的支付宝支付支付订单串
	 */
	@ApiField("order_create_content")
	private String orderCreateContent;

	/**
	 * 代理下单时，商户原始的创单类型
	 */
	@ApiField("order_create_type")
	private String orderCreateType;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getOrderCreateContent() {
		return this.orderCreateContent;
	}
	public void setOrderCreateContent(String orderCreateContent) {
		this.orderCreateContent = orderCreateContent;
	}

	public String getOrderCreateType() {
		return this.orderCreateType;
	}
	public void setOrderCreateType(String orderCreateType) {
		this.orderCreateType = orderCreateType;
	}

}
