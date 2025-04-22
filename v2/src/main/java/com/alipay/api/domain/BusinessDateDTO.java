package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营业时间结构体
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:36
 */
public class BusinessDateDTO extends AlipayObject {

	private static final long serialVersionUID = 5335643434776334838L;

	/**
	 * 周营业日，举例：每周一、三、五营业，则此值传["1", "3", "5"]
	 */
	@ApiListField("week_day")
	@ApiField("string")
	private List<String> weekDay;

	/**
	 * 每日的营业时间范围，比如营业时间为09:00-23:59,00:00-04:00，则传["09:00-23:59", "00:00-04:00"]
	 */
	@ApiListField("work_time")
	@ApiField("string")
	private List<String> workTime;

	public List<String> getWeekDay() {
		return this.weekDay;
	}
	public void setWeekDay(List<String> weekDay) {
		this.weekDay = weekDay;
	}

	public List<String> getWorkTime() {
		return this.workTime;
	}
	public void setWorkTime(List<String> workTime) {
		this.workTime = workTime;
	}

}
