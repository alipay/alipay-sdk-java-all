package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活服务商品星期x定价
 *
 * @author auto create
 * @since 1.0, 2026-03-31 15:02:07
 */
public class LifeserviceItemWeekPrice extends AlipayObject {

	private static final long serialVersionUID = 5425769471468241131L;

	/**
	 * 周一到周日列表 分别对应"1"、"2"..."7" 可用时间范围 必填该字段
	 */
	@ApiListField("days_of_week")
	@ApiField("string")
	private List<String> daysOfWeek;

	/**
	 * 结束时间。格式：HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 当日可用还是次日可用 SAME_DAY代表开始时间和结束时间在同一天内 NEXT_DAY代表结束时间在开始时间的第二天 必填
	 */
	@ApiField("end_time_type")
	private String endTimeType;

	/**
	 * 原价。单位分
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 售价。单位分
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 开始时间。格式：HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	public List<String> getDaysOfWeek() {
		return this.daysOfWeek;
	}
	public void setDaysOfWeek(List<String> daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndTimeType() {
		return this.endTimeType;
	}
	public void setEndTimeType(String endTimeType) {
		this.endTimeType = endTimeType;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
