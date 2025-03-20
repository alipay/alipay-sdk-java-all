package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:07:21
 */
public class ScheduleShiftResult extends AlipayObject {

	private static final long serialVersionUID = 1547858931891599192L;

	/**
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 结果
	 */
	@ApiListField("data")
	@ApiField("schedule_shift_item")
	private List<ScheduleShiftItem> data;

	/**
	 * 结果描述
	 */
	@ApiField("message")
	private String message;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<ScheduleShiftItem> getData() {
		return this.data;
	}
	public void setData(List<ScheduleShiftItem> data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
