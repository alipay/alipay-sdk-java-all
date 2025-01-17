package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序添加域白名单
 *
 * @author auto create
 * @since 1.0, 2023-12-07 14:05:17
 */
public class AlipayOpenMiniSafedomainCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3898363235567722658L;

	/**
	 * 服务器域名白名单。支付宝小程序在HTTP请求、上传文件等场景只能与域名白名单中的域名进行通讯 。
新添加域白名单后需重新上传应用版本（模板模式下小程序模板及商家应用都需重新上传、实例化版本）才会生效。老版本应用继续使用老版本名单。
每个应用最多可添加30个 URL。
	 */
	@ApiField("safe_domain")
	private String safeDomain;

	public String getSafeDomain() {
		return this.safeDomain;
	}
	public void setSafeDomain(String safeDomain) {
		this.safeDomain = safeDomain;
	}

}
