package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SubAccountQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.subaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:01
 */
public class AnttechOceanbaseSubaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4352956442812946539L;

	/** 
	 * 财资子户申请结果查询
	 */
	@ApiField("sub_account_query_result")
	private SubAccountQueryResult subAccountQueryResult;

	public void setSubAccountQueryResult(SubAccountQueryResult subAccountQueryResult) {
		this.subAccountQueryResult = subAccountQueryResult;
	}
	public SubAccountQueryResult getSubAccountQueryResult( ) {
		return this.subAccountQueryResult;
	}

}
