package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报警生效时间配置
 *
 * @author auto create
 * @since 1.0, 2024-04-11 09:44:18
 */
public class AlarmTimeConfig extends AlipayObject {

	private static final long serialVersionUID = 2517687898732569636L;

	/**
	 * 生效开始时间(格式：HH:mm:dd)
	 */
	@ApiField("from")
	private String from;

	/**
	 * 时间类型
 - BY_DAY
 - BY_WEEK
	 */
	@ApiField("time_type")
	private String timeType;

	/**
	 * 生效结束时间(格式：HH:mm:dd)
	 */
	@ApiField("to")
	private String to;

	/**
	 * 每周几触发
	 */
	@ApiListField("weeks")
	@ApiField("number")
	private List<Long> weeks;

	public String getFrom() {
		return this.from;
	}
	public void setFrom(String from) {
		this.from = from;
	}

	public String getTimeType() {
		return this.timeType;
	}
	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

	public String getTo() {
		return this.to;
	}
	public void setTo(String to) {
		this.to = to;
	}

	public List<Long> getWeeks() {
		return this.weeks;
	}
	public void setWeeks(List<Long> weeks) {
		this.weeks = weeks;
	}

}
