package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertificateQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.certificate.certification.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-15 17:37:36
 */
public class AlipayMarketingCertificateCertificationBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2566639652855247538L;

	/** 
	 * 凭证信息列表
	 */
	@ApiListField("certificate_info_list")
	@ApiField("certificate_query_info")
	private List<CertificateQueryInfo> certificateInfoList;

	public void setCertificateInfoList(List<CertificateQueryInfo> certificateInfoList) {
		this.certificateInfoList = certificateInfoList;
	}
	public List<CertificateQueryInfo> getCertificateInfoList( ) {
		return this.certificateInfoList;
	}

}
