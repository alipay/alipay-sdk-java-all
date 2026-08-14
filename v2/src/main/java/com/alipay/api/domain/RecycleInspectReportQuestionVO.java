package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 质检报告问题对象
 *
 * @author auto create
 * @since 1.0, 2026-08-10 10:26:39
 */
public class RecycleInspectReportQuestionVO extends AlipayObject {

	private static final long serialVersionUID = 4331515372819137313L;

	/**
	 * 问题编码
	 */
	@ApiField("question_code")
	private String questionCode;

	/**
	 * 问卷名称
	 */
	@ApiField("question_name")
	private String questionName;

	/**
	 * 问题类型
	 */
	@ApiField("question_type")
	private String questionType;

	/**
	 * 质检报告问题答案列表
	 */
	@ApiListField("report_answer_list")
	@ApiField("recycle_inspect_report_answer_v_o")
	private List<RecycleInspectReportAnswerVO> reportAnswerList;

	/**
	 * 问卷类型
	 */
	@ApiField("template_type")
	private String templateType;

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

	public String getQuestionType() {
		return this.questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public List<RecycleInspectReportAnswerVO> getReportAnswerList() {
		return this.reportAnswerList;
	}
	public void setReportAnswerList(List<RecycleInspectReportAnswerVO> reportAnswerList) {
		this.reportAnswerList = reportAnswerList;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

}
