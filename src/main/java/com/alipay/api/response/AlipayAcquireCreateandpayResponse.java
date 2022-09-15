package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-15 14:54:53
 */
public class AlipayAcquireCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4181723822827215199L;

	/** 
	 * 买家支付宝账号，可以为email或者手机号。对部分信息进行了隐藏。
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数字。
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 对返回响应码进行原因说明，请参见“10.2 业务错误码”。
当result_code响应码为ORDER_SUCCESS_PAY_SUCCESS时，不返回该参数。
	 */
	@ApiField("detail_error_code")
	private String detailErrorCode;

	/** 
	 * 对详细错误码进行文字说明。
当result_code响应码为ORDER_SUCCESS_PAY_SUCCESS时，不返回该参数。
	 */
	@ApiField("detail_error_des")
	private String detailErrorDes;

	/** 
	 * 支付后返回的其他信息，如预付卡金额，key值mcard_fee，以Json格式返回。
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * 7085502131376415
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 下单并支付处理结果响应码，请参见“10.1 业务响应码”。
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

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getExtendInfo( ) {
		return this.extendInfo;
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
