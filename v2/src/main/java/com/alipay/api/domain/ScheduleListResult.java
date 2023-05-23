package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 排班任务列表
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:08:05
 */
public class ScheduleListResult extends AlipayObject {

	private static final long serialVersionUID = 1431556889289748549L;

	/**
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 结果
	 */
	@ApiListField("data")
	@ApiField("schedule_list_item")
	private List<ScheduleListItem> data;

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

	public List<ScheduleListItem> getData() {
		return this.data;
	}
	public void setData(List<ScheduleListItem> data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
