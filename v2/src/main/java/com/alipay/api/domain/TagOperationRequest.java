package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标签操作请求对象
 *
 * @author auto create
 * @since 1.0, 2023-10-16 16:43:43
 */
public class TagOperationRequest extends AlipayObject {

	private static final long serialVersionUID = 8762882811577665888L;

	/**
	 * 标签所属表的key
	 */
	@ApiField("domain_table_key")
	private String domainTableKey;

	/**
	 * 标识是打标操作还是去标操作
	 */
	@ApiField("operation_code")
	private String operationCode;

	/**
	 * 操作人工号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 被打标的资源ID
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 标签值的key
	 */
	@ApiListField("tag_api_name_list")
	@ApiField("string")
	private List<String> tagApiNameList;

	public String getDomainTableKey() {
		return this.domainTableKey;
	}
	public void setDomainTableKey(String domainTableKey) {
		this.domainTableKey = domainTableKey;
	}

	public String getOperationCode() {
		return this.operationCode;
	}
	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public List<String> getTagApiNameList() {
		return this.tagApiNameList;
	}
	public void setTagApiNameList(List<String> tagApiNameList) {
		this.tagApiNameList = tagApiNameList;
	}

}
