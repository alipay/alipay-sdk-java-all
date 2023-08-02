package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 按天折扣信息
 *
 * @author auto create
 * @since 1.0, 2018-02-07 12:00:22
 */
public class DiscountByDayModel extends AlipayObject {

	private static final long serialVersionUID = 5468215154735471728L;

	/**
	 * 开始天数，最小为1
	 */
	@ApiField("begin_day")
	private Long beginDay;

	/**
	 * 相对折扣，保留小数点2位
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 结束天数
	 */
	@ApiField("end_day")
	private Long endDay;

	public Long getBeginDay() {
		return this.beginDay;
	}
	public void setBeginDay(Long beginDay) {
		this.beginDay = beginDay;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public Long getEndDay() {
		return this.endDay;
	}
	public void setEndDay(Long endDay) {
		this.endDay = endDay;
	}

}
