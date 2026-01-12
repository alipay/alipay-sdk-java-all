package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfinvoice.outputproformanobill.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-24 13:46:07
 */
public class AlipayBossFncGfinvoiceOutputproformanobillApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5169653637461699644L;

	/** 
	 * 无账单申请成功返回的申请orderId
	 */
	@ApiField("result_set")
	private String resultSet;

	public void setResultSet(String resultSet) {
		this.resultSet = resultSet;
	}
	public String getResultSet( ) {
		return this.resultSet;
	}

}
