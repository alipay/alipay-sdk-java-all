package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景开放平台电商子订单模型
 *
 * @author auto create
 * @since 1.0, 2022-10-27 10:56:15
 */
public class EcomSubOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 2896967624764166814L;

	/**
	 * 购买数量
	 */
	@ApiField("buy_amount")
	private Long buyAmount;

	/**
	 * 交易创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 商品列表
	 */
	@ApiField("item")
	private EcomItemDTO item;

	/**
	 * 订单金额
	 */
	@ApiField("order_fee")
	private Long orderFee;

	/**
	 * 订单id，必填
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 交易结束时间
	 */
	@ApiField("trade_end_time")
	private Date tradeEndTime;

	public Long getBuyAmount() {
		return this.buyAmount;
	}
	public void setBuyAmount(Long buyAmount) {
		this.buyAmount = buyAmount;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public EcomItemDTO getItem() {
		return this.item;
	}
	public void setItem(EcomItemDTO item) {
		this.item = item;
	}

	public Long getOrderFee() {
		return this.orderFee;
	}
	public void setOrderFee(Long orderFee) {
		this.orderFee = orderFee;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getTradeEndTime() {
		return this.tradeEndTime;
	}
	public void setTradeEndTime(Date tradeEndTime) {
		this.tradeEndTime = tradeEndTime;
	}

}
