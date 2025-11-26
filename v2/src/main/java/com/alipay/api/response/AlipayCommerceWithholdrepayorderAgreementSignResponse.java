package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.withholdrepayorder.agreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-19 13:45:26
 */
public class AlipayCommerceWithholdrepayorderAgreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 5518581768526143198L;

	/** 
	 * 用于跳转支付宝页面的信息，POST和GET方法生成内容不同：使用POST方法执行，结果为html form表单，在浏览器渲染即可；使用GET方法会得到支付宝URL，需要打开或重定向到该URL。建议使用POST方式。
	 */
	@ApiField("page_redirection_data")
	private String pageRedirectionData;

	/** 
	 * 所生成的签约跳转链接的短链接
	 */
	@ApiField("shortened_page_redirection_url")
	private String shortenedPageRedirectionUrl;

	public void setPageRedirectionData(String pageRedirectionData) {
		this.pageRedirectionData = pageRedirectionData;
	}
	public String getPageRedirectionData( ) {
		return this.pageRedirectionData;
	}

	public void setShortenedPageRedirectionUrl(String shortenedPageRedirectionUrl) {
		this.shortenedPageRedirectionUrl = shortenedPageRedirectionUrl;
	}
	public String getShortenedPageRedirectionUrl( ) {
		return this.shortenedPageRedirectionUrl;
	}

}
