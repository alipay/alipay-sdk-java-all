package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MemberCardCertificateDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.certificate.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-18 18:50:35
 */
public class AlipayCommerceMedicalCommercialCertificateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5868132146463977817L;

	/** 
	 * 凭证详情列表
	 */
	@ApiListField("certificate_details")
	@ApiField("member_card_certificate_detail")
	private List<MemberCardCertificateDetail> certificateDetails;

	/** 
	 * 凭证条数
	 */
	@ApiField("total")
	private Long total;

	public void setCertificateDetails(List<MemberCardCertificateDetail> certificateDetails) {
		this.certificateDetails = certificateDetails;
	}
	public List<MemberCardCertificateDetail> getCertificateDetails( ) {
		return this.certificateDetails;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
