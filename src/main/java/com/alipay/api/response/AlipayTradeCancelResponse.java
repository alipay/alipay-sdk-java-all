package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-16 16:06:17
 */
public class AlipayTradeCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6592582445661821148L;

	/** 
	 * 本次撤销触发的交易动作,接口调用成功且交易存在时返回。可能的返回值：
close：交易未支付，触发关闭交易动作，无退款；
refund：交易已支付，触发交易退款动作；
未返回：未查询到交易，或接口调用失败；
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 当撤销产生了退款时，返回退款时间；
 只在银行间联交易场景下返回该信息；
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
	 * 支付宝交易号;
当发生交易关闭或交易退款时返回；
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
