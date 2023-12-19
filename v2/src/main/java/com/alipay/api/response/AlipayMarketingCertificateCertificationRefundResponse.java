package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertificateReverseResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.certificate.certification.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-18 11:11:55
 */
public class AlipayMarketingCertificateCertificationRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4136824452469453739L;

	/** 
	 * 撤销核销结果列表
	 */
	@ApiListField("certificate_reverse_result_list")
	@ApiField("certificate_reverse_result")
	private List<CertificateReverseResult> certificateReverseResultList;

	public void setCertificateReverseResultList(List<CertificateReverseResult> certificateReverseResultList) {
		this.certificateReverseResultList = certificateReverseResultList;
	}
	public List<CertificateReverseResult> getCertificateReverseResultList( ) {
		return this.certificateReverseResultList;
	}

}
