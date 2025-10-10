package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基础http响应报文头部数据模型
 *
 * @author auto create
 * @since 1.0, 2020-04-03 14:12:07
 */
public class BaseOpenApiResponseHeaderDTO extends AlipayObject {

	private static final long serialVersionUID = 2193159314157925659L;

	/**
	 * http状态码
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
