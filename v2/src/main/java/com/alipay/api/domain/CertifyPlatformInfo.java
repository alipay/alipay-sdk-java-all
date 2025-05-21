package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 认证平台信息
 *
 * @author auto create
 * @since 1.0, 2023-09-21 11:33:59
 */
public class CertifyPlatformInfo extends AlipayObject {

	private static final long serialVersionUID = 3696755129979897854L;

	/**
	 * 认证平台链接
	 */
	@ApiField("certify_platform_name")
	private String certifyPlatformName;

	/**
	 * 认证平台链接
	 */
	@ApiField("certify_platform_url")
	private String certifyPlatformUrl;

	public String getCertifyPlatformName() {
		return this.certifyPlatformName;
	}
	public void setCertifyPlatformName(String certifyPlatformName) {
		this.certifyPlatformName = certifyPlatformName;
	}

	public String getCertifyPlatformUrl() {
		return this.certifyPlatformUrl;
	}
	public void setCertifyPlatformUrl(String certifyPlatformUrl) {
		this.certifyPlatformUrl = certifyPlatformUrl;
	}

}
