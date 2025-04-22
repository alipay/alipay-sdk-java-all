package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租方指定资方或制定分账计划
 *
 * @author auto create
 * @since 1.0, 2025-04-01 19:52:26
 */
public class AlipayCommerceRentOrderSellerPublishModel extends AlipayObject {

	private static final long serialVersionUID = 6699184249769482777L;

	/**
	 * 买家支付宝用户ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝OPENID
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 资方pid，2088开头
	 */
	@ApiField("invest_id")
	private String investId;

	/**
	 * 交易组件订单Id，取值：租赁下单接口返回的orderId
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 分账计划详情，可为空
	 */
	@ApiField("royalty_publish_detail")
	private RoyaltyPublishDetailInfo royaltyPublishDetail;

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

	public String getInvestId() {
		return this.investId;
	}
	public void setInvestId(String investId) {
		this.investId = investId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public RoyaltyPublishDetailInfo getRoyaltyPublishDetail() {
		return this.royaltyPublishDetail;
	}
	public void setRoyaltyPublishDetail(RoyaltyPublishDetailInfo royaltyPublishDetail) {
		this.royaltyPublishDetail = royaltyPublishDetail;
	}

}
