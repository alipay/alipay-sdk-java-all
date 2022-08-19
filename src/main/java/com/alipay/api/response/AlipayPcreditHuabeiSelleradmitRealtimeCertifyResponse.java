package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.selleradmit.realtime.certify response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:48
 */
public class AlipayPcreditHuabeiSelleradmitRealtimeCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5186861769735314726L;

	/** 
	 * 不准入原因码
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/** 
	 * 卖家实时准入结果
	 */
	@ApiField("result")
	private Long result;

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getReasonCode( ) {
		return this.reasonCode;
	}

	public void setResult(Long result) {
		this.result = result;
	}
	public Long getResult( ) {
		return this.result;
	}

}
