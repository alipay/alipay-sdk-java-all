package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.payslip.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-18 17:32:23
 */
public class AlipayEbppIndustryJobPayslipInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4811233719357993441L;

	/** 
	 * 支付宝分享口令
	 */
	@ApiField("alipay_token")
	private String alipayToken;

	/** 
	 * 开通收款账号授权地址；回调地址，参数为callback；url完整示例：alipays://platformapi/startapp?appId=2021004166681275&page=pages%2Fauthorize%2Findex%3Fcallback%3D$alipays%3A%2F%2F%20platformapi%2Fstartapp%3FappId%3D2021004166681275%26userName%3D%E5%BC%A0xxx%26token%3D21I21k31lb1023435vq243se34&startMultApp=YES&appClearTop=false
	 */
	@ApiField("url")
	private String url;

	public void setAlipayToken(String alipayToken) {
		this.alipayToken = alipayToken;
	}
	public String getAlipayToken( ) {
		return this.alipayToken;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
