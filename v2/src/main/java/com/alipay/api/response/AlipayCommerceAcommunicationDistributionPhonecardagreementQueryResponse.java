package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PhoneCardAgreementModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.phonecardagreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-08 11:47:17
 */
public class AlipayCommerceAcommunicationDistributionPhonecardagreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6554675346269435569L;

	/** 
	 * 号卡协议列表
	 */
	@ApiListField("agreement_list")
	@ApiField("phone_card_agreement_model")
	private List<PhoneCardAgreementModel> agreementList;

	/** 
	 * 协议id
	 */
	@ApiField("agreement_request_id")
	private String agreementRequestId;

	public void setAgreementList(List<PhoneCardAgreementModel> agreementList) {
		this.agreementList = agreementList;
	}
	public List<PhoneCardAgreementModel> getAgreementList( ) {
		return this.agreementList;
	}

	public void setAgreementRequestId(String agreementRequestId) {
		this.agreementRequestId = agreementRequestId;
	}
	public String getAgreementRequestId( ) {
		return this.agreementRequestId;
	}

}
