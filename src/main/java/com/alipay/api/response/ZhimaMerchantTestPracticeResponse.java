package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.XXXXsdasdasd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.test.practice response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaMerchantTestPracticeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5725532874195585491L;

	/** 
	 * xxxx
	 */
	@ApiField("dddd")
	private XXXXsdasdasd dddd;

	/** 
	 * ccc
	 */
	@ApiField("sss")
	private String sss;

	public void setDddd(XXXXsdasdasd dddd) {
		this.dddd = dddd;
	}
	public XXXXsdasdasd getDddd( ) {
		return this.dddd;
	}

	public void setSss(String sss) {
		this.sss = sss;
	}
	public String getSss( ) {
		return this.sss;
	}

}
