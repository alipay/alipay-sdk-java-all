package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertificateUseResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.certificate.certification.use response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-08 15:32:22
 */
public class AlipayMarketingCertificateCertificationUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6561859576829681272L;

	/** 
	 * 凭证核销结果
	 */
	@ApiListField("certificate_use_result_list")
	@ApiField("certificate_use_result")
	private List<CertificateUseResult> certificateUseResultList;

	public void setCertificateUseResultList(List<CertificateUseResult> certificateUseResultList) {
		this.certificateUseResultList = certificateUseResultList;
	}
	public List<CertificateUseResult> getCertificateUseResultList( ) {
		return this.certificateUseResultList;
	}

}
