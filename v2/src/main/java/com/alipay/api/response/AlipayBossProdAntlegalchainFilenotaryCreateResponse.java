package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.filenotary.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 16:07:41
 */
public class AlipayBossProdAntlegalchainFilenotaryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4363389586838194866L;

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
