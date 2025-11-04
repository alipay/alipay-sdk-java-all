package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.credit.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:07:28
 */
public class AlipayCommerceTransportChargerCreditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6669762315372344987L;

	/** 
	 * 协议失效时间
	 */
	@ApiField("invalid_time")
	private Date invalidTime;

	/** 
	 * 协议当前状态。
注意：当前仅返回 NORMAL：（正常）状态。
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 协议生效时间
	 */
	@ApiField("valid_time")
	private Date validTime;

	public void setInvalidTime(Date invalidTime) {
		this.invalidTime = invalidTime;
	}
	public Date getInvalidTime( ) {
		return this.invalidTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}
	public Date getValidTime( ) {
		return this.validTime;
	}

}
