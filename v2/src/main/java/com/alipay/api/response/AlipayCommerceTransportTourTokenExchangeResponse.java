package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.tour.token.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-02 21:52:45
 */
public class AlipayCommerceTransportTourTokenExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6449139958275616292L;

	/** 
	 * 支付授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/** 
	 * 支付凭证类型
	 */
	@ApiField("code_type")
	private String codeType;

	/** 
	 * 支付凭证实效时间
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/** 
	 * 支付凭证启动时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthCode( ) {
		return this.authCode;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}
	public String getCodeType( ) {
		return this.codeType;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public Date getExpireDate( ) {
		return this.expireDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate( ) {
		return this.startDate;
	}

}
