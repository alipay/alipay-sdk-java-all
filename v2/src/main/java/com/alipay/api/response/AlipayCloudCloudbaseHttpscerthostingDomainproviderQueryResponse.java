package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertDomainProvider;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpscerthosting.domainprovider.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-06 16:22:02
 */
public class AlipayCloudCloudbaseHttpscerthostingDomainproviderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4337988851431184216L;

	/** 
	 * DNS服务提供商列表
	 */
	@ApiListField("providers")
	@ApiField("cert_domain_provider")
	private List<CertDomainProvider> providers;

	public void setProviders(List<CertDomainProvider> providers) {
		this.providers = providers;
	}
	public List<CertDomainProvider> getProviders( ) {
		return this.providers;
	}

}
