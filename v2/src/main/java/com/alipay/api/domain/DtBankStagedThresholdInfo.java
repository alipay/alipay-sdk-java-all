package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多阶梯立减规则--单区间优惠配置信息
 *
 * @author auto create
 * @since 1.0, 2023-06-22 00:22:29
 */
public class DtBankStagedThresholdInfo extends AlipayObject {

	private static final long serialVersionUID = 3884239543233932734L;

	/**
	 * 满足优惠的订单金额阈值最大值，单位为分
	 */
	@ApiField("max_threshold_amount")
	private Long maxThresholdAmount;

	/**
	 * 满足优惠条件的订单金额最小值,分为单位
	 */
	@ApiField("min_threshold_amount")
	private Long minThresholdAmount;

	/**
	 * 该区间范围内的定价优惠策略
REDUCE_FIXED_AMOUNT：单笔固定立减
REDUCE_TO_AMOUNT：减至优惠
	 */
	@ApiField("price_calc_type")
	private String priceCalcType;

	/**
	 * 如果priceCalc=REDUCE_FIXED_AMOUNT，表示单笔立减5.55元；
如果priceCalc=REDUCE_TO_AMOUNT，表示当前订单优惠到5.55元(即实际支付5.55元)
	 */
	@ApiField("reduce_amount")
	private Long reduceAmount;

	public Long getMaxThresholdAmount() {
		return this.maxThresholdAmount;
	}
	public void setMaxThresholdAmount(Long maxThresholdAmount) {
		this.maxThresholdAmount = maxThresholdAmount;
	}

	public Long getMinThresholdAmount() {
		return this.minThresholdAmount;
	}
	public void setMinThresholdAmount(Long minThresholdAmount) {
		this.minThresholdAmount = minThresholdAmount;
	}

	public String getPriceCalcType() {
		return this.priceCalcType;
	}
	public void setPriceCalcType(String priceCalcType) {
		this.priceCalcType = priceCalcType;
	}

	public Long getReduceAmount() {
		return this.reduceAmount;
	}
	public void setReduceAmount(Long reduceAmount) {
		this.reduceAmount = reduceAmount;
	}

}
