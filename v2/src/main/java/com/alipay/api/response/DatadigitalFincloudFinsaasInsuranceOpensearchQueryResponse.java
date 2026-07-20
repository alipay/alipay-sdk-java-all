package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenSearchDocBO;
import com.alipay.api.domain.OpenSearchImageBO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.insurance.opensearch.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 14:12:45
 */
public class DatadigitalFincloudFinsaasInsuranceOpensearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3264275887856968989L;

	/** 
	 * 调试信息
	 */
	@ApiField("debug_info")
	private String debugInfo;

	/** 
	 * RAG搜索到的文档列表
	 */
	@ApiListField("search_docs")
	@ApiField("open_search_doc_b_o")
	private List<OpenSearchDocBO> searchDocs;

	/** 
	 * 当参数contentType=llmWholeImage时，search_images字段返回
	 */
	@ApiListField("search_images")
	@ApiField("open_search_image_b_o")
	private List<OpenSearchImageBO> searchImages;

	public void setDebugInfo(String debugInfo) {
		this.debugInfo = debugInfo;
	}
	public String getDebugInfo( ) {
		return this.debugInfo;
	}

	public void setSearchDocs(List<OpenSearchDocBO> searchDocs) {
		this.searchDocs = searchDocs;
	}
	public List<OpenSearchDocBO> getSearchDocs( ) {
		return this.searchDocs;
	}

	public void setSearchImages(List<OpenSearchImageBO> searchImages) {
		this.searchImages = searchImages;
	}
	public List<OpenSearchImageBO> getSearchImages( ) {
		return this.searchImages;
	}

}
