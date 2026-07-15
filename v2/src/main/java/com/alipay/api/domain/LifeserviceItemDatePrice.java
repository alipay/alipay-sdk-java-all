package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活服务商品日期定价
 *
 * @author auto create
 * @since 1.0, 2026-03-31 15:02:06
 */
public class LifeserviceItemDatePrice extends AlipayObject {

	private static final long serialVersionUID = 5547339425468792346L;

	/**
	 * 结束日期。格式：yyyy-MM-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 一天中的结束时间。格式：HH:mm:ss
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
	 * 开始日期。格式：yyyy-MM-dd
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 一天中的开始时间。格式：HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
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

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
