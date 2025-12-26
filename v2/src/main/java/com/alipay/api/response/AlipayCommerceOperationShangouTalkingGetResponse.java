package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.shangou.talking.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-23 13:42:41
 */
public class AlipayCommerceOperationShangouTalkingGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1522259786435872558L;

	/** 
	 * 未绑定账号跳转地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/** 
	 * 智能体回复内容
	 */
	@ApiField("result_text")
	private String resultText;

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}
	public String getActionUrl( ) {
		return this.actionUrl;
	}

	public void setResultText(String resultText) {
		this.resultText = resultText;
	}
	public String getResultText( ) {
		return this.resultText;
	}

}
