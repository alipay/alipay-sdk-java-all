package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推荐提问
 *
 * @author auto create
 * @since 1.0, 2024-08-15 12:07:16
 */
public class SuggestQuestionsDTO extends AlipayObject {

	private static final long serialVersionUID = 5638334821513726616L;

	/**
	 * 推荐问题列表
	 */
	@ApiListField("list")
	@ApiField("string")
	private List<String> list;

	/**
	 * 推荐问题标题
	 */
	@ApiField("title")
	private String title;

	public List<String> getList() {
		return this.list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
