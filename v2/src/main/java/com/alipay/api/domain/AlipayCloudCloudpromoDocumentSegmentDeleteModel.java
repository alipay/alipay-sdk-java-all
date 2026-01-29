package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量删除数据分段
 *
 * @author auto create
 * @since 1.0, 2025-09-05 18:12:39
 */
public class AlipayCloudCloudpromoDocumentSegmentDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1554441389642188611L;

	/**
	 * API-Key
	 */
	@ApiField("api_key")
	private String apiKey;

	/**
	 * null
	 */
	@ApiListField("chunks")
	@ApiField("string")
	private List<String> chunks;

	/**
	 * 客户id

	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 要删除的分段所属应用数据ID
	 */
	@ApiField("document_id")
	private String documentId;

	/**
	 * 操作人标识
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 空间ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getApiKey() {
		return this.apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public List<String> getChunks() {
		return this.chunks;
	}
	public void setChunks(List<String> chunks) {
		this.chunks = chunks;
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
