package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HttpsDomainCertHistory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpscerthosting.history.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 11:08:45
 */
public class AlipayCloudCloudbaseHttpscerthostingHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1811587797488667371L;

	/** 
	 * Https证书历史列表
	 */
	@ApiListField("historys")
	@ApiField("https_domain_cert_history")
	private List<HttpsDomainCertHistory> historys;

	public void setHistorys(List<HttpsDomainCertHistory> historys) {
		this.historys = historys;
	}
	public List<HttpsDomainCertHistory> getHistorys( ) {
		return this.historys;
	}

}
