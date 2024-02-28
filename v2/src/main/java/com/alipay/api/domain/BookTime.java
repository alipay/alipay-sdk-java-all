package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可预订时间段
 *
 * @author auto create
 * @since 1.0, 2019-05-16 10:38:41
 */
public class BookTime extends AlipayObject {

	private static final long serialVersionUID = 6374124226211167718L;

	/**
	 * 可预定时间段。格式： HH:mm:ss
	 */
	@ApiListField("time")
	@ApiField("string")
	private List<String> time;

	/**
	 * 可预订周几。如1表示周一；2：周二；3：周三；4：周四；5：周五；6：周六；7：周日
	 */
	@ApiField("week")
	private Long week;

	public List<String> getTime() {
		return this.time;
	}
	public void setTime(List<String> time) {
		this.time = time;
	}

	public Long getWeek() {
		return this.week;
	}
	public void setWeek(Long week) {
		this.week = week;
	}

}
