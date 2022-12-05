package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsCertificatePaginationList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.certificate.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-23 11:27:01
 */
public class AlipayInsMarketingCertificateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8392112128327696834L;

	/** 
	 * 分页查询结果
	 */
	@ApiField("ins_certificate_pagination_list")
	private InsCertificatePaginationList insCertificatePaginationList;

	public void setInsCertificatePaginationList(InsCertificatePaginationList insCertificatePaginationList) {
		this.insCertificatePaginationList = insCertificatePaginationList;
	}
	public InsCertificatePaginationList getInsCertificatePaginationList( ) {
		return this.insCertificatePaginationList;
	}

}
