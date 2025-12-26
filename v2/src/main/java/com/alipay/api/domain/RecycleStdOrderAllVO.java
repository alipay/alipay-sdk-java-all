package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收标准订单详情
 *
 * @author auto create
 * @since 1.0, 2025-07-21 14:40:02
 */
public class RecycleStdOrderAllVO extends AlipayObject {

	private static final long serialVersionUID = 8398774311874212653L;

	/**
	 * 订单基础
	 */
	@ApiField("order_base")
	private RecycleStdOrderBaseVO orderBase;

	/**
	 * 订单履约信息:工程师上门/邮寄/到店
	 */
	@ApiField("order_delivery")
	private RecycleDeliveryVO orderDelivery;

	/**
	 * 膨胀金信息
	 */
	@ApiField("order_fund_subsidy")
	private RecycleStdOrderFundSubSidyVO orderFundSubsidy;

	/**
	 * 回收商户的信息
	 */
	@ApiField("order_merchant")
	private RecycleStdOrderMerchantInfoVO orderMerchant;

	/**
	 * 订单退货信息（邮寄场景下，用户拒绝回收，会生成退货履约信息）
	 */
	@ApiField("order_sendback")
	private RecycleDeliveryVO orderSendback;

	public RecycleStdOrderBaseVO getOrderBase() {
		return this.orderBase;
	}
	public void setOrderBase(RecycleStdOrderBaseVO orderBase) {
		this.orderBase = orderBase;
	}

	public RecycleDeliveryVO getOrderDelivery() {
		return this.orderDelivery;
	}
	public void setOrderDelivery(RecycleDeliveryVO orderDelivery) {
		this.orderDelivery = orderDelivery;
	}

	public RecycleStdOrderFundSubSidyVO getOrderFundSubsidy() {
		return this.orderFundSubsidy;
	}
	public void setOrderFundSubsidy(RecycleStdOrderFundSubSidyVO orderFundSubsidy) {
		this.orderFundSubsidy = orderFundSubsidy;
	}

	public RecycleStdOrderMerchantInfoVO getOrderMerchant() {
		return this.orderMerchant;
	}
	public void setOrderMerchant(RecycleStdOrderMerchantInfoVO orderMerchant) {
		this.orderMerchant = orderMerchant;
	}

	public RecycleDeliveryVO getOrderSendback() {
		return this.orderSendback;
	}
	public void setOrderSendback(RecycleDeliveryVO orderSendback) {
		this.orderSendback = orderSendback;
	}

}
