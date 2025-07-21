package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openapi超时测试
 *
 * @author auto create
 * @since 1.0, 2023-11-21 20:59:17
 */
public class AlipayOpenAppTimeoutTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2187767473199767236L;

	/**
	 * 秒
	 */
	@ApiField("time")
	private String time;

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
