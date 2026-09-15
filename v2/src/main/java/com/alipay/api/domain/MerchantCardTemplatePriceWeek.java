package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 星期固定价规则
 *
 * @author auto create
 * @since 1.0, 2026-09-08 19:08:47
 */
public class MerchantCardTemplatePriceWeek extends AlipayObject {

	private static final long serialVersionUID = 4496616113465681635L;

	/**
	 * 适用的星期列表，1至7分别表示周一至周日。
	 */
	@ApiListField("days_of_week")
	@ApiField("string")
	private List<String> daysOfWeek;

	/**
	 * 每天价格时段的结束时间，格式为HH:mm:ss。
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 结束时间与开始时间在同一天或次日。
	 */
	@ApiField("end_time_type")
	private String endTimeType;

	/**
	 * 该时段原价，单位为分；如传入，不得小于售价。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 该时段售价，单位为分。
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 每天价格时段的开始时间，格式为HH:mm:ss。
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
