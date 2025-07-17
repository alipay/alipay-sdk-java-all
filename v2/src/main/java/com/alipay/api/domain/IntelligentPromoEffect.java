package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销活动效果
 *
 * @author auto create
 * @since 1.0, 2017-10-10 18:45:21
 */
public class IntelligentPromoEffect extends AlipayObject {

	private static final long serialVersionUID = 4743281444481742465L;

	/**
	 * 平均客单价提升比例
	 */
	@ApiField("avg_prize_increase")
	private String avgPrizeIncrease;

	/**
	 * 成本
	 */
	@ApiField("cost")
	private String cost;

	/**
	 * 当前效益
	 */
	@ApiField("current_total_amount")
	private String currentTotalAmount;

	/**
	 * 营销活动的预期效果id
	 */
	@ApiField("effect_id")
	private String effectId;

	/**
	 * 时间范围左值
	 */
	@ApiField("gmt_from")
	private Date gmtFrom;

	/**
	 * 时间范围右值
	 */
	@ApiField("gmt_to")
	private Date gmtTo;

	/**
	 * 成交额
	 */
	@ApiField("gmv")
	private String gmv;

	/**
	 * 剩余库存数
	 */
	@ApiField("remain_stock_num")
	private Long remainStockNum;

	/**
	 * 复购率提升比例
	 */
	@ApiField("repay_rate_increase")
	private String repayRateIncrease;

	/**
	 * 发券量提升比例
	 */
	@ApiField("send_count_increase")
	private String sendCountIncrease;

	/**
	 * 发券数量
	 */
	@ApiField("take_count")
	private Long takeCount;

	/**
	 * 营销活动效果类型。FORECAST：预估；STATISTICS：统计
	 */
	@ApiField("type")
	private String type;

	/**
	 * 核销量
	 */
	@ApiField("use_count")
	private Long useCount;

	public String getAvgPrizeIncrease() {
		return this.avgPrizeIncrease;
	}
	public void setAvgPrizeIncrease(String avgPrizeIncrease) {
		this.avgPrizeIncrease = avgPrizeIncrease;
	}

	public String getCost() {
		return this.cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getCurrentTotalAmount() {
		return this.currentTotalAmount;
	}
	public void setCurrentTotalAmount(String currentTotalAmount) {
		this.currentTotalAmount = currentTotalAmount;
	}

	public String getEffectId() {
		return this.effectId;
	}
	public void setEffectId(String effectId) {
		this.effectId = effectId;
	}

	public Date getGmtFrom() {
		return this.gmtFrom;
	}
	public void setGmtFrom(Date gmtFrom) {
		this.gmtFrom = gmtFrom;
	}

	public Date getGmtTo() {
		return this.gmtTo;
	}
	public void setGmtTo(Date gmtTo) {
		this.gmtTo = gmtTo;
	}

	public String getGmv() {
		return this.gmv;
	}
	public void setGmv(String gmv) {
		this.gmv = gmv;
	}

	public Long getRemainStockNum() {
		return this.remainStockNum;
	}
	public void setRemainStockNum(Long remainStockNum) {
		this.remainStockNum = remainStockNum;
	}

	public String getRepayRateIncrease() {
		return this.repayRateIncrease;
	}
	public void setRepayRateIncrease(String repayRateIncrease) {
		this.repayRateIncrease = repayRateIncrease;
	}

	public String getSendCountIncrease() {
		return this.sendCountIncrease;
	}
	public void setSendCountIncrease(String sendCountIncrease) {
		this.sendCountIncrease = sendCountIncrease;
	}

	public Long getTakeCount() {
		return this.takeCount;
	}
	public void setTakeCount(Long takeCount) {
		this.takeCount = takeCount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Long getUseCount() {
		return this.useCount;
	}
	public void setUseCount(Long useCount) {
		this.useCount = useCount;
	}

}
