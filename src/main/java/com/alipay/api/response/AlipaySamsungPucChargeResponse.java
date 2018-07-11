package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.samsung.puc.charge response.
 * 
 * @author auto create
 * @since 1.0, 2018-04-26 13:55:58
 */
public class AlipaySamsungPucChargeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7516391766971472368L;

	/** 
	 * zhijiefanhui yemian
	 */
	@ApiField("page_retrun")
	private String pageRetrun;

	public void setPageRetrun(String pageRetrun) {
		this.pageRetrun = pageRetrun;
	}
	public String getPageRetrun( ) {
		return this.pageRetrun;
	}

}
