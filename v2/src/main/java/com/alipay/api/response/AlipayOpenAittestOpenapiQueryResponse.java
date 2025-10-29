package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.aittest.openapi.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:13:24
 */
public class AlipayOpenAittestOpenapiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6262417438763711347L;

	/** 
	 * 测试 demo 响应内容
	 */
	@ApiField("demo_content")
	private String demoContent;

	/** 
	 * 调用 demo 接口响应
	 */
	@ApiField("demo_msg")
	private String demoMsg;

	/** 
	 * ID
	 */
	@ApiField("id")
	private String id;

	public void setDemoContent(String demoContent) {
		this.demoContent = demoContent;
	}
	public String getDemoContent( ) {
		return this.demoContent;
	}

	public void setDemoMsg(String demoMsg) {
		this.demoMsg = demoMsg;
	}
	public String getDemoMsg( ) {
		return this.demoMsg;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
