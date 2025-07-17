package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.deposit.verify.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:00
 */
public class MybankPaymentTradeDepositVerifyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2194614223861915177L;

	/** 
	 * 请求流水号，与入参一致
	 */
	@ApiField("request_no")
	private String requestNo;

	/** 
	 * 打款验证ID
打款验证受理后生成的一个唯一标识，用于金额校验接口
	 */
	@ApiField("verify_id")
	private String verifyId;

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}
	public String getVerifyId( ) {
		return this.verifyId;
	}

}
