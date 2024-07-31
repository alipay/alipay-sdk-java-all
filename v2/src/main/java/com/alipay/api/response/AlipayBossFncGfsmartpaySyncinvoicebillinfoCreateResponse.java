package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResultModelForInvoiceBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsmartpay.syncinvoicebillinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:06:43
 */
public class AlipayBossFncGfsmartpaySyncinvoicebillinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7668161575235913259L;

	/** 
	 * 通用返回结果
	 */
	@ApiField("result_set")
	private ResultModelForInvoiceBill resultSet;

	public void setResultSet(ResultModelForInvoiceBill resultSet) {
		this.resultSet = resultSet;
	}
	public ResultModelForInvoiceBill getResultSet( ) {
		return this.resultSet;
	}

}
