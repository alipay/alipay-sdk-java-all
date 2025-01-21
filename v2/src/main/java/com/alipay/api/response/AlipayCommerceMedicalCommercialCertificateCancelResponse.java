package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MemberCardCertificateDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.certificate.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-18 18:51:05
 */
public class AlipayCommerceMedicalCommercialCertificateCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5778193723287664164L;

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
