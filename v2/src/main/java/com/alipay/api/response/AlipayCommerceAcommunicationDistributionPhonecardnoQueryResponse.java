package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PhoneCardNumberModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.phonecardno.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-08 11:42:17
 */
public class AlipayCommerceAcommunicationDistributionPhonecardnoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6199574963825538778L;

	/** 
	 * 号卡手机号列表
	 */
	@ApiListField("phone_card_number_list")
	@ApiField("phone_card_number_model")
	private List<PhoneCardNumberModel> phoneCardNumberList;

	public void setPhoneCardNumberList(List<PhoneCardNumberModel> phoneCardNumberList) {
		this.phoneCardNumberList = phoneCardNumberList;
	}
	public List<PhoneCardNumberModel> getPhoneCardNumberList( ) {
		return this.phoneCardNumberList;
	}

}
