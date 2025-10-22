package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 荣耀授信产品信息
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:26:23
 */
public class HonorProductInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4259124295254889229L;

	/**
	 * 年利率, 示例: 23.4 【即23.4%】
	 */
	@ApiField("apr")
	private String apr;

	/**
	 * 日利率, 示例: 0.065 【即0.065%】
	 */
	@ApiField("day_rate")
	private String dayRate;

	/**
	 * 是否可提前还款(默认true)
	 */
	@ApiField("early_repay")
	private Boolean earlyRepay;

	/**
	 * 还款方式，枚举值：1-等额本息(灵活还)，2-等额本金(灵活还)，3-先息后本(灵活还)，4-等额本息(按期还)
	 */
	@ApiField("repay_method")
	private Long repayMethod;

	/**
	 * 临价年利率,示例:23.4 【即23.4%】,临价时需返回
	 */
	@ApiField("temp_apr")
	private String tempApr;

	/**
	 * 临价日利率, 示例: 0.065 【即0.065%】, 临价时需返回
	 */
	@ApiField("temp_day_rate")
	private String tempDayRate;

	/**
	 * 临价截止时间, 示例: 2020-07-0222:22:00, 临价时需返回
	 */
	@ApiField("temp_price_due_time")
	private String tempPriceDueTime;

	/**
	 * 期数列表
	 */
	@ApiListField("term_nums")
	@ApiField("number")
	private List<Long> termNums;

	public String getApr() {
		return this.apr;
	}
	public void setApr(String apr) {
		this.apr = apr;
	}

	public String getDayRate() {
		return this.dayRate;
	}
	public void setDayRate(String dayRate) {
		this.dayRate = dayRate;
	}

	public Boolean getEarlyRepay() {
		return this.earlyRepay;
	}
	public void setEarlyRepay(Boolean earlyRepay) {
		this.earlyRepay = earlyRepay;
	}

	public Long getRepayMethod() {
		return this.repayMethod;
	}
	public void setRepayMethod(Long repayMethod) {
		this.repayMethod = repayMethod;
	}

	public String getTempApr() {
		return this.tempApr;
	}
	public void setTempApr(String tempApr) {
		this.tempApr = tempApr;
	}

	public String getTempDayRate() {
		return this.tempDayRate;
	}
	public void setTempDayRate(String tempDayRate) {
		this.tempDayRate = tempDayRate;
	}

	public String getTempPriceDueTime() {
		return this.tempPriceDueTime;
	}
	public void setTempPriceDueTime(String tempPriceDueTime) {
		this.tempPriceDueTime = tempPriceDueTime;
	}

	public List<Long> getTermNums() {
		return this.termNums;
	}
	public void setTermNums(List<Long> termNums) {
		this.termNums = termNums;
	}

}
