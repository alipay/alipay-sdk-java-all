package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Category;
import com.alipay.api.domain.SpiOutputObject;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tessssssssssst.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:06:32
 */
public class KoubeiMarketingTessssssssssstQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6254791283558712183L;

	/** 
	 * a
	 */
	@ApiField("a")
	private String a;

	/** 
	 * test
	 */
	@ApiField("category")
	private Category category;

	/** 
	 * test
	 */
	@ApiField("output")
	private SpiOutputObject output;

	public void setA(String a) {
		this.a = a;
	}
	public String getA( ) {
		return this.a;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	public Category getCategory( ) {
		return this.category;
	}

	public void setOutput(SpiOutputObject output) {
		this.output = output;
	}
	public SpiOutputObject getOutput( ) {
		return this.output;
	}

}
