package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源结构
 *
 * @author auto create
 * @since 1.0, 2022-06-02 15:37:19
 */
public class ResourceRelatedItem extends AlipayObject {

	private static final long serialVersionUID = 4512527997827279418L;

	/**
	 * 请求原始URL
	 */
	@ApiField("resource_ask_url")
	private String resourceAskUrl;

	/**
	 * 资源ID
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 类型
	 */
	@ApiField("resource_type")
	private String resourceType;

	/**
	 * 资源项地址
	 */
	@ApiField("resource_url")
	private String resourceUrl;

	public String getResourceAskUrl() {
		return this.resourceAskUrl;
	}
	public void setResourceAskUrl(String resourceAskUrl) {
		this.resourceAskUrl = resourceAskUrl;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceType() {
		return this.resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceUrl() {
		return this.resourceUrl;
	}
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

}
