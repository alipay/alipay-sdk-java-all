package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.message.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:50:45
 */
public class AlipayMarketingCardMessageNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8827385989187889196L;

	/** 
	 * 二级错误处理结果（如果公用返回结果为false，则可以看这个接口判断明细原因） 如果公用返回为true，则该字段为空
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
