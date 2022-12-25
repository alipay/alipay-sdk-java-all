package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AgreementDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.instantdelivery.merchantagreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-06 17:50:44
 */
public class AlipayOpenInstantdeliveryMerchantagreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4587164796312674385L;

	/** 
	 * 物流代扣协议的详细内容
	 */
	@ApiField("agreement_detail")
	private AgreementDetail agreementDetail;

	public void setAgreementDetail(AgreementDetail agreementDetail) {
		this.agreementDetail = agreementDetail;
	}
	public AgreementDetail getAgreementDetail( ) {
		return this.agreementDetail;
	}

}
