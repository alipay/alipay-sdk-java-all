package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.visit.limit.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 11:22:38
 */
public class AlipayOfflineSmddVisitLimitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1694491225586577761L;

	/** 
	 * true:禁止
false:不禁止
	 */
	@ApiField("limit")
	private Boolean limit;

	/** 
	 * 访问受限文案
	 */
	@ApiField("limit_msg")
	private String limitMsg;

	/** 
	 * 访问受限类型，INTERCEPT:拦截式，阻止用户继续访问
	 */
	@ApiField("limit_type")
	private String limitType;

	public void setLimit(Boolean limit) {
		this.limit = limit;
	}
	public Boolean getLimit( ) {
		return this.limit;
	}

	public void setLimitMsg(String limitMsg) {
		this.limitMsg = limitMsg;
	}
	public String getLimitMsg( ) {
		return this.limitMsg;
	}

	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}
	public String getLimitType( ) {
		return this.limitType;
	}

}
