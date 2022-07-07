package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.overdraft.returnmoney response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-14 14:35:25
 */
public class AlipayTradeOverdraftReturnmoneyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1492865943558668623L;

	/** 
	 * 退款时上送的外部退款请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 追款收款账户
	 */
	@ApiField("receive_account")
	private String receiveAccount;

	/** 
	 * 垫资追款结果。枚举值：
SUCCESS：追款成功
FAILED：追款失败
PROCESSING：追款中
	 */
	@ApiField("return_result")
	private String returnResult;

	/** 
	 * 垫付追款完成时间
	 */
	@ApiField("success_time")
	private String successTime;

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setReceiveAccount(String receiveAccount) {
		this.receiveAccount = receiveAccount;
	}
	public String getReceiveAccount( ) {
		return this.receiveAccount;
	}

	public void setReturnResult(String returnResult) {
		this.returnResult = returnResult;
	}
	public String getReturnResult( ) {
		return this.returnResult;
	}

	public void setSuccessTime(String successTime) {
		this.successTime = successTime;
	}
	public String getSuccessTime( ) {
		return this.successTime;
	}

}
