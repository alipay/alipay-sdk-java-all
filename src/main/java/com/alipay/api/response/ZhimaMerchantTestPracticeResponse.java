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

	private static final long serialVersionUID = 8669876995488652658L;

	/** 
	 * 23
	 */
	@ApiField("ccccc")
	private String ccccc;

	/** 
	 * xxxx
	 */
	@ApiField("dddd")
	private XXXXsdasdasd dddd;

	/** 
	 * 123
	 */
	@ApiField("qweqwe")
	private String qweqwe;

	/** 
	 * ccc
	 */
	@ApiField("sss")
	private String sss;

	public void setCcccc(String ccccc) {
		this.ccccc = ccccc;
	}
	public String getCcccc( ) {
		return this.ccccc;
	}

	public void setDddd(XXXXsdasdasd dddd) {
		this.dddd = dddd;
	}
	public XXXXsdasdasd getDddd( ) {
		return this.dddd;
	}

	public void setQweqwe(String qweqwe) {
		this.qweqwe = qweqwe;
	}
	public String getQweqwe( ) {
		return this.qweqwe;
	}

	public void setSss(String sss) {
		this.sss = sss;
	}
	public String getSss( ) {
		return this.sss;
	}

}
