package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班调度资源查询结果
 *
 * @author auto create
 * @since 1.0, 2020-05-07 15:30:21
 */
public class ScheduleResResult extends AlipayObject {

	private static final long serialVersionUID = 5252749616952838314L;

	/**
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 结果
	 */
	@ApiField("data")
	private ScheduleResItem data;

	/**
	 * 返回消息
	 */
	@ApiField("message")
	private String message;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public ScheduleResItem getData() {
		return this.data;
	}
	public void setData(ScheduleResItem data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
