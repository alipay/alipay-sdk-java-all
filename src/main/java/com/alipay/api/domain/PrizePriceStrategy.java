package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品定价策略
 *
 * @author auto create
 * @since 1.0, 2019-08-19 15:58:49
 */
public class PrizePriceStrategy extends AlipayObject {

	private static final long serialVersionUID = 4315666797916132921L;

	/**
	 * 根据不同的奖品类型填写不同的值，具体用法联系营销技术获取
	 */
	@ApiField("max_price")
	private String maxPrice;

	/**
	 * 根据不同的奖品类型填写不同的值，具体用法联系营销技术获取
	 */
	@ApiField("min_price")
	private String minPrice;

	/**
	 * 定价策略值，根据不同的奖品类型填写不同的值，具体用法联系营销技术获取
	 */
	@ApiField("stragety_value")
	private String stragetyValue;

	/**
	 * RANDOM_PRICE随机，FIX_PRICE定额奖品，不同的定价策略填写不同值，具体根据业务评估
	 */
	@ApiField("strategy_type")
	private String strategyType;

	public String getMaxPrice() {
		return this.maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getMinPrice() {
		return this.minPrice;
	}
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getStragetyValue() {
		return this.stragetyValue;
	}
	public void setStragetyValue(String stragetyValue) {
		this.stragetyValue = stragetyValue;
	}

	public String getStrategyType() {
		return this.strategyType;
	}
	public void setStrategyType(String strategyType) {
		this.strategyType = strategyType;
	}

}
