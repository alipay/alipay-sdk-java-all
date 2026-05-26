package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 词条信息
 *
 * @author auto create
 * @since 1.0, 2026-04-16 17:47:45
 */
public class Term extends AlipayObject {

	private static final long serialVersionUID = 6647975974952455438L;

	/**
	 * null
	 */
	@ApiListField("faculty_list")
	@ApiField("faculty")
	private List<Faculty> facultyList;

	/**
	 * 词条拼音
	 */
	@ApiField("pinyin")
	private String pinyin;

	/**
	 * 词条同义词
	 */
	@ApiField("synonyms")
	private String synonyms;

	/**
	 * 词条ID
	 */
	@ApiField("term_id")
	private String termId;

	/**
	 * 词条名称
	 */
	@ApiField("term_name")
	private String termName;

	/**
	 * 词条类型
	 */
	@ApiField("type")
	private String type;

	public List<Faculty> getFacultyList() {
		return this.facultyList;
	}
	public void setFacultyList(List<Faculty> facultyList) {
		this.facultyList = facultyList;
	}

	public String getPinyin() {
		return this.pinyin;
	}
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getSynonyms() {
		return this.synonyms;
	}
	public void setSynonyms(String synonyms) {
		this.synonyms = synonyms;
	}

	public String getTermId() {
		return this.termId;
	}
	public void setTermId(String termId) {
		this.termId = termId;
	}

	public String getTermName() {
		return this.termName;
	}
	public void setTermName(String termName) {
		this.termName = termName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
