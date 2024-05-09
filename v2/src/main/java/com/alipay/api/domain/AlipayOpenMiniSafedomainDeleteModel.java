package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序删除域白名单
 *
 * @author auto create
 * @since 1.0, 2024-05-06 10:32:59
 */
public class AlipayOpenMiniSafedomainDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4535891691136742825L;

	/**
	 * 服务器域名白名单。支付宝小程序在HTTP请求、上传文件等场景只能与域名白名单中的域名进行通讯 。
删除域白名单后需重新上传应用版本（模板模式下小程序模板及商家应用都需重新上传、实例化版本）才会生效。老版本应用继续使用老版本名单（即删除域名可继续使用）。
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
