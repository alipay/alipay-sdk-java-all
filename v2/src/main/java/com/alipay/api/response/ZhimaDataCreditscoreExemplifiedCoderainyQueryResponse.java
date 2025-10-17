package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.data.creditscore.exemplified.coderainy.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-17 14:22:05
 */
public class ZhimaDataCreditscoreExemplifiedCoderainyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7813782688541311867L;

	/** 
	 * 简单描述
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝的用户id
	 */
	@ApiField("uid")
	private String uid;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUid( ) {
		return this.uid;
	}

}
