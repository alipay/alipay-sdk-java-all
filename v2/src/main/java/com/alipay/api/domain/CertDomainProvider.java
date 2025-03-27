package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 域名服务提供商模型
 *
 * @author auto create
 * @since 1.0, 2024-06-06 16:20:17
 */
public class CertDomainProvider extends AlipayObject {

	private static final long serialVersionUID = 4671877639585929242L;

	/**
	 * acme需要的key列表
	 */
	@ApiListField("acme_key_configs")
	@ApiField("acme_key_config")
	private List<AcmeKeyConfig> acmeKeyConfigs;

	/**
	 * 服务提供商展示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 服务提供商名称
	 */
	@ApiField("name")
	private String name;

	public List<AcmeKeyConfig> getAcmeKeyConfigs() {
		return this.acmeKeyConfigs;
	}
	public void setAcmeKeyConfigs(List<AcmeKeyConfig> acmeKeyConfigs) {
		this.acmeKeyConfigs = acmeKeyConfigs;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
