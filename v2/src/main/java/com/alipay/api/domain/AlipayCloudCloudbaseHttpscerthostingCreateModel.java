package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新增Https证书
 *
 * @author auto create
 * @since 1.0, 2024-07-09 14:52:52
 */
public class AlipayCloudCloudbaseHttpscerthostingCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7784921399379378522L;

	/**
	 * acme需要的key列表
	 */
	@ApiListField("acme_key_configs")
	@ApiField("acme_key_config")
	private List<AcmeKeyConfig> acmeKeyConfigs;

	/**
	 * 小程序云应用ID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 证书描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 域名
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 域名服务商
 - aliyun
 - cloudflare
 - dnspod
 - godaddy
	 */
	@ApiField("domain_provider")
	private String domainProvider;

	/**
	 * 域名类型
 - FUNCTION
 - STATIC_SITE
	 */
	@ApiField("domain_type")
	private String domainType;

	/**
	 * 证书名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 托管是否开启
	 */
	@ApiField("open")
	private Boolean open;

	public List<AcmeKeyConfig> getAcmeKeyConfigs() {
		return this.acmeKeyConfigs;
	}
	public void setAcmeKeyConfigs(List<AcmeKeyConfig> acmeKeyConfigs) {
		this.acmeKeyConfigs = acmeKeyConfigs;
	}

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

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getDomainProvider() {
		return this.domainProvider;
	}
	public void setDomainProvider(String domainProvider) {
		this.domainProvider = domainProvider;
	}

	public String getDomainType() {
		return this.domainType;
	}
	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getOpen() {
		return this.open;
	}
	public void setOpen(Boolean open) {
		this.open = open;
	}

}
