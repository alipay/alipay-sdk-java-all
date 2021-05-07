package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场馆的产品购买限制规则信息
 *
 * @author auto create
 * @since 1.0, 2021-04-30 17:53:13
 */
public class ProductBuyLimitRule extends AlipayObject {

	private static final long serialVersionUID = 1548993416916636994L;

	/**
	 * 购买限制的类型，0-无需关联，1-需要关联，默认无需关联。 名词解释：票券课程类型商品的无需在意本字段，在价格日历预订下，代表是否需要时间段或场地的连场限制。
	 */
	@ApiField("can_buy_limit_type")
	private String canBuyLimitType;

	/**
	 * 一笔订单下产品最大购买数量，不传默认无限制。
	 */
	@ApiField("can_buy_max_count")
	private Long canBuyMaxCount;

	/**
	 * 一笔订单下产品最小购买数量，不传默认1
	 */
	@ApiField("can_buy_min_count")
	private Long canBuyMinCount;

	/**
	 * 最大选择数，默认无，价格日历产品下代表一笔订单最大可多选择N个分类(场地)，其他产品类型暂无意义
	 */
	@ApiField("category_choose_max_count")
	private Long categoryChooseMaxCount;

	/**
	 * 场馆最小选择数，默认1，价格日历产品下代表一笔订单至少选择可跨几个分类(场地)，其他产品类型暂无意义
	 */
	@ApiField("category_choose_min_count")
	private Long categoryChooseMinCount;

	/**
	 * 天可购买的最晚时间，大于这个时间则不可购买。
默认23点59分59秒
	 */
	@ApiField("daily_end_time")
	private String dailyEndTime;

	/**
	 * 每天可购买的最早时间，小于这个时间则不可购买。
默认0点0分0秒
	 */
	@ApiField("daily_start_time")
	private String dailyStartTime;

	public String getCanBuyLimitType() {
		return this.canBuyLimitType;
	}
	public void setCanBuyLimitType(String canBuyLimitType) {
		this.canBuyLimitType = canBuyLimitType;
	}

	public Long getCanBuyMaxCount() {
		return this.canBuyMaxCount;
	}
	public void setCanBuyMaxCount(Long canBuyMaxCount) {
		this.canBuyMaxCount = canBuyMaxCount;
	}

	public Long getCanBuyMinCount() {
		return this.canBuyMinCount;
	}
	public void setCanBuyMinCount(Long canBuyMinCount) {
		this.canBuyMinCount = canBuyMinCount;
	}

	public Long getCategoryChooseMaxCount() {
		return this.categoryChooseMaxCount;
	}
	public void setCategoryChooseMaxCount(Long categoryChooseMaxCount) {
		this.categoryChooseMaxCount = categoryChooseMaxCount;
	}

	public Long getCategoryChooseMinCount() {
		return this.categoryChooseMinCount;
	}
	public void setCategoryChooseMinCount(Long categoryChooseMinCount) {
		this.categoryChooseMinCount = categoryChooseMinCount;
	}

	public String getDailyEndTime() {
		return this.dailyEndTime;
	}
	public void setDailyEndTime(String dailyEndTime) {
		this.dailyEndTime = dailyEndTime;
	}

	public String getDailyStartTime() {
		return this.dailyStartTime;
	}
	public void setDailyStartTime(String dailyStartTime) {
		this.dailyStartTime = dailyStartTime;
	}

}
