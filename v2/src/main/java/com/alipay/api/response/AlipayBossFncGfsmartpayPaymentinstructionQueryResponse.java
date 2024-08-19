package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResponseModelForPaymentInstruction;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsmartpay.paymentinstruction.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:06:43
 */
public class AlipayBossFncGfsmartpayPaymentinstructionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6558778328226348442L;

	/** 
	 * 查询付款进度通用结果模型
	 */
	@ApiField("result_set")
	private ResponseModelForPaymentInstruction resultSet;

	public void setResultSet(ResponseModelForPaymentInstruction resultSet) {
		this.resultSet = resultSet;
	}
	public ResponseModelForPaymentInstruction getResultSet( ) {
		return this.resultSet;
	}

}
