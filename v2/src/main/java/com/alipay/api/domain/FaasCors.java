package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨域安全域名列表
 *
 * @author auto create
 * @since 1.0, 2023-08-08 23:05:37
 */
public class FaasCors extends AlipayObject {

	private static final long serialVersionUID = 1223678784577757495L;

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
