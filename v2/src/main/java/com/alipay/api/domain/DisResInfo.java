package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 执行结果，action 为 REJECT 或 FAIL 时必填
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:17:56
 */
public class DisResInfo extends AlipayObject {

	private static final long serialVersionUID = 4117494539194663898L;

	/**
	 * 业务自定义结构化数据，不同 action 可携带不同业务数据
	 */
	@ApiField("data")
	private DataInfo data;

	/**
	 * 反馈文案，如完结时填写处理结果说明，拒绝时填写拒绝原因
	 */
	@ApiField("message")
	private String message;

	public DataInfo getData() {
		return this.data;
	}
	public void setData(DataInfo data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
