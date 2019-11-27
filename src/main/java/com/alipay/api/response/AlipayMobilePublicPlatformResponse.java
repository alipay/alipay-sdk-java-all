package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.platform response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicPlatformResponse extends AlipayResponse {

	private static final long serialVersionUID = 8432336954949466692L;

	/** 
	 * 响应内容
	 */
	@ApiListField("res_content")
	@ApiField("string")
	private List<String> resContent;

	public void setResContent(List<String> resContent) {
		this.resContent = resContent;
	}
	public List<String> getResContent( ) {
		return this.resContent;
	}

}
