package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.campus.jobdeliver.modify response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-03 10:59:13
 */
public class AlipayEcoEduCampusJobdeliverModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5825293867366271167L;

	/** 
	 * 备注
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 描述
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
