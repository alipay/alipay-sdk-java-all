package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RemitExchangeRate;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.fund.remit.fx.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasFundRemitFxQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8744669974761261587L;

	/** 
	 * fx_rate, 包含了与输入的base_currency, target_currency相对应的汇率信息, 有效时间, id。
	 */
	@ApiField("fx_rate")
	private RemitExchangeRate fxRate;

	public void setFxRate(RemitExchangeRate fxRate) {
		this.fxRate = fxRate;
	}
	public RemitExchangeRate getFxRate( ) {
		return this.fxRate;
	}

}
