package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗商品交易规则
 *
 * @author auto create
 * @since 1.0, 2022-08-15 14:29:58
 */
public class HbGoodsTradeRule extends AlipayObject {

	private static final long serialVersionUID = 1785631329453617787L;

	/**
	 * 最大购买次数
	 */
	@ApiField("max_buy_frequency")
	private Long maxBuyFrequency;

	/**
	 * 最大购买数量
	 */
	@ApiField("max_buy_quantity")
	private Long maxBuyQuantity;

	/**
	 * 最小购买数量
	 */
	@ApiField("min_buy_quantity")
	private Long minBuyQuantity;

	/**
	 * 一次最大购买数量
	 */
	@ApiField("one_max_quantity")
	private Long oneMaxQuantity;

	/**
	 * 服务费占比
	 */
	@ApiField("service_fee_ratio")
	private String serviceFeeRatio;

	public Long getMaxBuyFrequency() {
		return this.maxBuyFrequency;
	}
	public void setMaxBuyFrequency(Long maxBuyFrequency) {
		this.maxBuyFrequency = maxBuyFrequency;
	}

	public Long getMaxBuyQuantity() {
		return this.maxBuyQuantity;
	}
	public void setMaxBuyQuantity(Long maxBuyQuantity) {
		this.maxBuyQuantity = maxBuyQuantity;
	}

	public Long getMinBuyQuantity() {
		return this.minBuyQuantity;
	}
	public void setMinBuyQuantity(Long minBuyQuantity) {
		this.minBuyQuantity = minBuyQuantity;
	}

	public Long getOneMaxQuantity() {
		return this.oneMaxQuantity;
	}
	public void setOneMaxQuantity(Long oneMaxQuantity) {
		this.oneMaxQuantity = oneMaxQuantity;
	}

	public String getServiceFeeRatio() {
		return this.serviceFeeRatio;
	}
	public void setServiceFeeRatio(String serviceFeeRatio) {
		this.serviceFeeRatio = serviceFeeRatio;
	}

}
