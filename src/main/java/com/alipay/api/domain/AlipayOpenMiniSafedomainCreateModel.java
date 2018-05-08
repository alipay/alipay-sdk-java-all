package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序添加域白名单
 *
 * @author auto create
 * @since 1.0, 2017-12-20 11:12:34
 */
public class AlipayOpenMiniSafedomainCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3744331953789329332L;

	/**
	 * httpRequest域白名单
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
