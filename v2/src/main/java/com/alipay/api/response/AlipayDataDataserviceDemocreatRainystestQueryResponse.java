package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.democreat.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:32
 */
public class AlipayDataDataserviceDemocreatRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3521948431824736245L;

	/** 
	 * 用于跳转支付宝页面的信息，POST和GET方法生成内容不同：使用POST方法执行，结果为html form表单，在浏览器渲染即可；使用GET方法会得到支付宝URL，需要打开或重定向到该URL。建议使用POST方式。
	 */
	@ApiField("pageRedirectionData")
	private String pageRedirectionData;

	public void setPageRedirectionData(String pageRedirectionData) {
		this.pageRedirectionData = pageRedirectionData;
	}
	public String getPageRedirectionData( ) {
		return this.pageRedirectionData;
	}

}
