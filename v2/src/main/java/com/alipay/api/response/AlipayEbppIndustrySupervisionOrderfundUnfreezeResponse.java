package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.orderfund.unfreeze response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-18 16:56:45
 */
public class AlipayEbppIndustrySupervisionOrderfundUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4376877419613761582L;

	/** 
	 * 订单金额，整数，单位分
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 请求参数中的外部流水号
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/** 
	 * 请求参数中的外部订单号
	 */
	@ApiField("relation_out_order_no")
	private String relationOutOrderNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setOutFlowId(String outFlowId) {
		this.outFlowId = outFlowId;
	}
	public String getOutFlowId( ) {
		return this.outFlowId;
	}

	public void setRelationOutOrderNo(String relationOutOrderNo) {
		this.relationOutOrderNo = relationOutOrderNo;
	}
	public String getRelationOutOrderNo( ) {
		return this.relationOutOrderNo;
	}

}
