package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询百灵获取文案的返回值实体
 *
 * @author auto create
 * @since 1.0, 2026-03-24 14:10:21
 */
public class FindTextDTO extends AlipayObject {

	private static final long serialVersionUID = 8293513826372861782L;

	/**
	 * 文案内容列表
	 */
	@ApiListField("language_list")
	@ApiField("text_language_d_t_o")
	private List<TextLanguageDTO> languageList;

	/**
	 * 文案key
	 */
	@ApiField("text_key")
	private String textKey;

	public List<TextLanguageDTO> getLanguageList() {
		return this.languageList;
	}
	public void setLanguageList(List<TextLanguageDTO> languageList) {
		this.languageList = languageList;
	}

	public String getTextKey() {
		return this.textKey;
	}
	public void setTextKey(String textKey) {
		this.textKey = textKey;
	}

}
