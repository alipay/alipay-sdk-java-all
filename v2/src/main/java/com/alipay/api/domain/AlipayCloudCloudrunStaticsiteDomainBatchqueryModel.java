package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询域名列表
 *
 * @author auto create
 * @since 1.0, 2023-08-03 16:06:42
 */
public class AlipayCloudCloudrunStaticsiteDomainBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4619269287696921483L;

	/**
	 * 内部使用，uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 域名。输入你的自定义域名精确查找。
	 */
	@ApiField("domain_name")
	private String domainName;

	/**
	 * 域名类型。默认域名为系统自动分配的域名，自定义域名为你自己添加的自定义域名。
	 */
	@ApiField("domain_type")
	private String domainType;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
	}

	public String getDomainName() {
		return this.domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDomainType() {
		return this.domainType;
	}
	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

}
