package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收问卷
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:25:33
 */
public class RecycleQuetion extends AlipayObject {

	private static final long serialVersionUID = 3863464662946756387L;

	/**
	 * 问卷选项列表
	 */
	@ApiListField("options")
	@ApiField("recycle_option")
	private List<RecycleOption> options;

	/**
	 * 问题code
	 */
	@ApiField("question_code")
	private String questionCode;

	/**
	 * 回收问卷名称
	 */
	@ApiField("question_name")
	private String questionName;

	public List<RecycleOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<RecycleOption> options) {
		this.options = options;
	}

	public String getQuestionCode() {
		return this.questionCode;
	}
	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}

	public String getQuestionName() {
		return this.questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

}
