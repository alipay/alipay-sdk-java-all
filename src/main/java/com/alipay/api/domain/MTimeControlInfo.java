package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动时间段限制对象
 *
 * @author auto create
 * @since 1.0, 2019-01-08 09:38:52
 */
public class MTimeControlInfo extends AlipayObject {

	private static final long serialVersionUID = 4376621775585867184L;

	/**
	 * 权益时间段限制周期类型，枚举值：按天：DAY、自然周：WEEK
	 */
	@ApiField("time_dimension_type")
	private String timeDimensionType;

	/**
	 * 时间值，该值只有time_dimension_type=WEEK时可用，指定时间段，例如每周一、周二、周日的06:00:00到20:04:59可用，设置值为“06:00:00,20:04:59”，多个时间区间，中间用“^”隔开,最多支持5段
	 */
	@ApiField("times")
	private String times;

	/**
	 * 维度所所对应的值，当time_dimension_type=WEEK时，values取值范围为1~7，分表代表周一到周日；而time_dimension_type=DAY，values取值示例为“2018-12-12,2018-12-22”，不支持"^"分隔，如需要设置多个日期时段，请设置多个时间组
	 */
	@ApiField("values")
	private String values;

	public String getTimeDimensionType() {
		return this.timeDimensionType;
	}
	public void setTimeDimensionType(String timeDimensionType) {
		this.timeDimensionType = timeDimensionType;
	}

	public String getTimes() {
		return this.times;
	}
	public void setTimes(String times) {
		this.times = times;
	}

	public String getValues() {
		return this.values;
	}
	public void setValues(String values) {
		this.values = values;
	}

}
