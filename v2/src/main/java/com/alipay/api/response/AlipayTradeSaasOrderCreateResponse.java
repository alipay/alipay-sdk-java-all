package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SaasAccountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-03 11:52:51
 */
public class AlipayTradeSaasOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8826246625189773531L;

	/** 
	 * 聚合收银台短链访问地址。商户将用户跳转到该地址后，浏览器会重定向到带收银台访问凭证的完整地址。
	 */
	@ApiField("cashier_url")
	private String cashierUrl;

	/** 
	 * SaaS交易订单号。仅在显式单选银行转账且同步创单成功时返回。
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户订单号。仅在显式单选银行转账且同步创单成功时返回。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 本次银行转账实际使用的SaaS账户信息。仅在显式单选银行转账且同步创单成功时返回。
	 */
	@ApiField("saas_account_info")
	private SaasAccountInfo saasAccountInfo;

	/** 
	 * 银行渠道交易号。仅在显式单选银行转账且同步创单成功时返回。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 银行转账交易状态。同步创单成功后返回WAIT_BUYER_PAY。
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setCashierUrl(String cashierUrl) {
		this.cashierUrl = cashierUrl;
	}
	public String getCashierUrl( ) {
		return this.cashierUrl;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setSaasAccountInfo(SaasAccountInfo saasAccountInfo) {
		this.saasAccountInfo = saasAccountInfo;
	}
	public SaasAccountInfo getSaasAccountInfo( ) {
		return this.saasAccountInfo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
