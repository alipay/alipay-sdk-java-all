package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpusCreateResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.portfolio.opus.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-18 11:56:17
 */
public class KoubeiServindustryPortfolioOpusCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3689314816827928987L;

	/** 
	 * 作品列表
	 */
	@ApiField("opuses")
	private OpusCreateResponse opuses;

	public void setOpuses(OpusCreateResponse opuses) {
		this.opuses = opuses;
	}
	public OpusCreateResponse getOpuses( ) {
		return this.opuses;
	}

}
