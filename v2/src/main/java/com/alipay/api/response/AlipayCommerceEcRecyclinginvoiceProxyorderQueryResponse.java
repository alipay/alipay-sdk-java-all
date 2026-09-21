package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.proxyorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-21 16:22:51
 */
public class AlipayCommerceEcRecyclinginvoiceProxyorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8337125942922214915L;

	/** 
	 * 授权链接，未确认时返回。
	 */
	@ApiField("auth_url")
	private String authUrl;

	/** 
	 * 农户确认时间，未确认时为空。
	 */
	@ApiField("confirm_time")
	private String confirmTime;

	/** 
	 * 农户支付宝账号，按展示要求脱敏返回。
	 */
	@ApiField("farmer_account_no")
	private String farmerAccountNo;

	/** 
	 * 农户支付宝账号类型。
	 */
	@ApiField("farmer_account_type")
	private String farmerAccountType;

	/** 
	 * 农户姓名。
	 */
	@ApiField("farmer_name")
	private String farmerName;

	/** 
	 * 服务商侧外部流水单号。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 支付订单号。
	 */
	@ApiField("pay_order_no")
	private String payOrderNo;

	/** 
	 * 代卖人支付宝账号，按展示要求脱敏返回。
	 */
	@ApiField("proxy_account_no")
	private String proxyAccountNo;

	/** 
	 * 代卖人支付宝账号类型。
	 */
	@ApiField("proxy_account_type")
	private String proxyAccountType;

	/** 
	 * 保证金，单位为元。
	 */
	@ApiField("proxy_earnest_amount")
	private String proxyEarnestAmount;

	/** 
	 * 代卖人姓名。
	 */
	@ApiField("proxy_name")
	private String proxyName;

	/** 
	 * 代卖人收购单ID。
	 */
	@ApiField("proxy_order_id")
	private String proxyOrderId;

	/** 
	 * 收购单状态，可选值为NOT_CONFIRMED或CONFIRMED。
	 */
	@ApiField("proxy_order_status")
	private String proxyOrderStatus;

	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}
	public String getAuthUrl( ) {
		return this.authUrl;
	}

	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}
	public String getConfirmTime( ) {
		return this.confirmTime;
	}

	public void setFarmerAccountNo(String farmerAccountNo) {
		this.farmerAccountNo = farmerAccountNo;
	}
	public String getFarmerAccountNo( ) {
		return this.farmerAccountNo;
	}

	public void setFarmerAccountType(String farmerAccountType) {
		this.farmerAccountType = farmerAccountType;
	}
	public String getFarmerAccountType( ) {
		return this.farmerAccountType;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getFarmerName( ) {
		return this.farmerName;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}
	public String getPayOrderNo( ) {
		return this.payOrderNo;
	}

	public void setProxyAccountNo(String proxyAccountNo) {
		this.proxyAccountNo = proxyAccountNo;
	}
	public String getProxyAccountNo( ) {
		return this.proxyAccountNo;
	}

	public void setProxyAccountType(String proxyAccountType) {
		this.proxyAccountType = proxyAccountType;
	}
	public String getProxyAccountType( ) {
		return this.proxyAccountType;
	}

	public void setProxyEarnestAmount(String proxyEarnestAmount) {
		this.proxyEarnestAmount = proxyEarnestAmount;
	}
	public String getProxyEarnestAmount( ) {
		return this.proxyEarnestAmount;
	}

	public void setProxyName(String proxyName) {
		this.proxyName = proxyName;
	}
	public String getProxyName( ) {
		return this.proxyName;
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
