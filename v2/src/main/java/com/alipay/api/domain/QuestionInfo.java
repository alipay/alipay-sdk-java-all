package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 热门问题信息
 *
 * @author auto create
 * @since 1.0, 2024-08-15 14:18:29
 */
public class QuestionInfo extends AlipayObject {

	private static final long serialVersionUID = 8598214642348435343L;

	/**
	 * 使用分组配置的时候才有该字段
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 机器人对话中，近30天命中次数，单位 （次）
	 */
	@ApiField("hits")
	private Long hits;

	/**
	 * 问题id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 知识库id
	 */
	@ApiField("library_id")
	private Long libraryId;

	/**
	 * 问题名称
	 */
	@ApiField("title")
	private String title;

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Long getHits() {
		return this.hits;
	}
	public void setHits(Long hits) {
		this.hits = hits;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getLibraryId() {
		return this.libraryId;
	}
	public void setLibraryId(Long libraryId) {
		this.libraryId = libraryId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
