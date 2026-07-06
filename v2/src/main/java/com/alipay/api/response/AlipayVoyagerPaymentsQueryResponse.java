package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StandardPayOrderDTO;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.payments.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-25 11:09:56
 */
public class AlipayVoyagerPaymentsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4445566162749536211L;

	/** 
	 * 支付订单
	 */
	@ApiField("pay_order")
	private StandardPayOrderDTO payOrder;

	/** 
	 * 结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	public void setPayOrder(StandardPayOrderDTO payOrder) {
		this.payOrder = payOrder;
	}
	public StandardPayOrderDTO getPayOrder( ) {
		return this.payOrder;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

}
