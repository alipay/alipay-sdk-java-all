package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayAcquireQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1434124378748164592L;

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
	 * 对返回响应码进行原因说明”。
当result_code响应码为SUCCESS时，不返回该参数
	 */
	@ApiField("detail_error_code")
	private String detailErrorCode;

	/** 
	 * 对详细错误码进行文字说明。
当result_code响应码为SUCCESS时，不返回该参数
	 */
	@ApiField("detail_error_des")
	private String detailErrorDes;

	/** 
	 * 对应商户网站的订单系统中的唯一订单号，非支付宝交易号。
需保证在商户网站中的唯一性。是请求时对应的参数，原样返回。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 签约的支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
	 */
	@ApiField("partner")
	private String partner;

	/** 
	 * 查询处理结果响应码:
SUCCESS：查询成功
FAIL：查询失败
PROCESS_EXCEPTION：处理异常
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

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}
	public String getPartner( ) {
		return this.partner;
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
