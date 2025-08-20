package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CounterpartyVerifyResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.counterparty.verification.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-30 18:47:31
 */
public class ZhimaCreditEpCounterpartyVerificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5712468938346115382L;

	/** 
	 * 企业查询key，入参原样返回
	 */
	@ApiField("company_key")
	private String companyKey;

	/** 
	 * 交易对手核验结果
	 */
	@ApiField("data")
	private CounterpartyVerifyResult data;

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
	public String getCompanyKey( ) {
		return this.companyKey;
	}

	public void setData(CounterpartyVerifyResult data) {
		this.data = data;
	}
	public CounterpartyVerifyResult getData( ) {
		return this.data;
	}

}
