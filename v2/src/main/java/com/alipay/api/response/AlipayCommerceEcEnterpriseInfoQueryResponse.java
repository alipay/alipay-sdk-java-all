package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EnterpriseInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-04 17:17:28
 */
public class AlipayCommerceEcEnterpriseInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1828519123766354894L;

	/** 
	 * 企业信息
	 */
	@ApiField("enterprise_info")
	private EnterpriseInfoDTO enterpriseInfo;

	public void setEnterpriseInfo(EnterpriseInfoDTO enterpriseInfo) {
		this.enterpriseInfo = enterpriseInfo;
	}
	public EnterpriseInfoDTO getEnterpriseInfo( ) {
		return this.enterpriseInfo;
	}

}
