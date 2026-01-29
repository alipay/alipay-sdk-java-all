package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 知识库检索
 *
 * @author auto create
 * @since 1.0, 2025-09-05 17:02:39
 */
public class AlipayCloudCloudpromoKnowledgeRagGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 5287533743415424651L;

	/**
	 * 接口API-Key
	 */
	@ApiField("api_key")
	private String apiKey;

	/**
	 * 客户ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * null
	 */
	@ApiListField("options")
	@ApiField("knowledge_base_search_option")
	private List<KnowledgeBaseSearchOption> options;

	/**
	 * 查询短语
	 */
	@ApiField("query")
	private String query;

	/**
	 * 相似度阈值（以小数形式表示）
	 */
	@ApiField("similarity_threshold")
	private String similarityThreshold;

	/**
	 * 空间租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 返回结果数量（取值范围1-50）
	 */
	@ApiField("top_k")
	private Long topK;

	public String getApiKey() {
		return this.apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<KnowledgeBaseSearchOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<KnowledgeBaseSearchOption> options) {
		this.options = options;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getSimilarityThreshold() {
		return this.similarityThreshold;
	}
	public void setSimilarityThreshold(String similarityThreshold) {
		this.similarityThreshold = similarityThreshold;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public Long getTopK() {
		return this.topK;
	}
	public void setTopK(Long topK) {
		this.topK = topK;
	}

}
