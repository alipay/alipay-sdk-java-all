package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreditResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.credit.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:52
 */
public class AlipayEcapiprodCreditGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4348227334883551656L;

	/** 
	 * 授信结果
	 */
	@ApiField("credit_result")
	private CreditResult creditResult;

	/** 
	 * 为了保持幂等性，返回唯一请求号
	 */
	@ApiField("request_id")
	private String requestId;

	public void setCreditResult(CreditResult creditResult) {
		this.creditResult = creditResult;
	}
	public CreditResult getCreditResult( ) {
		return this.creditResult;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
