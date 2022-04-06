package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.searchcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-03 16:25:00
 */
public class AlipayMarketingSearchcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4495567359353528558L;

	/** 
	 * 搜索码后边拼接的文案
	 */
	@ApiField("end_content")
	private String endContent;

	/** 
	 * box搜索品牌词
	 */
	@ApiField("keywords")
	private String keywords;

	/** 
	 * 搜索口令前边拼接文案
	 */
	@ApiField("pre_content")
	private String preContent;

	/** 
	 * 搜索口令值
	 */
	@ApiField("search_code")
	private String searchCode;

	public void setEndContent(String endContent) {
		this.endContent = endContent;
	}
	public String getEndContent( ) {
		return this.endContent;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getKeywords( ) {
		return this.keywords;
	}

	public void setPreContent(String preContent) {
		this.preContent = preContent;
	}
	public String getPreContent( ) {
		return this.preContent;
	}

	public void setSearchCode(String searchCode) {
		this.searchCode = searchCode;
	}
	public String getSearchCode( ) {
		return this.searchCode;
	}

}
