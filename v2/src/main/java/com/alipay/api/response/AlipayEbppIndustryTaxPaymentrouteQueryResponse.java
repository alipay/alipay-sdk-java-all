package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.tax.paymentroute.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 19:37:03
 */
public class AlipayEbppIndustryTaxPaymentrouteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2797129625686122585L;

	/** 
	 * 1：银联模式
2：支付宝下单模式-直连
3：支付宝下单模式-间连
4：间连外跳
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/** 
	 * 缴税路由查询流水号
	 */
	@ApiField("query_id")
	private String queryId;

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}
	public String getPayChannel( ) {
		return this.payChannel;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}
	public String getQueryId( ) {
		return this.queryId;
	}

}
