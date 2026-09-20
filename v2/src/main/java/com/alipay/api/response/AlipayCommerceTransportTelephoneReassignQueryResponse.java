package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReassignNumberResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.telephone.reassign.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-26 11:02:51
 */
public class AlipayCommerceTransportTelephoneReassignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2845625823796691652L;

	/** 
	 * null
	 */
	@ApiListField("result_list")
	@ApiField("reassign_number_result")
	private List<ReassignNumberResult> resultList;

	public void setResultList(List<ReassignNumberResult> resultList) {
		this.resultList = resultList;
	}
	public List<ReassignNumberResult> getResultList( ) {
		return this.resultList;
	}

}
