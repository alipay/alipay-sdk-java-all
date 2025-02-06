package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班调度任务提交结果返回
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:56:34
 */
public class CloudbusCommonResult extends AlipayObject {

	private static final long serialVersionUID = 6128942329985982795L;

	/**
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 数据字符
	 */
	@ApiField("data")
	private String data;

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

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
