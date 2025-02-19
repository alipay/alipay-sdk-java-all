package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.finance.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:07
 */
public class AlipayTradeCreditFinanceRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 1571158377498244918L;

	/** 
	 * 本次退款的金额，非特殊情况下和请求金额保持一致。单位为元；精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 本次金融退款的支付宝单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 币种单位，目前只支持人民币CNY
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 支付宝系统资金处理成功时间，格式为"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("gmt_refund_pay")
	private String gmtRefundPay;

	/** 
	 * 外部请求号，和请求入参一致
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 本次退款的处理状态，SUCCESS：处理成功；FAIL：处理失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 本次金融退款对应的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setGmtRefundPay(String gmtRefundPay) {
		this.gmtRefundPay = gmtRefundPay;
	}
	public String getGmtRefundPay( ) {
		return this.gmtRefundPay;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
