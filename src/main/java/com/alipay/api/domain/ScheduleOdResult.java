package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 排班调度客流结果
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:20:07
 */
public class ScheduleOdResult extends AlipayObject {

	private static final long serialVersionUID = 4589287778569424622L;

	/**
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 结果列表
	 */
	@ApiListField("data")
	@ApiField("schedule_od_item")
	private List<ScheduleOdItem> data;

	/**
	 * 返回状态描述
	 */
	@ApiField("message")
	private String message;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<ScheduleOdItem> getData() {
		return this.data;
	}
	public void setData(List<ScheduleOdItem> data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
