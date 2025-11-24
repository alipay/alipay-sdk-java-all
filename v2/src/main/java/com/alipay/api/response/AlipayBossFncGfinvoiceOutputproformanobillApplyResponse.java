package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfinvoice.outputproformanobill.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 10:52:41
 */
public class AlipayBossFncGfinvoiceOutputproformanobillApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2241517248875172565L;

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
