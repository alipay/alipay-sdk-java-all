package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加路由绑定
 *
 * @author auto create
 * @since 1.0, 2023-08-08 23:36:27
 */
public class AlipayCloudCloudbaseHttpaccessBindCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2384936634938826646L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 域名
	 */
	@ApiField("domain_name")
	private String domainName;

	/**
	 * 函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 触发路径
	 */
	@ApiField("path")
	private String path;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getDomainName() {
		return this.domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}
