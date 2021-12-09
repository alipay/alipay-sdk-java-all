package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.trade.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-26 15:23:12
 */
public class AlipayEcoMycarTradeOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4421836443635945246L;

	/** 
	 * 车主平台交易号，交易订单唯一标记。与车主业务平台订单号相同。
	 */
	@ApiField("biz_trade_no")
	private String bizTradeNo;

	/** 
	 * 买家支付宝Uid
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 买家支付宝账号
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 交易关闭时间，格式'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_closed")
	private String gmtClosed;

	/** 
	 * 交易订单创建时间，格式'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_created")
	private String gmtCreated;

	/** 
	 * 支付时间，格式'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_payment")
	private String gmtPayment;

	/** 
	 * 支付成功时间，格式'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_payment_success")
	private String gmtPaymentSuccess;

	/** 
	 * 退款时间。该笔交易有退款操作时该字段才有值。格式：'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/** 
	 * 退款成功时间。笔交易有退款操作时该字段才有值。格式：'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_refund_success")
	private String gmtRefundSuccess;

	/** 
	 * 交易订单最后更改时间，格式'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_updated")
	private String gmtUpdated;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_biz_trade_no")
	private String outBizTradeNo;

	/** 
	 * 已退回金额，单位元，精确到小数点后两位。笔交易有退款操作时该字段才有值。
	 */
	@ApiField("send_back_fee")
	private String sendBackFee;

	/** 
	 * 车主平台门店编号
	 */
	@ApiField("shop_id")
	private Long shopId;

	/** 
	 * 订单主题，商品的标题/交易标题/订单标题/订单关键字等。
	 */
	@ApiField("subject")
	private String subject;

	/** 
	 * 订单摘要信息，对一笔交易的具体描述，由车主业务系统组织。 车主平台订单列表透出内容。
	 */
	@ApiField("summary")
	private String summary;

	/** 
	 * 交易金额，单位元， 精确到小数点后两位。
	 */
	@ApiField("total_fee")
	private String totalFee;

	/** 
	 * 支付宝交易号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 车主平台交易状态
0：创建；1：支付成功；2：支付失败；3：支付完成；4：支付中；5：交易关闭；6：转为退款；8：退款成功；7：退款失败；9：交易完结
	 */
	@ApiField("trade_status")
	private Long tradeStatus;

	/** 
	 * 订单类型，1：洗车，2：保养，3:洗车，4:4s店。
	 */
	@ApiField("trade_type")
	private Long tradeType;

	public void setBizTradeNo(String bizTradeNo) {
		this.bizTradeNo = bizTradeNo;
	}
	public String getBizTradeNo( ) {
		return this.bizTradeNo;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	public String getBuyerLogonId( ) {
		return this.buyerLogonId;
	}

	public void setGmtClosed(String gmtClosed) {
		this.gmtClosed = gmtClosed;
	}
	public String getGmtClosed( ) {
		return this.gmtClosed;
	}

	public void setGmtCreated(String gmtCreated) {
		this.gmtCreated = gmtCreated;
	}
	public String getGmtCreated( ) {
		return this.gmtCreated;
	}

	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public String getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setGmtPaymentSuccess(String gmtPaymentSuccess) {
		this.gmtPaymentSuccess = gmtPaymentSuccess;
	}
	public String getGmtPaymentSuccess( ) {
		return this.gmtPaymentSuccess;
	}

	public void setGmtRefund(String gmtRefund) {
		this.gmtRefund = gmtRefund;
	}
	public String getGmtRefund( ) {
		return this.gmtRefund;
	}

	public void setGmtRefundSuccess(String gmtRefundSuccess) {
		this.gmtRefundSuccess = gmtRefundSuccess;
	}
	public String getGmtRefundSuccess( ) {
		return this.gmtRefundSuccess;
	}

	public void setGmtUpdated(String gmtUpdated) {
		this.gmtUpdated = gmtUpdated;
	}
	public String getGmtUpdated( ) {
		return this.gmtUpdated;
	}

	public void setOutBizTradeNo(String outBizTradeNo) {
		this.outBizTradeNo = outBizTradeNo;
	}
	public String getOutBizTradeNo( ) {
		return this.outBizTradeNo;
	}

	public void setSendBackFee(String sendBackFee) {
		this.sendBackFee = sendBackFee;
	}
	public String getSendBackFee( ) {
		return this.sendBackFee;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Long getShopId( ) {
		return this.shopId;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject( ) {
		return this.subject;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getSummary( ) {
		return this.summary;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}
	public String getTotalFee( ) {
		return this.totalFee;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeStatus(Long tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public Long getTradeStatus( ) {
		return this.tradeStatus;
	}

	public void setTradeType(Long tradeType) {
		this.tradeType = tradeType;
	}
	public Long getTradeType( ) {
		return this.tradeType;
	}

}
