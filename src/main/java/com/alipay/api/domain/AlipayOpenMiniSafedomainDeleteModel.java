package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序删除域白名单
 *
 * @author auto create
 * @since 1.0, 2018-12-25 14:14:34
 */
public class AlipayOpenMiniSafedomainDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7276838497915865579L;

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
