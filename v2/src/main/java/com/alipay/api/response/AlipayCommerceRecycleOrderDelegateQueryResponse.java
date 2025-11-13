package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RecycleStdOrderBaseVO;
import com.alipay.api.domain.RecycleDeliveryVO;
import com.alipay.api.domain.RecycleStdOrderFundSubSidyVO;
import com.alipay.api.domain.RecycleStdOrderMerchantInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.order.delegate.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-23 11:27:33
 */
public class AlipayCommerceRecycleOrderDelegateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4299811246572298154L;

	/** 
	 * 订单基础信息
	 */
	@ApiField("order_base")
	private RecycleStdOrderBaseVO orderBase;

	/** 
	 * 订单履约信息
	 */
	@ApiField("order_delivery")
	private RecycleDeliveryVO orderDelivery;

	/** 
	 * 品牌膨胀金信息
	 */
	@ApiField("order_fund_subsidy")
	private RecycleStdOrderFundSubSidyVO orderFundSubsidy;

	/** 
	 * 回收商户信息
	 */
	@ApiField("order_merchant")
	private RecycleStdOrderMerchantInfoVO orderMerchant;

	/** 
	 * 订单退货信息
	 */
	@ApiField("order_sendback")
	private RecycleDeliveryVO orderSendback;

	public void setOrderBase(RecycleStdOrderBaseVO orderBase) {
		this.orderBase = orderBase;
	}
	public RecycleStdOrderBaseVO getOrderBase( ) {
		return this.orderBase;
	}

	public void setOrderDelivery(RecycleDeliveryVO orderDelivery) {
		this.orderDelivery = orderDelivery;
	}
	public RecycleDeliveryVO getOrderDelivery( ) {
		return this.orderDelivery;
	}

	public void setOrderFundSubsidy(RecycleStdOrderFundSubSidyVO orderFundSubsidy) {
		this.orderFundSubsidy = orderFundSubsidy;
	}
	public RecycleStdOrderFundSubSidyVO getOrderFundSubsidy( ) {
		return this.orderFundSubsidy;
	}

	public void setOrderMerchant(RecycleStdOrderMerchantInfoVO orderMerchant) {
		this.orderMerchant = orderMerchant;
	}
	public RecycleStdOrderMerchantInfoVO getOrderMerchant( ) {
		return this.orderMerchant;
	}

	public void setOrderSendback(RecycleDeliveryVO orderSendback) {
		this.orderSendback = orderSendback;
	}
	public RecycleDeliveryVO getOrderSendback( ) {
		return this.orderSendback;
	}

}
