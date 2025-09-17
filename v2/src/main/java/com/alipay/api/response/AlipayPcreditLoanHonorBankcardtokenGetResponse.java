package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.bankcardtoken.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 17:12:40
 */
public class AlipayPcreditLoanHonorBankcardtokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8136211217989388891L;

	/** 
	 * 查询银行卡列表token
	 */
	@ApiField("api_token")
	private String apiToken;

	/** 
	 * 有效截止时间, 格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_time")
	private String validTime;

	public void setApiToken(String apiToken) {
		this.apiToken = apiToken;
	}
	public String getApiToken( ) {
		return this.apiToken;
	}

	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}
	public String getValidTime( ) {
		return this.validTime;
	}

}
