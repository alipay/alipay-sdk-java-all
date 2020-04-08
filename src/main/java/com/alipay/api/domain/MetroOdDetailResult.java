package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2020-04-01 14:49:36
 */
public class MetroOdDetailResult extends AlipayObject {

	private static final long serialVersionUID = 4834734826249689563L;

	/**
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 结果
	 */
	@ApiField("data")
	private MetroOdItem data;

	/**
	 * 消息描述
	 */
	@ApiField("message")
	private String message;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public MetroOdItem getData() {
		return this.data;
	}
	public void setData(MetroOdItem data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
