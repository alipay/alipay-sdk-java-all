package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场馆的产品购买限制规则信息
 *
 * @author auto create
 * @since 1.0, 2021-05-13 11:44:37
 */
public class ProductBuyLimitRule extends AlipayObject {

	private static final long serialVersionUID = 1873726548792157553L;

	/**
	 * 购买时间限制，商品可下单的时间范围，为“可购买开始时间-可购买截止时间”时间段列表。全天可购买时可以不传值或者传["00:00:00-23:59:59"]；全天不可购买时传值["00:00:00-00:00:00"]。每个时间段内截止时间不能早于开始时间，多个时间段相互不能重合，如果传值错误会导致商品信息无法正常展示而被隐藏。
	 */
	@ApiListField("buy_time_limit")
	@ApiField("string")
	private List<String> buyTimeLimit;

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
	 * （已废弃，无效）可购买截止时间，当前时间大于这个时间用户不能下单。
如果全天可下单，可购买开始和截止时间可以为空或者为00:00:00 - 23:59:59；如果全天不可下单，可购买开始时间(daily_start_time)和可购买截止时间(daily_end_time)均为00:00:00。
	 */
	@ApiField("daily_end_time")
	private String dailyEndTime;

	/**
	 * （已废弃，无效）可购买开始时间，当前时间小于这个时间用户不能下单。
默认00:00:00
	 */
	@ApiField("daily_start_time")
	private String dailyStartTime;

	public List<String> getBuyTimeLimit() {
		return this.buyTimeLimit;
	}
	public void setBuyTimeLimit(List<String> buyTimeLimit) {
		this.buyTimeLimit = buyTimeLimit;
	}

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
