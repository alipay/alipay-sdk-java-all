package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EnterpriseInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-12 14:02:16
 */
public class AlipayCommerceEcEnterpriseInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1764468187499186472L;

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
