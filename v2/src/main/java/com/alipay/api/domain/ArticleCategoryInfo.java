package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文章类目信息
 *
 * @author auto create
 * @since 1.0, 2021-01-06 19:42:58
 */
public class ArticleCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 6374168453696413392L;

	/**
	 * 子节点
	 */
	@ApiListField("children")
	@ApiField("string")
	private List<String> children;

	/**
	 * 节点描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 父节点ID
	 */
	@ApiField("father_id")
	private Long fatherId;

	/**
	 * 类目ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 节点名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 标签
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	public List<String> getChildren() {
		return this.children;
	}
	public void setChildren(List<String> children) {
		this.children = children;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getFatherId() {
		return this.fatherId;
	}
	public void setFatherId(Long fatherId) {
		this.fatherId = fatherId;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
