package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.carfin.valuation.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-06 10:57:44
 */
public class XingheLendassistCarfinValuationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3151376977434431249L;

	/** 
	 * 车牌号
	 */
	@ApiField("car_license")
	private String carLicense;

	/** 
	 * 优秀档位车辆估值，单位：分
	 */
	@ApiField("excellent_valuation_amt")
	private String excellentValuationAmt;

	/** 
	 * 良好档位车辆估值，单位：分
	 */
	@ApiField("good_valuation_amt")
	private String goodValuationAmt;

	/** 
	 * 估值时间
	 */
	@ApiField("valuation_time")
	private String valuationTime;

	public void setCarLicense(String carLicense) {
		this.carLicense = carLicense;
	}
	public String getCarLicense( ) {
		return this.carLicense;
	}

	public void setExcellentValuationAmt(String excellentValuationAmt) {
		this.excellentValuationAmt = excellentValuationAmt;
	}
	public String getExcellentValuationAmt( ) {
		return this.excellentValuationAmt;
	}

	public void setGoodValuationAmt(String goodValuationAmt) {
		this.goodValuationAmt = goodValuationAmt;
	}
	public String getGoodValuationAmt( ) {
		return this.goodValuationAmt;
	}

	public void setValuationTime(String valuationTime) {
		this.valuationTime = valuationTime;
	}
	public String getValuationTime( ) {
		return this.valuationTime;
	}

}
