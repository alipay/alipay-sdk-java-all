package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayTradeCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4596552257373743561L;

	/** 
	 * 本次撤销触发的交易动作
close：关闭交易，无退款
refund：产生了退款
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 当撤销产生了退款时，返回退款时间；
默认不返回该信息，需与支付宝约定后配置返回；
	 */
	@ApiField("gmt_refund_pay")
	private Date gmtRefundPay;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 当撤销产生了退款时，返回的退款清算编号，用于清算对账使用；
只在银行间联交易场景下返回该信息；
	 */
	@ApiField("refund_settlement_id")
	private String refundSettlementId;

	/** 
	 * 是否需要重试
	 */
	@ApiField("retry_flag")
	private String retryFlag;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAction(String action) {
		this.action = action;
	}
	public String getAction( ) {
		return this.action;
	}

	public void setGmtRefundPay(Date gmtRefundPay) {
		this.gmtRefundPay = gmtRefundPay;
	}
	public Date getGmtRefundPay( ) {
		return this.gmtRefundPay;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setRefundSettlementId(String refundSettlementId) {
		this.refundSettlementId = refundSettlementId;
	}
	public String getRefundSettlementId( ) {
		return this.refundSettlementId;
	}

	public void setRetryFlag(String retryFlag) {
		this.retryFlag = retryFlag;
	}
	public String getRetryFlag( ) {
		return this.retryFlag;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
