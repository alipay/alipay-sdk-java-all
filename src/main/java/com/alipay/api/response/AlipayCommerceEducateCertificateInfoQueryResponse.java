package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StudentCertificate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.certificate.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-20 16:27:32
 */
public class AlipayCommerceEducateCertificateInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6562386124836295775L;

	/** 
	 * 证书列表
	 */
	@ApiListField("certificates")
	@ApiField("student_certificate")
	private List<StudentCertificate> certificates;

	public void setCertificates(List<StudentCertificate> certificates) {
		this.certificates = certificates;
	}
	public List<StudentCertificate> getCertificates( ) {
		return this.certificates;
	}

}
