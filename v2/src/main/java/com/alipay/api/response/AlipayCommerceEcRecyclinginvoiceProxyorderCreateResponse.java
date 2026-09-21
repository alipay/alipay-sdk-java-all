package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.proxyorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-21 16:22:51
 */
public class AlipayCommerceEcRecyclinginvoiceProxyorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4185211726173119525L;

	/** 
	 * 农户授权链接，服务商用于生成或展示授权二维码。
	 */
	@ApiField("auth_url")
	private String authUrl;

	/** 
	 * 服务商侧外部流水单号，原样返回。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 代卖人收购单ID。
	 */
	@ApiField("proxy_order_id")
	private String proxyOrderId;

	/** 
	 * 收购单状态，创建成功后为NOT_CONFIRMED。
	 */
	@ApiField("proxy_order_status")
	private String proxyOrderStatus;

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}
	public String getAuthUrl( ) {
		return this.authUrl;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setProxyOrderId(String proxyOrderId) {
		this.proxyOrderId = proxyOrderId;
	}
	public String getProxyOrderId( ) {
		return this.proxyOrderId;
	}

	public void setProxyOrderStatus(String proxyOrderStatus) {
		this.proxyOrderStatus = proxyOrderStatus;
	}
	public String getProxyOrderStatus( ) {
		return this.proxyOrderStatus;
	}

}
