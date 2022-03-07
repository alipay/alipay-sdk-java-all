package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.subaccount.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-09 16:15:29
 */
public class MybankPaymentTradeSubaccountInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8634976923861496388L;

	/** 
	 * 开子户请求的外部渠道ID
	 */
	@ApiField("out_channel_id")
	private String outChannelId;

	/** 
	 * 开通子户的外部请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/** 
	 * 子户外标
	 */
	@ApiField("sub_card_no")
	private String subCardNo;

	public void setOutChannelId(String outChannelId) {
		this.outChannelId = outChannelId;
	}
	public String getOutChannelId( ) {
		return this.outChannelId;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

	public void setSubCardNo(String subCardNo) {
		this.subCardNo = subCardNo;
	}
	public String getSubCardNo( ) {
		return this.subCardNo;
	}

}
