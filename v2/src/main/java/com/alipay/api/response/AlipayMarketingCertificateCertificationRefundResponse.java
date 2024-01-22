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
 * @since 1.0, 2024-01-19 15:51:58
 */
public class AlipayMarketingCertificateCertificationRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7616678755613486696L;

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
