package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserIncomeQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.userincome.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 14:27:45
 */
public class AnttechOceanbaseObglobalUserincomeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5839669925923373756L;

	/** 
	 * null
	 */
	@ApiListField("result")
	@ApiField("user_income_query_response")
	private List<UserIncomeQueryResponse> result;

	public void setResult(List<UserIncomeQueryResponse> result) {
		this.result = result;
	}
	public List<UserIncomeQueryResponse> getResult( ) {
		return this.result;
	}

}
