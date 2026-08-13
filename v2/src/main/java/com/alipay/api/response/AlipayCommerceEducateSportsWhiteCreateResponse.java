package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sports.white.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 17:27:50
 */
public class AlipayCommerceEducateSportsWhiteCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6321784834359616556L;

	/** 
	 * null
	 */
	@ApiListField("white_code_list")
	@ApiField("string")
	private List<String> whiteCodeList;

	public void setWhiteCodeList(List<String> whiteCodeList) {
		this.whiteCodeList = whiteCodeList;
	}
	public List<String> getWhiteCodeList( ) {
		return this.whiteCodeList;
	}

}
