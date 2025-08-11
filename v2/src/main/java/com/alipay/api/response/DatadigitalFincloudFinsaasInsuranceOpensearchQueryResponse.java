package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenSearchDocBO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.insurance.opensearch.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-24 21:32:33
 */
public class DatadigitalFincloudFinsaasInsuranceOpensearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7329555446657696934L;

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

}
