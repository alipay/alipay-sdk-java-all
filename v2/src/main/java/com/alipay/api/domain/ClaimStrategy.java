package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赔付政策类型
 *
 * @author auto create
 * @since 1.0, 2020-07-08 17:06:59
 */
public class ClaimStrategy extends AlipayObject {

	private static final long serialVersionUID = 5348536759472151457L;

	/**
	 * 事故类型事故类型:
1:超时赔付
2:取消赔付
3:商家切自配送赔付
	 */
	@ApiField("accident_type")
	private String accidentType;

	/**
	 * 业务字段
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 常量:单位(分)
	 */
	@ApiField("constant")
	private Long constant;

	/**
	 * 赔付区间上限值
	 */
	@ApiField("end_section")
	private Long endSection;

	/**
	 * 最大赔付金额
	 */
	@ApiField("max_amount")
	private Long maxAmount;

	/**
	 * 赔付最小金额,单位:分
	 */
	@ApiField("min_amount")
	private Long minAmount;

	/**
	 * 价格赔付比例(小数点后两位)
	 */
	@ApiField("price_ratio")
	private Long priceRatio;

	/**
	 * 起配时间，单位:分钟
	 */
	@ApiField("start_compensation_time")
	private Long startCompensationTime;

	/**
	 * 赔付区间起始值
	 */
	@ApiField("start_section")
	private Long startSection;

	/**
	 * 时间赔付比例:小数点后2位
	 */
	@ApiField("time_ratio")
	private Long timeRatio;

	public String getAccidentType() {
		return this.accidentType;
	}
	public void setAccidentType(String accidentType) {
		this.accidentType = accidentType;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public Long getConstant() {
		return this.constant;
	}
	public void setConstant(Long constant) {
		this.constant = constant;
	}

	public Long getEndSection() {
		return this.endSection;
	}
	public void setEndSection(Long endSection) {
		this.endSection = endSection;
	}

	public Long getMaxAmount() {
		return this.maxAmount;
	}
	public void setMaxAmount(Long maxAmount) {
		this.maxAmount = maxAmount;
	}

	public Long getMinAmount() {
		return this.minAmount;
	}
	public void setMinAmount(Long minAmount) {
		this.minAmount = minAmount;
	}

	public Long getPriceRatio() {
		return this.priceRatio;
	}
	public void setPriceRatio(Long priceRatio) {
		this.priceRatio = priceRatio;
	}

	public Long getStartCompensationTime() {
		return this.startCompensationTime;
	}
	public void setStartCompensationTime(Long startCompensationTime) {
		this.startCompensationTime = startCompensationTime;
	}

	public Long getStartSection() {
		return this.startSection;
	}
	public void setStartSection(Long startSection) {
		this.startSection = startSection;
	}

	public Long getTimeRatio() {
		return this.timeRatio;
	}
	public void setTimeRatio(Long timeRatio) {
		this.timeRatio = timeRatio;
	}

}
