package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板与元素关联关系
 *
 * @author auto create
 * @since 1.0, 2024-06-11 19:48:28
 */
public class TemplateElementLinkDTO extends AlipayObject {

	private static final long serialVersionUID = 4633241773293447241L;

	/**
	 * 组件内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 创建人名字
	 */
	@ApiField("creator_name")
	private String creatorName;

	/**
	 * 创建人工号
	 */
	@ApiField("creator_no")
	private String creatorNo;

	/**
	 * 组件编码
	 */
	@ApiField("element_code")
	private String elementCode;

	/**
	 * 组件展示名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 组件排行
	 */
	@ApiField("sort_value")
	private Long sortValue;

	/**
	 * 模板编码
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 模板版本
	 */
	@ApiField("template_version")
	private String templateVersion;

	/**
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 组件类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 组件唯一标识
	 */
	@ApiField("uk")
	private String uk;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getCreatorName() {
		return this.creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getCreatorNo() {
		return this.creatorNo;
	}
	public void setCreatorNo(String creatorNo) {
		this.creatorNo = creatorNo;
	}

	public String getElementCode() {
		return this.elementCode;
	}
	public void setElementCode(String elementCode) {
		this.elementCode = elementCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getSortValue() {
		return this.sortValue;
	}
	public void setSortValue(Long sortValue) {
		this.sortValue = sortValue;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUk() {
		return this.uk;
	}
	public void setUk(String uk) {
		this.uk = uk;
	}

}
