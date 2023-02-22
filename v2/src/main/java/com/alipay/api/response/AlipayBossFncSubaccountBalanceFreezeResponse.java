package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SubAccountBalanceFreezeResultOpenApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.subaccount.balance.freeze response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 06:45:58
 */
public class AlipayBossFncSubaccountBalanceFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1167254985864985471L;

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
