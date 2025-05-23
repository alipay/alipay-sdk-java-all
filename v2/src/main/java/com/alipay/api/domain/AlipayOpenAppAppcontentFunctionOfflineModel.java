package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序服务失效
 *
 * @author auto create
 * @since 1.0, 2025-01-03 11:02:40
 */
public class AlipayOpenAppAppcontentFunctionOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 5145694667492423477L;

	/**
	 * 服务编码，通过 <a href="https://opendocs.alipay.com/apis/011agl">alipay.open.app.appcontent.function.create</a>(小程序服务创建)接口创建服务后获取。
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
