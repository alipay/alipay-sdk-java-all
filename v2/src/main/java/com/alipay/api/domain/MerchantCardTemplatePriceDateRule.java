package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-31 11:12:49
 */
public class MerchantCardTemplatePriceDateRule extends AlipayObject {

	private static final long serialVersionUID = 6792381742849628315L;

	/**
	 * 日期价格规则结束日期，格式为yyyy-MM-dd，不能早于开始日期。
	 */
	@ApiField("end_date")
	private String endDate;

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
	 * 日期价格规则开始日期，格式为yyyy-MM-dd。
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 每天价格时段的开始时间，格式为HH:mm:ss。
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
