package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 知识库-问答-修改
 *
 * @author auto create
 * @since 1.0, 2022-10-26 14:59:12
 */
public class AlipayIserviceCcmSwArticleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4662499422758355976L;

	/**
	 * 所属类目ID，如果search_all_category为true则不用填
	 */
	@ApiField("category_id")
	private Long categoryId;

	/**
	 * 子部门ID，不传为默认部门
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展标题
	 */
	@ApiListField("extend_titles")
	@ApiField("string")
	private List<String> extendTitles;

	/**
	 * 文章ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 标签
	 */
	@ApiListField("keywords")
	@ApiField("string")
	private List<String> keywords;

	/**
	 * 场景ID。1（内部知识库）；2（机器人）;3（帮助中心）；4（无线帮助中心）
	 */
	@ApiListField("scene_codes")
	@ApiField("string")
	private List<String> sceneCodes;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public Long getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getExtendTitles() {
		return this.extendTitles;
	}
	public void setExtendTitles(List<String> extendTitles) {
		this.extendTitles = extendTitles;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getKeywords() {
		return this.keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public List<String> getSceneCodes() {
		return this.sceneCodes;
	}
	public void setSceneCodes(List<String> sceneCodes) {
		this.sceneCodes = sceneCodes;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
