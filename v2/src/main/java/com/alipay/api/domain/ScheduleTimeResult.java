package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2020-03-02 15:54:57
 */
public class ScheduleTimeResult extends AlipayObject {

	private static final long serialVersionUID = 8459256871218846787L;

	/**
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 结果
	 */
	@ApiListField("data")
	@ApiField("schedule_time_item")
	private List<ScheduleTimeItem> data;

	/**
	 * 返回码描述
	 */
	@ApiField("message")
	private String message;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<ScheduleTimeItem> getData() {
		return this.data;
	}
	public void setData(List<ScheduleTimeItem> data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
