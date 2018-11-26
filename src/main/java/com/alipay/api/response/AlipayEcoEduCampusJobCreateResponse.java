package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.campus.job.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-03 10:59:01
 */
public class AlipayEcoEduCampusJobCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2117754265324699612L;

	/** 
	 * 备注问题，或者异常
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 消息描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 返回code编码;成功返回SUCCESS
	 */
	@ApiField("isv_code")
	private String isvCode;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}
	public String getIsvCode( ) {
		return this.isvCode;
	}

}
