package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.script.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:08
 */
public class AlipayCommerceCityfacilitatorScriptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7374279682755629928L;

	/** 
	 * 脚本内容，智能卡中心自定义的脚本格式内容
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 脚本更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

}
