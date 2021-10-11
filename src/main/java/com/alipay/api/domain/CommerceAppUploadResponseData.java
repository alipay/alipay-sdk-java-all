package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回主体
 *
 * @author auto create
 * @since 1.0, 2021-07-02 15:22:42
 */
public class CommerceAppUploadResponseData extends AlipayObject {

	private static final long serialVersionUID = 4783248131556595548L;

	/**
	 * 返回主体中具体内容
	 */
	@ApiField("response")
	private String response;

	/**
	 * 系统时间
	 */
	@ApiField("time")
	private Long time;

	public String getResponse() {
		return this.response;
	}
	public void setResponse(String response) {
		this.response = response;
	}

	public Long getTime() {
		return this.time;
	}
	public void setTime(Long time) {
		this.time = time;
	}

}
