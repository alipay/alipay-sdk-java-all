package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.iot.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 16:16:36
 */
public class AlipayMerchantIndirectIotQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1824188719139954172L;

	/** 
	 * 内容id，不同物联网平台值类型不一样
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 固定枚举值（阿里云物联网平台：ALIYUN，支付宝物联网平台：SDK）
	 */
	@ApiField("content_type")
	private String contentType;

	/** 
	 * 营销文案
	 */
	@ApiField("text")
	private String text;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContentType( ) {
		return this.contentType;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getText( ) {
		return this.text;
	}

}
