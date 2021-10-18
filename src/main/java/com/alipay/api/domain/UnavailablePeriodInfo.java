package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品不可用时段数据结构
 *
 * @author auto create
 * @since 1.0, 2017-09-21 12:59:25
 */
public class UnavailablePeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 3356767144425147477L;

	/**
	 * 商品不可用时段结束日期。格式为YYYY-MM-DD，如2017-05-03
	 */
	@ApiField("end_day")
	private String endDay;

	/**
	 * 商品不可用时段开始日期。格式为YYYY-MM-DD，如2017-05-01
	 */
	@ApiField("start_day")
	private String startDay;

	public String getEndDay() {
		return this.endDay;
	}
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}

	public String getStartDay() {
		return this.startDay;
	}
	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

}
