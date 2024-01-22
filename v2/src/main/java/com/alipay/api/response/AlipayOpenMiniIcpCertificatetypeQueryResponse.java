package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IcpCertificateTypeList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.icp.certificatetype.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 17:03:00
 */
public class AlipayOpenMiniIcpCertificatetypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2529821489394942145L;

	/** 
	 * 证件类型列表
	 */
	@ApiListField("certificate_types")
	@ApiField("icp_certificate_type_list")
	private List<IcpCertificateTypeList> certificateTypes;

	public void setCertificateTypes(List<IcpCertificateTypeList> certificateTypes) {
		this.certificateTypes = certificateTypes;
	}
	public List<IcpCertificateTypeList> getCertificateTypes( ) {
		return this.certificateTypes;
	}

}
