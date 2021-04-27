package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SubAccountInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.subaccount.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-31 19:43:23
 */
public class AlipayBossFncSubaccountAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5667116491127173898L;

	/** 
	 * 查询子户结果信息
	 */
	@ApiField("result_set")
	private SubAccountInfoDTO resultSet;

	public void setResultSet(SubAccountInfoDTO resultSet) {
		this.resultSet = resultSet;
	}
	public SubAccountInfoDTO getResultSet( ) {
		return this.resultSet;
	}

}
