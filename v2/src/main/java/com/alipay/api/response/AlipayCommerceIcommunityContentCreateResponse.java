package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.icommunity.content.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-22 16:52:24
 */
public class AlipayCommerceIcommunityContentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4598953864426567575L;

	/** 
	 * 蓝花火兴趣社区创建的内容的唯一id
	 */
	@ApiField("icommunity_content_id")
	private String icommunityContentId;

	/** 
	 * 入参中填入的外部内容唯一键
	 */
	@ApiField("out_content_id")
	private String outContentId;

	public void setIcommunityContentId(String icommunityContentId) {
		this.icommunityContentId = icommunityContentId;
	}
	public String getIcommunityContentId( ) {
		return this.icommunityContentId;
	}

	public void setOutContentId(String outContentId) {
		this.outContentId = outContentId;
	}
	public String getOutContentId( ) {
		return this.outContentId;
	}

}
