package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentPayQueryUserSignInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.rent.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 16:01:20
 */
public class AlipayEbppIndustryRentSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3839448217136362279L;

	/** 
	 * null
	 */
	@ApiListField("sign_info_list")
	@ApiField("rent_pay_query_user_sign_info_response")
	private List<RentPayQueryUserSignInfoResponse> signInfoList;

	public void setSignInfoList(List<RentPayQueryUserSignInfoResponse> signInfoList) {
		this.signInfoList = signInfoList;
	}
	public List<RentPayQueryUserSignInfoResponse> getSignInfoList( ) {
		return this.signInfoList;
	}

}
