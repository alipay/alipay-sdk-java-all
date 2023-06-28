package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SubAccountBalanceFreezeResultOpenApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.subaccount.balance.freeze response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:58:28
 */
public class AlipayBossFncSubaccountBalanceFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5699841728678683294L;

	/** 
	 * 子户余额冻结结果open api数据传输对象
	 */
	@ApiField("result_set")
	private SubAccountBalanceFreezeResultOpenApiDTO resultSet;

	public void setResultSet(SubAccountBalanceFreezeResultOpenApiDTO resultSet) {
		this.resultSet = resultSet;
	}
	public SubAccountBalanceFreezeResultOpenApiDTO getResultSet( ) {
		return this.resultSet;
	}

}
