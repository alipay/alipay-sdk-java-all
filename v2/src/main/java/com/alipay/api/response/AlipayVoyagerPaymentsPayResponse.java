package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.payments.pay response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-14 11:02:02
 */
public class AlipayVoyagerPaymentsPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1771628941629699182L;

	/** 
	 * 支付链接
	 */
	@ApiField("order_str")
	private String orderStr;

	/** 
	 * 支付单ID
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/** 
	 * 结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}
	public String getPayOrderId( ) {
		return this.payOrderId;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

}
