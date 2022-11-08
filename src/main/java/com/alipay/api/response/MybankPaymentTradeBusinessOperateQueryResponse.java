package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.business.operate.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-09 11:03:02
 */
public class MybankPaymentTradeBusinessOperateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6592378246655695156L;

	/** 
	 * 业务场景(这个场景固定值)，下单中入参
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 币种
	 */
	@ApiField("currency_value")
	private String currencyValue;

	/** 
	 * 请求完结时间，格式是yyyy-MM-dd HH:mm:ss
对于支付，就是支付时间
对于退款，就是退款时间
	 */
	@ApiField("finish_time")
	private String finishTime;

	/** 
	 * 网商操作单号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 操作状态
SUCCESS 成功的
FAIL 失败的
PROCESSING 处理中
INIT 初始化
	 */
	@ApiField("operate_status")
	private String operateStatus;

	/** 
	 * PAYMENT：支付
REFUND：退款
SETTLEMENT：结算分账
	 */
	@ApiField("operate_type")
	private String operateType;

	/** 
	 * 网商订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 下单的外部平台的单据号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 签约的产品码(固定值)，下单中入参
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 操作的请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/** 
	 * 外部平台是否需要原单重试，失败时有值
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 交易金额，单位元
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

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}
	public String getFinishTime( ) {
		return this.finishTime;
	}

	public void setOperateNo(String operateNo) {
		this.operateNo = operateNo;
	}
	public String getOperateNo( ) {
		return this.operateNo;
	}

	public void setOperateStatus(String operateStatus) {
		this.operateStatus = operateStatus;
	}
	public String getOperateStatus( ) {
		return this.operateStatus;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	public String getOperateType( ) {
		return this.operateType;
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

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setTradeAmt(String tradeAmt) {
		this.tradeAmt = tradeAmt;
	}
	public String getTradeAmt( ) {
		return this.tradeAmt;
	}

}
