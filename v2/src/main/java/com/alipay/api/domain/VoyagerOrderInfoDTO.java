package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单信息
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:09:54
 */
public class VoyagerOrderInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5339124553887778434L;

	/**
	 * null
	 */
	@ApiListField("goods_list")
	@ApiField("standard_goods_info")
	private List<StandardGoodsInfo> goodsList;

	/**
	 * 二级商户MCC
	 */
	@ApiField("merchant_mcc")
	private String merchantMcc;

	/**
	 * 业务订单金额
	 */
	@ApiField("order_amount")
	private MultiCurrencyMoneyDTO orderAmount;

	/**
	 * 订单描述
	 */
	@ApiField("order_description")
	private String orderDescription;

	/**
	 * 业务订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 二级商户id
	 */
	@ApiField("reference_merchant_id")
	private String referenceMerchantId;

	/**
	 * 结算策略
	 */
	@ApiField("settlement_strategy")
	private SettlementStrategyDTO settlementStrategy;

	public List<StandardGoodsInfo> getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(List<StandardGoodsInfo> goodsList) {
		this.goodsList = goodsList;
	}

	public String getMerchantMcc() {
		return this.merchantMcc;
	}
	public void setMerchantMcc(String merchantMcc) {
		this.merchantMcc = merchantMcc;
	}

	public MultiCurrencyMoneyDTO getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(MultiCurrencyMoneyDTO orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderDescription() {
		return this.orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getReferenceMerchantId() {
		return this.referenceMerchantId;
	}
	public void setReferenceMerchantId(String referenceMerchantId) {
		this.referenceMerchantId = referenceMerchantId;
	}

	public SettlementStrategyDTO getSettlementStrategy() {
		return this.settlementStrategy;
	}
	public void setSettlementStrategy(SettlementStrategyDTO settlementStrategy) {
		this.settlementStrategy = settlementStrategy;
	}

}
