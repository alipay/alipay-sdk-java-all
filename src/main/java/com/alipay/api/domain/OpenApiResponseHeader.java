package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公用响应头
 *
 * @author auto create
 * @since 1.0, 2019-11-04 10:37:52
 */
public class OpenApiResponseHeader extends AlipayObject {

	private static final long serialVersionUID = 2745544528434367243L;

	/**
	 * 自定义状态码
	 */
	@ApiField("status_code")
	private String statusCode;

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

}
