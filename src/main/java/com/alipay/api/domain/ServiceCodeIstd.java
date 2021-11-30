package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即时配送公司服务代码
 *
 * @author auto create
 * @since 1.0, 2020-09-22 16:26:31
 */
public class ServiceCodeIstd extends AlipayObject {

	private static final long serialVersionUID = 2535274839189623438L;

	/**
	 * 即时配送公司服务代码
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
