package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.loan.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCreditAutofinanceLoanApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5811273746828488319L;

	/** 
	 * 汽车金融内部订单号
	 */
	@ApiField("applyno")
	private String applyno;

	/** 
	 * 是否需要引导认证
	 */
	@ApiField("needauth")
	private Boolean needauth;

	/** 
	 * 外部订单号
	 */
	@ApiField("outorderno")
	private String outorderno;

	public void setApplyno(String applyno) {
		this.applyno = applyno;
	}
	public String getApplyno( ) {
		return this.applyno;
	}

	public void setNeedauth(Boolean needauth) {
		this.needauth = needauth;
	}
	public Boolean getNeedauth( ) {
		return this.needauth;
	}

	public void setOutorderno(String outorderno) {
		this.outorderno = outorderno;
	}
	public String getOutorderno( ) {
		return this.outorderno;
	}

}
