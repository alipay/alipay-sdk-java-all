package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用数据上传响应
 *
 * @author auto create
 * @since 1.0, 2022-06-20 14:30:42
 */
public class CommerceDataUploadResponseData extends AlipayObject {

	private static final long serialVersionUID = 7469862538455991891L;

	/**
	 * 响应数据
	 */
	@ApiField("response")
	private String response;

	/**
	 * 时间戳
	 */
	@ApiField("time")
	private String time;

	public String getResponse() {
		return this.response;
	}
	public void setResponse(String response) {
		this.response = response;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
