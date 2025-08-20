package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨域安全域名列表
 *
 * @author auto create
 * @since 1.0, 2023-08-21 20:50:52
 */
public class CorsDomain extends AlipayObject {

	private static final long serialVersionUID = 2633263216952869173L;

	/**
	 * 域名
	 */
	@ApiField("domain_name")
	private String domainName;

	public String getDomainName() {
		return this.domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

}
