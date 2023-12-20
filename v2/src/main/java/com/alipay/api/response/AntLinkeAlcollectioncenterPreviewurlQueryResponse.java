package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.linke.alcollectioncenter.previewurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:11:55
 */
public class AntLinkeAlcollectioncenterPreviewurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8784838323239333637L;

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
