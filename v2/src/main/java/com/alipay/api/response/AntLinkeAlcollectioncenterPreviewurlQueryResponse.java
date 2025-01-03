package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.linke.alcollectioncenter.previewurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-15 17:46:59
 */
public class AntLinkeAlcollectioncenterPreviewurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4529752614883237745L;

	/** 
	 * 预览链接
	 */
	@ApiListField("urls")
	@ApiField("string")
	private List<String> urls;

	public void setUrls(List<String> urls) {
		this.urls = urls;
	}
	public List<String> getUrls( ) {
		return this.urls;
	}

}
