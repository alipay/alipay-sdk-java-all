package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.gov.healthcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:29:21
 */
public class AlipayEbppIndustryGovHealthcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5696233481846248377L;

	/** 
	 * 码的颜色，红/黄/绿/审核中，分别对应如下: red/yellow/green/init,
	 */
	@ApiField("code_color")
	private String codeColor;

	/** 
	 * 生成的健康码码值
	 */
	@ApiField("code_content")
	private String codeContent;

	/** 
	 * 码值刷新的时间，可能为空
	 */
	@ApiField("refresh_time")
	private Date refreshTime;

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

	public void setCodeContent(String codeContent) {
		this.codeContent = codeContent;
	}
	public String getCodeContent( ) {
		return this.codeContent;
	}

	public void setRefreshTime(Date refreshTime) {
		this.refreshTime = refreshTime;
	}
	public Date getRefreshTime( ) {
		return this.refreshTime;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
