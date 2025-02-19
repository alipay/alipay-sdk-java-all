package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.textnotary.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-05 13:35:10
 */
public class AlipayBossProdAntlegalchainTextnotaryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2492165966369292747L;

	/** 
	 * 通过app_code和business_unique_id确定唯一的id，使得上链串行,无返回则说明上链失败，返回只能说明初始化存证成功，不表示上链成功
	 */
	@ApiField("biz_bas_id")
	private String bizBasId;

	public void setBizBasId(String bizBasId) {
		this.bizBasId = bizBasId;
	}
	public String getBizBasId( ) {
		return this.bizBasId;
	}

}
