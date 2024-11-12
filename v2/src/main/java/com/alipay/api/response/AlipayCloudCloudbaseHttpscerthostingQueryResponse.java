package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HttpsDomainCert;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpscerthosting.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-06 16:20:24
 */
public class AlipayCloudCloudbaseHttpscerthostingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6292288958248471818L;

	/** 
	 * Https证书列表
	 */
	@ApiListField("domains")
	@ApiField("https_domain_cert")
	private List<HttpsDomainCert> domains;

	public void setDomains(List<HttpsDomainCert> domains) {
		this.domains = domains;
	}
	public List<HttpsDomainCert> getDomains( ) {
		return this.domains;
	}

}
