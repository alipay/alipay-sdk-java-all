package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.finance.dispute response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityDataFinanceDisputeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5828559779511744548L;

	/** 
	 * 充值账户登陆邮箱/手机
	 */
	@ApiField("buyer_login_account")
	private String buyerLoginAccount;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	public void setBuyerLoginAccount(String buyerLoginAccount) {
		this.buyerLoginAccount = buyerLoginAccount;
	}
	public String getBuyerLoginAccount( ) {
		return this.buyerLoginAccount;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

}
