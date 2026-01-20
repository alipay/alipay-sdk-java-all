package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentPayQueryBillInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.rent.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 16:02:42
 */
public class AlipayEbppIndustryRentBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6367719857252123493L;

	/** 
	 * null
	 */
	@ApiListField("user_bill_list")
	@ApiField("rent_pay_query_bill_info_response")
	private List<RentPayQueryBillInfoResponse> userBillList;

	public void setUserBillList(List<RentPayQueryBillInfoResponse> userBillList) {
		this.userBillList = userBillList;
	}
	public List<RentPayQueryBillInfoResponse> getUserBillList( ) {
		return this.userBillList;
	}

}
