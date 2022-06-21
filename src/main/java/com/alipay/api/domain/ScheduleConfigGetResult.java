package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:19:31
 */
public class ScheduleConfigGetResult extends AlipayObject {

	private static final long serialVersionUID = 1171732692449264348L;

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
