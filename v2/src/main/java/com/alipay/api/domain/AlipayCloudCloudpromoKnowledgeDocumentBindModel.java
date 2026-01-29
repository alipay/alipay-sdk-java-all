package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 知识库添加应用数据关联
 *
 * @author auto create
 * @since 1.0, 2025-08-20 17:52:36
 */
public class AlipayCloudCloudpromoKnowledgeDocumentBindModel extends AlipayObject {

	private static final long serialVersionUID = 1137868571161684119L;

	/**
	 * 接口api
	 */
	@ApiField("api_key")
	private String apiKey;

	/**
	 * 客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 应用数据ID
	 */
	@ApiField("document_id")
	private String documentId;

	/**
	 * null
	 */
	@ApiListField("index_columns")
	@ApiField("string")
	private List<String> indexColumns;

	/**
	 * 知识库ID，可选，为空者创建知识库
	 */
	@ApiField("knowledge_base_id")
	private String knowledgeBaseId;

	/**
	 * 操作人标识
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 空间id
	 */
	@ApiField("tenant_id")
	private String tenantId;

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

	public String getDocumentId() {
		return this.documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public List<String> getIndexColumns() {
		return this.indexColumns;
	}
	public void setIndexColumns(List<String> indexColumns) {
		this.indexColumns = indexColumns;
	}

	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}
	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
