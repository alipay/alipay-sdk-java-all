package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证书域名模型
 *
 * @author auto create
 * @since 1.0, 2024-06-06 16:20:24
 */
public class HttpsDomainCert extends AlipayObject {

	private static final long serialVersionUID = 4517827398419979746L;

	/**
	 * 证书到期时间
	 */
	@ApiField("cert_expiration_time")
	private String certExpirationTime;

	/**
	 * 证书注册时间
	 */
	@ApiField("cert_sign_time")
	private String certSignTime;

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
	 * 域名状态
 - DOMAIN_UNVALID
 - CERT_INIT
 - CERT_SUCCESS
	 */
	@ApiField("domain_status")
	private String domainStatus;

	/**
	 * 域名类型
	 */
	@ApiField("domain_type")
	private String domainType;

	/**
	 * https证书ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 证书名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 证书托管是否开启
	 */
	@ApiField("open")
	private Boolean open;

	public String getCertExpirationTime() {
		return this.certExpirationTime;
	}
	public void setCertExpirationTime(String certExpirationTime) {
		this.certExpirationTime = certExpirationTime;
	}

	public String getCertSignTime() {
		return this.certSignTime;
	}
	public void setCertSignTime(String certSignTime) {
		this.certSignTime = certSignTime;
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

	public String getDomainStatus() {
		return this.domainStatus;
	}
	public void setDomainStatus(String domainStatus) {
		this.domainStatus = domainStatus;
	}

	public String getDomainType() {
		return this.domainType;
	}
	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
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
