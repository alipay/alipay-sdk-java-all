package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApplySubAccountAndBindResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.subaccount.account.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:38:49
 */
public class AlipayBossFncSubaccountAccountApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3413472679776795174L;

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
