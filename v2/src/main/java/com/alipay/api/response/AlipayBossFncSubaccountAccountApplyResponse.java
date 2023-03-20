package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApplySubAccountAndBindResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.subaccount.account.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:14:38
 */
public class AlipayBossFncSubaccountAccountApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4668911339557352663L;

	/** 
	 * 申请子户结果
	 */
	@ApiField("result_set")
	private ApplySubAccountAndBindResultDTO resultSet;

	public void setResultSet(ApplySubAccountAndBindResultDTO resultSet) {
		this.resultSet = resultSet;
	}
	public ApplySubAccountAndBindResultDTO getResultSet( ) {
		return this.resultSet;
	}

}
