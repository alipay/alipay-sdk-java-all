package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 奖品使用信息
 *
 * @author auto create
 * @since 1.0, 2016-03-28 13:46:02
 */
public class PrizeUseDto extends AlipayObject {

	private static final long serialVersionUID = 4692435258531588877L;

	/**
	 * 1
	 */
	@ApiField("discount_sku_num")
	private String discountSkuNum;

	/**
	 * 结束时间
	 */
	@ApiField("prize_end_time")
	private String prizeEndTime;

	/**
	 * 开始时间
	 */
	@ApiField("prize_start_time")
	private String prizeStartTime;

	/**
	 * 奖品适用门店
	 */
	@ApiListField("prize_suitable_shops")
	@ApiField("string")
	private List<String> prizeSuitableShops;

	/**
	 * 奖品sku
	 */
	@ApiListField("prize_suitable_sku")
	@ApiField("string")
	private List<String> prizeSuitableSku;

	/**
	 * FIX
	 */
	@ApiField("prize_use_time_mode")
	private String prizeUseTimeMode;

	/**
	 * 单品最低消费个数
	 */
	@ApiField("threshold_each_sku_num")
	private String thresholdEachSkuNum;

	/**
	 * 订单金额
	 */
	@ApiField("threshold_order_amount")
	private String thresholdOrderAmount;

	/**
	 * 核销方式
	 */
	@ApiListField("use_mode")
	@ApiField("string")
	private List<String> useMode;

	public String getDiscountSkuNum() {
		return this.discountSkuNum;
	}
	public void setDiscountSkuNum(String discountSkuNum) {
		this.discountSkuNum = discountSkuNum;
	}

	public String getPrizeEndTime() {
		return this.prizeEndTime;
	}
	public void setPrizeEndTime(String prizeEndTime) {
		this.prizeEndTime = prizeEndTime;
	}

	public String getPrizeStartTime() {
		return this.prizeStartTime;
	}
	public void setPrizeStartTime(String prizeStartTime) {
		this.prizeStartTime = prizeStartTime;
	}

	public List<String> getPrizeSuitableShops() {
		return this.prizeSuitableShops;
	}
	public void setPrizeSuitableShops(List<String> prizeSuitableShops) {
		this.prizeSuitableShops = prizeSuitableShops;
	}

	public List<String> getPrizeSuitableSku() {
		return this.prizeSuitableSku;
	}
	public void setPrizeSuitableSku(List<String> prizeSuitableSku) {
		this.prizeSuitableSku = prizeSuitableSku;
	}

	public String getPrizeUseTimeMode() {
		return this.prizeUseTimeMode;
	}
	public void setPrizeUseTimeMode(String prizeUseTimeMode) {
		this.prizeUseTimeMode = prizeUseTimeMode;
	}

	public String getThresholdEachSkuNum() {
		return this.thresholdEachSkuNum;
	}
	public void setThresholdEachSkuNum(String thresholdEachSkuNum) {
		this.thresholdEachSkuNum = thresholdEachSkuNum;
	}

	public String getThresholdOrderAmount() {
		return this.thresholdOrderAmount;
	}
	public void setThresholdOrderAmount(String thresholdOrderAmount) {
		this.thresholdOrderAmount = thresholdOrderAmount;
	}

	public List<String> getUseMode() {
		return this.useMode;
	}
	public void setUseMode(List<String> useMode) {
		this.useMode = useMode;
	}

}
