package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班调度
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:19:47
 */
public class ScheduleConfigResult extends AlipayObject {

	private static final long serialVersionUID = 2648673782455331799L;

	/**
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 结果
	 */
	@ApiField("data")
	private ScheduleConfigItem data;

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

	public ScheduleConfigItem getData() {
		return this.data;
	}
	public void setData(ScheduleConfigItem data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
