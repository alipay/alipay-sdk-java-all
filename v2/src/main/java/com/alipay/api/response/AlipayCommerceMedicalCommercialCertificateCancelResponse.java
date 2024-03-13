package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MemberCardCertificateDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.certificate.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-13 10:19:16
 */
public class AlipayCommerceMedicalCommercialCertificateCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8354598597997431862L;

	/** 
	 * 是否取消成功
	 */
	@ApiField("cancel_result")
	private Boolean cancelResult;

	/** 
	 * 凭证详情
	 */
	@ApiField("certificate_detail")
	private MemberCardCertificateDetail certificateDetail;

	public void setCancelResult(Boolean cancelResult) {
		this.cancelResult = cancelResult;
	}
	public Boolean getCancelResult( ) {
		return this.cancelResult;
	}

	public void setCertificateDetail(MemberCardCertificateDetail certificateDetail) {
		this.certificateDetail = certificateDetail;
	}
	public MemberCardCertificateDetail getCertificateDetail( ) {
		return this.certificateDetail;
	}

}
