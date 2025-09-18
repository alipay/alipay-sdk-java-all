package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 知识库移除应用数据关联
 *
 * @author auto create
 * @since 1.0, 2025-08-20 17:52:36
 */
public class AlipayCloudCloudpromoKnowledgeDocumentUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 5496449883425514648L;

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
	 * 知识库ID
	 */
	@ApiField("knowledge_base_id")
	private String knowledgeBaseId;

	/**
	 * 操作人
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
