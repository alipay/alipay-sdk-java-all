package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.business.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-09 11:02:27
 */
public class MybankPaymentTradeBusinessOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1386418849949818138L;

	/** 
	 * 业务场景
固定场景中分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 币种，默认CNY
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/** 
	 * 网商订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单状态
INIT 初始化
CLOSED 交易关闭
PAYED 支付完成
SETTLED 结算分账完成
FINISH 交易完成
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 下单的外部平台的单据号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 已支付金额
	 */
	@ApiField("pay_amt")
	private String payAmt;

	/** 
	 * 签约的产品码(固定值)
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 售中退款金额
	 */
	@ApiField("refund_amt")
	private String refundAmt;

	/** 
	 * 外部平台是否需要原单重试，失败时有值
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 结算金额
	 */
	@ApiField("settle_amt")
	private String settleAmt;

	/** 
	 * 金额，单位元
	 */
	@ApiField("trade_amt")
	private String tradeAmt;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}
	public String getCurrencyValue( ) {
		return this.currencyValue;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPayAmt(String payAmt) {
		this.payAmt = payAmt;
	}
	public String getPayAmt( ) {
		return this.payAmt;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setRefundAmt(String refundAmt) {
		this.refundAmt = refundAmt;
	}
	public String getRefundAmt( ) {
		return this.refundAmt;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setSettleAmt(String settleAmt) {
		this.settleAmt = settleAmt;
	}
	public String getSettleAmt( ) {
		return this.settleAmt;
	}

	public void setTradeAmt(String tradeAmt) {
		this.tradeAmt = tradeAmt;
	}
	public String getTradeAmt( ) {
		return this.tradeAmt;
	}

}
