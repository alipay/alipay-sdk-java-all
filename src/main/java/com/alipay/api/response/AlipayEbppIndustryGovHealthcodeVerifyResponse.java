package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.gov.healthcode.verify response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-21 11:10:09
 */
public class AlipayEbppIndustryGovHealthcodeVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3513384255217972639L;

	/** 
	 * 码的颜色，红/黄/绿/审核中，分别对应如下: red/yellow/green/init
	 */
	@ApiField("code_color")
	private String codeColor;

	/** 
	 * 生成的健康码码值
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 码值刷新的时间，可能为空
	 */
	@ApiField("refresh_time")
	private String refreshTime;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public void setCodeColor(String codeColor) {
		this.codeColor = codeColor;
	}
	public String getCodeColor( ) {
		return this.codeColor;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setRefreshTime(String refreshTime) {
		this.refreshTime = refreshTime;
	}
	public String getRefreshTime( ) {
		return this.refreshTime;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
