package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EnterpriseAgreementDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-30 17:53:16
 */
public class AlipayCommerceEcEnterpriseAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6777255492189568665L;

	/** 
	 * 企业签约信息
	 */
	@ApiField("enterprise_agreement_dto")
	private EnterpriseAgreementDTO enterpriseAgreementDto;

	public void setEnterpriseAgreementDto(EnterpriseAgreementDTO enterpriseAgreementDto) {
		this.enterpriseAgreementDto = enterpriseAgreementDto;
	}
	public EnterpriseAgreementDTO getEnterpriseAgreementDto( ) {
		return this.enterpriseAgreementDto;
	}

}
