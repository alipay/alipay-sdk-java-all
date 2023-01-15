package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreditBankCertificateExperience;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.creditbank.certificate.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-30 17:58:41
 */
public class AlipayCommerceEducateCreditbankCertificateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2152913553479477442L;

	/** 
	 * 获得证书信息
	 */
	@ApiListField("certificates")
	@ApiField("credit_bank_certificate_experience")
	private List<CreditBankCertificateExperience> certificates;

	public void setCertificates(List<CreditBankCertificateExperience> certificates) {
		this.certificates = certificates;
	}
	public List<CreditBankCertificateExperience> getCertificates( ) {
		return this.certificates;
	}

}
