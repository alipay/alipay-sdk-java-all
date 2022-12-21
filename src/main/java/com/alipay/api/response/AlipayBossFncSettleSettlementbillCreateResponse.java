package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SettlementbillOpenApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.settle.settlementbill.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 00:11:53
 */
public class AlipayBossFncSettleSettlementbillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1691258748255858412L;

	/** 
	 * 返回参数
	 */
	@ApiField("result_set")
	private SettlementbillOpenApiDTO resultSet;

	public void setResultSet(SettlementbillOpenApiDTO resultSet) {
		this.resultSet = resultSet;
	}
	public SettlementbillOpenApiDTO getResultSet( ) {
		return this.resultSet;
	}

}
