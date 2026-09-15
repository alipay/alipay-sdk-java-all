package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-27 09:48:04
 */
public class SyllabusStructuredCreateVO extends AlipayObject {

	private static final long serialVersionUID = 1692745117511738338L;

	/**
	 * 章节
	 */
	@ApiField("chapter")
	private String chapter;

	/**
	 * null
	 */
	@ApiListField("sections")
	@ApiField("string")
	private List<String> sections;

	public String getChapter() {
		return this.chapter;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public List<String> getSections() {
		return this.sections;
	}
	public void setSections(List<String> sections) {
		this.sections = sections;
	}

}
