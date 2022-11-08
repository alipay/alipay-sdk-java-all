package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.refund response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-22 15:02:02
 */
public class AlipayAcquireRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 8597843214736913114L;

	/** 
	 * 买家支付宝账号，可以是Email或手机号码。
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数字
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 对返回响应码进行原因说明
	 */
	@ApiField("detail_error_code")
	private String detailErrorCode;

	/** 
	 * 对详细错误码进行文字说明。
当result_code响应码为SUCCESS时，不返回该参数。
	 */
	@ApiField("detail_error_des")
	private String detailErrorDes;

	/** 
	 * 对同一个商户退款请求，如果该笔退款已退款过，则直接返回上一次的退款结果。同时，返回本次请求是否发生了资金变动的标识。
Y：本次退款请求发生资金变动；
N：本次退款请求未发送资金变动。
	 */
	@ApiField("fund_change")
	private String fundChange;

	/** 
	 * 对应商户网站的订单系统中的唯一订单号，非支付宝交易号。
需保证在商户网站中的唯一性。是请求时对应的参数，原样返回。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 退款处理结果响应码。
SUCCESS：退款成功
FAIL：退款失败
UNKNOWN：结果未知
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 该交易在支付宝系统中的交易流水号。
最短16位，最长64位。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	public String getBuyerLogonId( ) {
		return this.buyerLogonId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setDetailErrorCode(String detailErrorCode) {
		this.detailErrorCode = detailErrorCode;
	}
	public String getDetailErrorCode( ) {
		return this.detailErrorCode;
	}

	public void setDetailErrorDes(String detailErrorDes) {
		this.detailErrorDes = detailErrorDes;
	}
	public String getDetailErrorDes( ) {
		return this.detailErrorDes;
	}

	public void setFundChange(String fundChange) {
		this.fundChange = fundChange;
	}
	public String getFundChange( ) {
		return this.fundChange;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
