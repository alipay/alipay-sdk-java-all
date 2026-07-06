package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleOrderBenefitVO;
import com.alipay.api.domain.RecycleStdOrderBaseVO;
import com.alipay.api.domain.RecycleDeliveryVO;
import com.alipay.api.domain.RecycleOrderFundAllVO;
import com.alipay.api.domain.RecycleStdOrderFundSubSidyVO;
import com.alipay.api.domain.RecycleStdOrderMerchantInfoVO;
import com.alipay.api.domain.RecycleOrderTagInfoVO;
import com.alipay.api.domain.RecycleOrderRelationVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.order.delegate.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-11 16:42:55
 */
public class AlipayCommerceRecycleOrderDelegateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1899179899124556278L;

	/** 
	 * 订单权益信息
	 */
	@ApiListField("benefits")
	@ApiField("recycle_order_benefit_v_o")
	private List<RecycleOrderBenefitVO> benefits;

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
	 * 订单资金信息
	 */
	@ApiField("order_fund_all")
	private RecycleOrderFundAllVO orderFundAll;

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
	 * 商户履约信息
	 */
	@ApiField("order_merchant_delivery")
	private RecycleDeliveryVO orderMerchantDelivery;

	/** 
	 * 订单退货信息
	 */
	@ApiField("order_sendback")
	private RecycleDeliveryVO orderSendback;

	/** 
	 * 订单标签信息
	 */
	@ApiListField("order_tags")
	@ApiField("recycle_order_tag_info_v_o")
	private List<RecycleOrderTagInfoVO> orderTags;

	/** 
	 * 订单关联信息
	 */
	@ApiListField("relation_infos")
	@ApiField("recycle_order_relation_v_o")
	private List<RecycleOrderRelationVO> relationInfos;

	public void setBenefits(List<RecycleOrderBenefitVO> benefits) {
		this.benefits = benefits;
	}
	public List<RecycleOrderBenefitVO> getBenefits( ) {
		return this.benefits;
	}

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

	public void setOrderFundAll(RecycleOrderFundAllVO orderFundAll) {
		this.orderFundAll = orderFundAll;
	}
	public RecycleOrderFundAllVO getOrderFundAll( ) {
		return this.orderFundAll;
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

	public void setOrderMerchantDelivery(RecycleDeliveryVO orderMerchantDelivery) {
		this.orderMerchantDelivery = orderMerchantDelivery;
	}
	public RecycleDeliveryVO getOrderMerchantDelivery( ) {
		return this.orderMerchantDelivery;
	}

	public void setOrderSendback(RecycleDeliveryVO orderSendback) {
		this.orderSendback = orderSendback;
	}
	public RecycleDeliveryVO getOrderSendback( ) {
		return this.orderSendback;
	}

	public void setOrderTags(List<RecycleOrderTagInfoVO> orderTags) {
		this.orderTags = orderTags;
	}
	public List<RecycleOrderTagInfoVO> getOrderTags( ) {
		return this.orderTags;
	}

	public void setRelationInfos(List<RecycleOrderRelationVO> relationInfos) {
		this.relationInfos = relationInfos;
	}
	public List<RecycleOrderRelationVO> getRelationInfos( ) {
		return this.relationInfos;
	}

}
