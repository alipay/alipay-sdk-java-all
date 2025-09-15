package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 历史提问和回答
 *
 * @author auto create
 * @since 1.0, 2025-05-22 17:53:35
 */
public class HistoryQueryAndAnswer extends AlipayObject {

	private static final long serialVersionUID = 5111377215641897179L;

	/**
	 * 历史回答
	 */
	@ApiField("answer")
	private String answer;

	/**
	 * 历史提问
	 */
	@ApiField("query")
	private String query;

	public String getAnswer() {
		return this.answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

}
