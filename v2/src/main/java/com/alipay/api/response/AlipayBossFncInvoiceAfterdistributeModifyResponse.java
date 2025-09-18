package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InputInvoiceResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.afterdistribute.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-30 16:36:42
 */
public class AlipayBossFncInvoiceAfterdistributeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6447654684519973254L;

	/** 
	 * 修改返回结果
	 */
	@ApiField("result_set")
	private InputInvoiceResponse resultSet;

	public void setResultSet(InputInvoiceResponse resultSet) {
		this.resultSet = resultSet;
	}
	public InputInvoiceResponse getResultSet( ) {
		return this.resultSet;
	}

}
