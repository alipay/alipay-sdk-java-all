package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.linke.alcollectioncenter.previewurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:01:43
 */
public class AntLinkeAlcollectioncenterPreviewurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8597634319977942482L;

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
