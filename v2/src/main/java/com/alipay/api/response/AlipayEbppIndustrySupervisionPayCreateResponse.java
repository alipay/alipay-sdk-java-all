package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.pay.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 17:47:04
 */
public class AlipayEbppIndustrySupervisionPayCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5118344291351274653L;

	/** 
	 * 外部流水号，本次创建支付单的请求id，重复请求幂等返回
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/** 
	 * 外部订单号，本次发起支付关联的冻资单id
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 支付宝创建的内部支付单号。后续后续根据流水号或者外部订单号查询。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setOutFlowId(String outFlowId) {
		this.outFlowId = outFlowId;
	}
	public String getOutFlowId( ) {
		return this.outFlowId;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
