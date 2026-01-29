package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 店铺营业时间
 *
 * @author auto create
 * @since 1.0, 2020-11-25 10:05:51
 */
public class BusinessHour extends AlipayObject {

	private static final long serialVersionUID = 1167659575372338585L;

	/**
	 * 营业截止日期。使用星期值枚举
MON : 星期一;TUE : 星期二;WED : 星期三;THU : 星期四;FRI : 星期五;SAT : 星期六;SUN : 星期天
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 店铺营业时间段列表,示例:[{"start_date":"13:00","end_date":"14:00"},{"start_date":"17:00","end_date":"18:00"}]
	 */
	@ApiListField("hour_items")
	@ApiField("business_hour_item")
	private List<BusinessHourItem> hourItems;

	/**
	 * 营业开始日期。使用星期值枚举
MON : 星期一;TUE : 星期二;WED : 星期三;THU : 星期四;FRI : 星期五;SAT : 星期六;SUN : 星期天
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<BusinessHourItem> getHourItems() {
		return this.hourItems;
	}
	public void setHourItems(List<BusinessHourItem> hourItems) {
		this.hourItems = hourItems;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
