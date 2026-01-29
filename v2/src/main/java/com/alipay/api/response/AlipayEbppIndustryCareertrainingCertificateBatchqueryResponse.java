package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertificateObjects;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.certificate.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 13:32:36
 */
public class AlipayEbppIndustryCareertrainingCertificateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7585936952984943237L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("certificate_objects")
	private List<CertificateObjects> list;

	/** 
	 * 总个数
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<CertificateObjects> list) {
		this.list = list;
	}
	public List<CertificateObjects> getList( ) {
		return this.list;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
