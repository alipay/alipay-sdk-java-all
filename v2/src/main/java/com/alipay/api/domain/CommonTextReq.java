package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 百灵文案子参数
 *
 * @author auto create
 * @since 1.0, 2026-03-24 14:10:08
 */
public class CommonTextReq extends AlipayObject {

	private static final long serialVersionUID = 1126163543683465631L;

	/**
	 * 是一个List<Body>
	 */
	@ApiListField("language_list")
	@ApiField("text_language_req")
	private List<TextLanguageReq> languageList;

	/**
	 * 备注
	 */
	@ApiField("note")
	private String note;

	/**
	 * 标签列表
	 */
	@ApiListField("tag_list")
	@ApiField("string")
	private List<String> tagList;

	/**
	 * 文案 key
	 */
	@ApiField("text_key")
	private String textKey;

	public List<TextLanguageReq> getLanguageList() {
		return this.languageList;
	}
	public void setLanguageList(List<TextLanguageReq> languageList) {
		this.languageList = languageList;
	}

	public String getNote() {
		return this.note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public List<String> getTagList() {
		return this.tagList;
	}
	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	public String getTextKey() {
		return this.textKey;
	}
	public void setTextKey(String textKey) {
		this.textKey = textKey;
	}

}
