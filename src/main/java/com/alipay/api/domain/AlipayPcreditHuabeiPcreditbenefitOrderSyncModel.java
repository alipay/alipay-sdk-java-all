package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家订单同步至花呗
 *
 * @author auto create
 * @since 1.0, 2022-08-18 16:58:59
 */
public class AlipayPcreditHuabeiPcreditbenefitOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1725171415741679547L;

	/**
	 * 支付宝交易号
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 外部商品ID
	 */
	@ApiField("biz_item_id")
	private String bizItemId;

	/**
	 * 1640769715
	 */
	@ApiField("biz_timestamp")
	private Long bizTimestamp;

	/**
	 * 订单内商品数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create")
	private Date orderCreate;

	/**
	 * 订单过期时间
	 */
	@ApiField("order_expire")
	private Date orderExpire;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 外部订单id
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 订单交易金额（单位：分）
	 */
	@ApiField("trade_amount")
	private Long tradeAmount;

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizItemId() {
		return this.bizItemId;
	}
	public void setBizItemId(String bizItemId) {
		this.bizItemId = bizItemId;
	}

	public Long getBizTimestamp() {
		return this.bizTimestamp;
	}
	public void setBizTimestamp(Long bizTimestamp) {
		this.bizTimestamp = bizTimestamp;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Date getOrderCreate() {
		return this.orderCreate;
	}
	public void setOrderCreate(Date orderCreate) {
		this.orderCreate = orderCreate;
	}

	public Date getOrderExpire() {
		return this.orderExpire;
	}
	public void setOrderExpire(Date orderExpire) {
		this.orderExpire = orderExpire;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOuterOrderId() {
		return this.outerOrderId;
	}
	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public Long getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(Long tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

}
